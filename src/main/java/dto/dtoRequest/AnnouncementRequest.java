package dto.dtoRequest;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AnnouncementRequest(
		@NotBlank(message = "Veillez entrer le titre de l'annonce")
	    String title,

	    @NotBlank(message = "Veillez entrer le contenu")
	    @Size(max = 2000)
	    String content,

	    // Announcement can be general or tied to event
	    Long eventId) {

}
