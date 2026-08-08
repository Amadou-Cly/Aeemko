package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "profile")
public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "profile_id")
	private long profileId;
	
	@NotBlank(message = "Veillez entrer prénom!")
	@Pattern(regexp= "^[A-Z][a-z]{2,15}( [A-Z][a-z]{2-15})?$", 
					message = "Le prénom doit être commencer par une lettre majscule" )
	@Column(name = "first_name")
	private String firsName;
	
	@NotBlank(message = "Veillez entrer nom!")
	@Pattern(regexp= "^[A-Z][a-z]{2,15}( [A-Z][a-z]{2-15})?$", 
					message = "Le nom doit être commencer par une lettre majscule" )
	@Column(name = "last_name")
	private String lastName;
	@NotNull(message = "Veillez entrer votre date de naissance")
	@Past
	@Column(name = "birth_date")
	private LocalDate birthDate;  // validation toDo inside service
	
	@NotBlank(message = "Veiller entrer vôtre numero de telephone")
	// @Pattern ToDo inside service
	@Column(name = "phone_number")
	private String phoneNum;
	
	@Column(name = "emergence_number")
	@NotBlank(message = "Veiller entrer le d'un de vos proche telephone")
	private String EmergenceNum;
	
	@NotEmpty(message = "Veillez saisir vôtre activity")
	@Enumerated(EnumType.STRING)
	@Column(name = "activity")
	private Activity activity;
	
	@NotEmpty(message = "Veillez indiquer vôtre position")
	@Enumerated(EnumType.STRING)
	@Column(name = "position")
	private Position position;
	
	@NotBlank(message = "Veillez entrer vôtre adresse")
	@Embedded
	@Column(name = "address")
	private Address address;
	
	@NotBlank(message = "Veillez le nom de la ville")
	@Pattern(regexp = "^[Aa-Zz]{3,15}$", message = "Le nom de la ville est incorrect")
	@Column(name = "city")
	private String City;
	
	@NotBlank(message = "Veillez entrer de le nom du pays")
	@Column(name = "country")
	private String country;
	
	@NotEmpty(message = "Veillez indiquer vôtre status")
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private Status status;
	
	@NotEmpty
	private boolean isActive;
//Database connection
	@OneToOne
	private User user;
	
	
//getters and setters

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmergenceNum() {
		return EmergenceNum;
	}

	public void setEmergenceNum(String emergenceNum) {
		EmergenceNum = emergenceNum;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public long getProfileId() {
		return profileId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	// arg and no arg constructors
public Profile() {}
public Profile(String firsName, String lastName, LocalDate birthDate, String phoneNum,
			String emergenceNum, Activity activity, Position position, Address address, 
			String city, String country ,Status status, boolean isActive) {
	this.firsName = firsName;
	this.lastName = lastName;
	this.birthDate = birthDate;
	this.phoneNum = phoneNum;
	this.EmergenceNum = emergenceNum;
	this.activity = activity;
	this.position = position;
	this.address = address;
	this.City = city;
	this.country = country;
		this.status = status;
		this.isActive = isActive;
	}

//ToString
@Override
public String toString() {
	return "Profile [profileId=" + profileId + ", firsName=" + firsName + ", lastName=" + lastName + ", birthDate="
			+ birthDate + ", phoneNum=" + phoneNum + ", EmergenceNum=" + EmergenceNum + ", activity=" + activity
			+ ", position=" + position + ", address=" + address + ", City=" + City + ", country=" + country
			+ ", status=" + status + ", isActive=" + isActive + "]";
}
	


	
	
}
