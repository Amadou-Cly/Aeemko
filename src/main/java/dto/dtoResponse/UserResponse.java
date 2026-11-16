package dto.dtoResponse;
 
import model.UserRole;
 
public class UserResponse {
 
	private long id;
	private String userName;
	private String email;
	private UserRole role;
 
	// getters
 
	public long getId() {
		return id;
	}
 
	public String getUserName() {
		return userName;
	}
 
	public String getEmail() {
		return email;
	}
 
	public UserRole getRole() {
		return role;
	}
 
	// arg constructor
	public UserResponse(long id, String userName, String email, UserRole role) {
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.role = role;
	}
}
 