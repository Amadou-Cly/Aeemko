package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "event")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "event_id")
	private long eventId;

	@NotBlank(message = "Veillez entrer le titre de l'événement")
	@Column(name = "title")
	private String title;

	@NotBlank(message = "Veillez entrer la description de l'événement")
	@Column(name = "description", length = 1000)
	private String description;

	@NotNull(message = "Veillez indiquer la date de l'événement")
	@Future(message = "La date de l'événement doit être dans le futur")
	@Column(name = "event_date")
	private LocalDate eventDate;

	@NotNull(message = "Veillez indiquer l'heure de l'événement")
	@Column(name = "event_time")
	private LocalTime eventTime;

	@NotBlank(message = "Veillez entrer le lieu de l'événement")
	@Column(name = "location")
	private String location;
	
	@Min(value = 3, message = "La capacité doit être supérieure à 3")
	@Column(name = "capacity")
	private int capacity;

	@Column(name = "created_at")
	private LocalDateTime createdAt;

	// Database connection - the profile who organizes this event
	@ManyToOne
	@JoinColumn(name = "profile_id")
	private Profile profile;
	
	@OneToMany(mappedBy = "event")
	private List<EventRegistration> registrations = new ArrayList<>();

	@PrePersist
	protected void onCreate() {
		this.createdAt = LocalDateTime.now();
	}

	// getters and setters

	public long getEventId() {
		return eventId;
	}

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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	// arg and no arg constructors
	public Event() {}
	public Event(String title, String description, LocalDate eventDate, LocalTime eventTime,
			String location, Profile profile) {
		this.title = title;
		this.description = description;
		this.eventDate = eventDate;
		this.eventTime = eventTime;
		this.location = location;
		this.profile = profile;
	}

	// toString
	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", title=" + title + ", description=" + description
				+ ", eventDate=" + eventDate + ", eventTime=" + eventTime + ", location=" + location
				+ ", createdAt=" + createdAt + "]";
	}
}
