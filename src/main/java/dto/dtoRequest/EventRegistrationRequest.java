package dto.dtoRequest;
 
import jakarta.validation.constraints.NotNull;
 
public class EventRegistrationRequest {
 
	@NotNull(message = "Veillez indiquer l'événement")
	private Long eventId;
 
	// getter and setter
 
	public Long getEventId() {
		return eventId;
	}
 
	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
 
	// arg and no arg constructors
	public EventRegistrationRequest() {}
	public EventRegistrationRequest(Long eventId) {
		this.eventId = eventId;
	}
}
 