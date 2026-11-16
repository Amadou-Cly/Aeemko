package dto.dtoRequest;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EventRequest(
		@NotBlank(message = "Veillez entrer le titre de l'événement")
	    String title,

	    @NotBlank(message = "Veillez entrer la description")
	    String description,

	    @NotNull(message = "Veillez indiquer la date")
	    LocalDate eventDate,

	    @NotNull(message = "Veillez indiquer l'heure")
	    LocalTime eventTime,

	    @NotBlank(message = "Veillez entrer le lieu")
	    String location) {

}
