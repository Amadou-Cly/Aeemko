
package dto.dtoResponse;
 
import model.Activity;
import model.Position;
import model.Status;
 
public class ProfileResponse {
 
	private long profileId;
	private String fullName;
	private Position position;
	private Activity activity;
	private Status status;
	private String city;
	private String country;
	private boolean active;
 
	// getters
 
	public long getProfileId() {
		return profileId;
	}
 
	public String getFullName() {
		return fullName;
	}
 
	public Position getPosition() {
		return position;
	}
 
	public Activity getActivity() {
		return activity;
	}
 
	public Status getStatus() {
		return status;
	}
 
	public String getCity() {
		return city;
	}
 
	public String getCountry() {
		return country;
	}
 
	public boolean isActive() {
		return active;
	}
 
	// arg constructor
	public ProfileResponse(long profileId, String fullName, Position position, Activity activity,
			Status status, String city, String country, boolean active) {
		this.profileId = profileId;
		this.fullName = fullName;
		this.position = position;
		this.activity = activity;
		this.status = status;
		this.city = city;
		this.country = country;
		this.active = active;
	}
}
 