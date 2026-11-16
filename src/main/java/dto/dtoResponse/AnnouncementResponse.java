package dto.dtoResponse;
 
import java.time.LocalDateTime;
 
public class AnnouncementResponse {
 
	private long announcementId;
	private String title;
	private String content;
	private LocalDateTime postedDate;
	private String authorName;
	private Long eventId;       // null for a general announcement
	private String eventTitle;  // null for a general announcement
 
	// getters
 
	public long getAnnouncementId() {
		return announcementId;
	}
 
	public String getTitle() {
		return title;
	}
 
	public String getContent() {
		return content;
	}
 
	public LocalDateTime getPostedDate() {
		return postedDate;
	}
 
	public String getAuthorName() {
		return authorName;
	}
 
	public Long getEventId() {
		return eventId;
	}
 
	public String getEventTitle() {
		return eventTitle;
	}
 
	// arg constructor
	public AnnouncementResponse(long announcementId, String title, String content, LocalDateTime postedDate,
			String authorName, Long eventId, String eventTitle) {
		this.announcementId = announcementId;
		this.title = title;
		this.content = content;
		this.postedDate = postedDate;
		this.authorName = authorName;
		this.eventId = eventId;
		this.eventTitle = eventTitle;
	}
}
 