package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Announcement;
import model.Event;
import model.Profile;

public interface IAnnouncementRepo extends JpaRepository<Announcement, Long> {
	
	// most recent first, for the homepage feed
		List<Announcement> findAllByOrderByPostedDateDesc();
	 
		// announcements tied to a specific event
		List<Announcement> findByEvent(Event event);
	 
		// general announcements (not linked to any event)
		List<Announcement> findByEventIsNullOrderByPostedDateDesc();
	 
		List<Announcement> findByProfile(Profile profile);

}
