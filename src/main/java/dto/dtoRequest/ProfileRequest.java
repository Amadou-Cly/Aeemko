package dtoRequest;

import java.time.LocalDate;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import model.Activity;
import model.Address;

public record ProfileRequest(

	    @NotBlank(message = "Veillez entrer votre prénom")
	    String firstName,

	    @NotBlank(message = "Veillez entrer votre nom")
	    String lastName,

	    @NotNull(message = "Veillez entrer votre date de naissance")
	    @Past
	    LocalDate birthDate,

	    @NotBlank(message = "Veillez entrer votre numéro de téléphone")
	    String phoneNum,

	    @NotBlank(message = "Veillez entrer un numéro d'urgence")
	    String emergenceNum,

	    @NotNull(message = "Veillez indiquer votre activité")
	    Activity activity,

	    @NotNull(message = "Veillez entrer votre adresse")
	    @Valid
	    Address address,

	    @NotBlank
	    String city,

	    @NotBlank
	    String country) {

}
