package dtoResponse;

import model.UserRole;

public record UserResponse(
		int userId,
	    String userName,
	    String email,
	    UserRole role) {

}
