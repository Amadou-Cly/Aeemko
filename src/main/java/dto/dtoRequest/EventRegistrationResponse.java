package dto.dtoRequest;

import java.time.LocalDateTime;

import model.RegistStatus;

public record EventRegistrationResponse(
		 long registrationId,
		 long profileId,
		 long eventId,
		 LocalDateTime registrationDate,
		 RegistStatus status) {

}
