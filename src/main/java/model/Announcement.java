package model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "announcement")
public class Announcement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "announcement_id")
	private long announcementId;

	@NotBlank(message = "Veillez entrer le titre de l'annonce")
	@Column(name = "title")
	private String title;

	@NotBlank(message = "Veillez entrer le contenu de l'annonce")
	@Column(name = "content", length = 2000)
	private String content;

	@Column(name = "posted_date")
	private LocalDateTime postedDate;

	// Database connection - who posted the announcement
	@ManyToOne
	@JoinColumn(name = "profile_id", nullable = false)
	private Profile profile;

	// optional link - an announcement can be about a specific event, or general (null)
	@ManyToOne
	@JoinColumn(name = "event_id")
	private Event event;

	@PrePersist
	protected void onCreate() {
		this.postedDate = LocalDateTime.now();
	}

	// getters and setters

	public long getAnnouncementId() {
		return announcementId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getPostedDate() {
		return postedDate;
	}

	public Profile getProfile() {
		return profile;
	}
	
	
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	// arg and no arg constructors
	public Announcement() {}
	public Announcement(String title, String content, Profile profile, Event event) {
		this.title = title;
		this.content = content;
		this.profile = profile;
		this.event = event;
	}

	// toString
	@Override
	public String toString() {
		return "Announcement [announcementId=" + announcementId + ", title=" + title + ", content=" + content
				+ ", postedDate=" + postedDate + "]";
	}
}