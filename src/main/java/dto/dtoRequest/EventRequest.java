package dto.dtoRequest;
 
import java.time.LocalDate;
import java.time.LocalTime;
 
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
 

public class EventRequest {
 
	@NotBlank(message = "Veillez entrer le titre de l'événement")
	private String title;
 
	@NotBlank(message = "Veillez entrer la description de l'événement")
	private String description;
 
	@NotNull(message = "Veillez indiquer la date de l'événement")
	@Future(message = "La date de l'événement doit être dans le futur")
	private LocalDate eventDate;
 
	@NotNull(message = "Veillez indiquer l'heure de l'événement")
	private LocalTime eventTime;
 
	@NotBlank(message = "Veillez entrer le lieu de l'événement")
	private String location;
 
	@Min(value = 3, message = "La capacité doit être supérieure ou égale à 3")
	private int capacity;
 
	// getters and setters
 
	public String getTitle() {
		return title;
	}
 
	public void setTitle(String title) {
		this.title = title;
	}
 
	public String getDescription() {
		return description;
	}
 
	public void setDescription(String description) {
		this.description = description;
	}
 
	public LocalDate getEventDate() {
		return eventDate;
	}
 
	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}
 
	public LocalTime getEventTime() {
		return eventTime;
	}
 
	public void setEventTime(LocalTime eventTime) {
		this.eventTime = eventTime;
	}
 
	public String getLocation() {
		return location;
	}
 
	public void setLocation(String location) {
		this.location = location;
	}
 
	public int getCapacity() {
		return capacity;
	}
 
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
 
	// no arg constructor
	public EventRequest() {}
	
	public EventRequest(String title, String description, LocalDate eventDate, LocalTime eventTime,
			String location, int capacity) {
		this.title = title;
		this.description = description;
		this.eventDate = eventDate;
		this.eventTime = eventTime;
		this.location = location;
		this.capacity = capacity;
	}
}
 