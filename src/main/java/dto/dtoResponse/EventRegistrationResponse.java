
package dto.dtoResponse;
 
import java.time.LocalDate;
import java.time.LocalDateTime;
 
import model.RegistStatus;
 
// RESPONSE: one row of "my registrations" or the attendee list of an event.
// Flattens Profile and Event into the few values the page actually displays.
public class EventRegistrationResponse {
 
	private long registrationId;
	private long eventId;
	private String eventTitle;
	private LocalDate eventDate;
	private String attendeeName;
	private RegistStatus status;
	private LocalDateTime registrationDate;
 
	// getters
 
	public long getRegistrationId() {
		return registrationId;
	}
 
	public long getEventId() {
		return eventId;
	}
 
	public String getEventTitle() {
		return eventTitle;
	}
 
	public LocalDate getEventDate() {
		return eventDate;
	}
 
	public String getAttendeeName() {
		return attendeeName;
	}
 
	public RegistStatus getStatus() {
		return status;
	}
 
	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}
 
	// arg constructor
	public EventRegistrationResponse(long registrationId, long eventId, String eventTitle, LocalDate eventDate,
			String attendeeName, RegistStatus status, LocalDateTime registrationDate) {
		this.registrationId = registrationId;
		this.eventId = eventId;
		this.eventTitle = eventTitle;
		this.eventDate = eventDate;
		this.attendeeName = attendeeName;
		this.status = status;
		this.registrationDate = registrationDate;
	}
}
 