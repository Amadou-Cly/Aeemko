
package dto.dtoRequest;
 
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
 
public class UserRegistrationRequest {
 
	@NotBlank(message = "Veillez entrer le nom d'utilisateur!")
	@Pattern(regexp = "[A-Za-z0-9]{3,15}",
			message = "Le nom d'utilisateur doit contenir de 3 à 15 caractères")
	private String userName;
 
	@NotBlank(message = "L'email ne doit pas être vide!")
	@Email(message = "L'email est incorrect")
	private String email;
 
	// raw password: validated here, then hashed in the service before saving
	@NotBlank(message = "Veillez entrer votre mot de passe!")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
			message = "Le mot de passe doit contenir au moins 8 caractères, une majuscule, "
					+ "une minuscule, un chiffre et un caractère spécial!")
	private String password;
 
	//confirmation
	@NotBlank(message = "Veillez confirmer votre mot de passe!")
	private String confirmPassword;
 
	// getters and setters
 
	public String getUserName() {
		return userName;
	}
 
	public void setUserName(String userName) {
		this.userName = userName;
	}
 
	public String getEmail() {
		return email;
	}
 
	public void setEmail(String email) {
		this.email = email;
	}
 
	public String getPassword() {
		return password;
	}
 
	public void setPassword(String password) {
		this.password = password;
	}
 
	public String getConfirmPassword() {
		return confirmPassword;
	}
 
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
 
	// arg and no arg constructors
	public UserRegistrationRequest() {}
	public UserRegistrationRequest(String userName, String email, String password, String confirmPassword) {
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
}
 