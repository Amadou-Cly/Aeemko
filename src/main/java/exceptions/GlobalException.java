package exceptions;
 
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
 
// Safety net: any of these exceptions that a controller does not catch itself
// ends up here and is shown on templates/error/error.html.
@ControllerAdvice
public class GlobalException {
 
	// 404: the requested entity does not exist
	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handleNotFound(ResourceNotFoundException exception, Model model) {
		model.addAttribute("status", 404);
		model.addAttribute("title", "Introuvable");
		model.addAttribute("message", exception.getMessage());
		return "error-page";
	}
 
	// 400: a business rule was broken (duplicate, event full, password mismatch...)
	@ExceptionHandler(BusinessException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String handleBusiness(BusinessException exception, Model model) {
		model.addAttribute("status", 400);
		model.addAttribute("title", "Opération impossible");
		model.addAttribute("message", exception.getMessage());
		return "error-page"; 
	}
}
 