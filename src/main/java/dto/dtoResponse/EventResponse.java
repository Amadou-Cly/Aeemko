package dto.dtoResponse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public record EventResponse(

	    long eventId,
	    String title,
	    String description,
	    LocalDate eventDate,
	    LocalTime eventTime,
	    String location,
	    LocalDateTime createdAt,
	    long profileId) {

}
