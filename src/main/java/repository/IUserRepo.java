package repository;

//import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import model.User;
//import model.UserRole;

public interface IUserRepo extends JpaRepository<User, Long> {
	boolean existsByEmail(String email);
	
	boolean existsByUserName(String userName);
	
	/*List<User> findByEmail(String email);
	List<User> findByUserName(String userName);
	
	List<User> findByUserRole(UserRole Role);*/
	
	// login / lookup
		Optional<User> findByUserName(String userName);
	 
		Optional<User> findByEmail(String email);

	
	
	 

}
