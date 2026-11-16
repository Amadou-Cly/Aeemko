package dto.dtoRequest;
 
import jakarta.validation.constraints.NotBlank;
 
public class AnnouncementRequest {
 
	@NotBlank(message = "Veillez entrer le titre de l'annonce")
	private String title;
 
	@NotBlank(message = "Veillez entrer le contenu de l'annonce")
	private String content;
 
	// Not an obligation so it must be null and in that case it is general not tied to event
	private Long eventId;
 
	// getters and setters
 
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
 
	public Long getEventId() {
		return eventId;
	}
 
	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
 
	// arg and no arg constructors (the no arg one is required for form binding)
	public AnnouncementRequest() {}
	public AnnouncementRequest(String title, String content, Long eventId) {
		this.title = title;
		this.content = content;
		this.eventId = eventId;
	}
}
 
