package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Activity;
import model.Address;
import model.Position;
import model.Profile;
import model.Status;
import model.User;

import java.util.List;
import java.time.LocalDate;



public interface IProfileRepo extends JpaRepository<Profile, Long>{
	
	Optional<Profile>findByUser(User user);
	
	boolean existsByUser(User user);
	
	List<Profile> findByProfileId(long profileId);
	
	List<Profile> findByActivity(Activity activity);
	
	List<Profile> findByBirthDate(LocalDate birthDate);
	
	List<Profile> findByAddress(Address address);
	
	List<Profile> findByPhoneNum(String phoneNum);
	
	List<Profile> findByEmergenceNum(String emergenceNum);
	
	List<Profile> findByPosition(Position position);
	
	List<Profile> findByStatus(Status status);
	
	List<Profile> findByIsActive(boolean isActive);
	
	List<Profile> findByFirsNameContainingIgnoreCaseOrLastNameIgnoreCase(String firsName, String lastName);
	
	
	
	

}
