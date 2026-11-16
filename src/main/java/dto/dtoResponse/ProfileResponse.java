package dtoResponse;

import java.time.LocalDate;

import model.Activity;
import model.Address;
import model.Position;
import model.Status;

public record ProfileResponse(

	    long profileId,
	    String firstName,
	    String lastName,
	    LocalDate birthDate,
	    Activity activity,
	    Position position,
	    Address address,
	    String city,
	    String country,
	    Status status,
	    boolean isActive) {

}
