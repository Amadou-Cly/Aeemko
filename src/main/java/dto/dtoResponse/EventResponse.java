
package dto.dtoResponse;
 
import java.time.LocalDate;
import java.time.LocalTime;
 
// RESPONSE: what the events page shows.
// The organizer is exposed only as a name (String), never as the Profile entity.
public class EventResponse {
 
	private long eventId;
	private String title;
	private String description;
	private LocalDate eventDate;
	private LocalTime eventTime;
	private String location;
	private int capacity;
	private String organizerName;
 
	// getters
 
	public long getEventId() {
		return eventId;
	}
 
	public String getTitle() {
		return title;
	}
 
	public String getDescription() {
		return description;
	}
 
	public LocalDate getEventDate() {
		return eventDate;
	}
 
	public LocalTime getEventTime() {
		return eventTime;
	}
 
	public String getLocation() {
		return location;
	}
 
	public int getCapacity() {
		return capacity;
	}
 
	public String getOrganizerName() {
		return organizerName;
	}
 
	// arg constructor
	public EventResponse(long eventId, String title, String description, LocalDate eventDate,
			LocalTime eventTime, String location, int capacity, String organizerName) {
		this.eventId = eventId;
		this.title = title;
		this.description = description;
		this.eventDate = eventDate;
		this.eventTime = eventTime;
		this.location = location;
		this.capacity = capacity;
		this.organizerName = organizerName;
	}
}
 