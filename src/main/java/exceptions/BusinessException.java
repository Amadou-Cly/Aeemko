package exceptions;

public class BusinessException extends RuntimeException{

 
// Parent of all "the request is valid but breaks a business rule" errors
// (duplicate email, event full, passwords not matching...).
// Having a common parent lets one handler catch all of them.
 
	private static final long serialVersionUID = 1L;
 
	public BusinessException(String message) {
		super(message);
	}
}
