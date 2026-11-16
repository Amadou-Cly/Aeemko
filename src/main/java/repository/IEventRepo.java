package repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Event;
import model.Profile;
import java.time.LocalTime;


public interface IEventRepo extends JpaRepository<Event, Long> {
	boolean exiexistsByEvent(Event event);
	
	boolean exiexistsByEventId(Event eventId);
	
	List<Event> findByEventId(long eventId);
	
	List<Event> findByEventDateAfterOrderByEventDateAsc(LocalDate date);
	
	List<Event> findByEventDateBetweenOrderByEventDateAsc(LocalDate start, LocalDate end);
	
	List<Event> findByEventTime(LocalTime eventTime);
	
	List<Event> findByTitleContainingIgnoreCase(String title);
	
	List<Event> findByDescription(String description);
	 
	List<Event> findByLocationContainingIgnoreCase(String location);
 
	List<Event> findByProfile(Profile profile);
	
	

}
