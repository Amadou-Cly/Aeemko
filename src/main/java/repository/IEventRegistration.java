package repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Event;
import model.EventRegistration;
import model.Profile;
import model.RegistStatus;

public interface IEventRegistration extends JpaRepository<EventRegistration, Long>{
	
	// a profile can register only once per event (unique constraint) - check before saving
		boolean existsByProfileAndEvent(Profile profile, Event event);
	 
		Optional<EventRegistration> findByProfileAndEvent(Profile profile, Event event);
	 
		// "my registrations" page
		List<EventRegistration> findByProfile(Profile profile);
		
		List<EventRegistration> findByProfileId(Profile profileId);
	 
		// attendee list of an event
		List<EventRegistration> findByEvent(Event event);
	 
		List<EventRegistration> findByEventAndStatus(Event event, RegistStatus status);
	 
		// capacity check: count approved registrations before approving another one
		long countByEventAndStatus(Event event, RegistStatus status);
	 
		// admin view: all pending requests
		List<EventRegistration> findByStatus(RegistStatus status);

}
