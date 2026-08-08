package model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table (name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@NotBlank(message = "Veillez entrer le nom d'ulisateur! ")
	@Pattern(regexp = "[Aa0-Zz9]{3-15}?",
					message = "Le nom d'utilisateur doit être un nom composé de 3 à 15 lettres")
	@Column(name = "user_name")
	private String userName;
	
	
	@Email(message = "Veillez entrer votre email!")
	@NotBlank(message = "L'email ne doit pqs être vide ou espce! ")
	@Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$", message = "L'email est incorrect" )
	@Column(name = "user_email")
	private String email;
	
	@NotBlank(message = "Veiller entrer vôtre mot de pass!")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
			message = "Le mot de pass doit être au moins 8 charcters, une lettre maj, une lettre miniscule,"
					+ "un character spécial!")
	@Column(name = "user_password")
	private String passWord;
	
	@NotNull(message = "Veillez indiquer vôtre rôle!")
	@Enumerated(EnumType.STRING)
	@Column(name = "user_role")
	private UserRole role;
// Database connection
	@OneToOne(mappedBy = "user")
	private Profile profile;
	
// getters and setters 	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public UserRole getUserRole() {
		return role;
	}

	public void setUserRole(UserRole role) {
		this.role = role;
	}

	public int getId() {
		return userId;
	}
// arg and no arg constructors 
	public User () {}
	public User( String userName, String email, String passWord, UserRole role ) {
		this.userName = userName;
		this.email = email;
		this.passWord = passWord;
		this.role = role;
	}
// toStrig

	@Override
	public String toString() {
		return "User [Id=" + userId + ", userName=" + userName + ", email=" + email + ", passWord=" + passWord + ", role="
				+ role + "]";
	}
	
	
	
	
}
