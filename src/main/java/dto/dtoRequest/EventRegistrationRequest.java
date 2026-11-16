package dtoRequest;

import jakarta.validation.constraints.NotNull;

public record EventRegistrationRequest(
		 @NotNull(message = "Veillez indiquer l'événement")
		    Long eventId) {

}
