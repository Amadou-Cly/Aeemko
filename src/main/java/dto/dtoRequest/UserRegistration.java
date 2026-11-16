package dto.dtoRequest;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record UserRegistration(
		 @NotBlank(message = "Veillez entrer le nom d'utilisateur")
		    String userName,

		    @NotBlank(message = "Veillez entrer votre email")
		    @Email(message = "L'email est incorrect")
		    String email,

		    @NotBlank(message = "Veillez entrer votre mot de passe")
		    @Pattern(
		        regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
		        message = "Le mot de passe doit contenir au moins 8 caractères"
		    )
		    String password

		)  {

}
