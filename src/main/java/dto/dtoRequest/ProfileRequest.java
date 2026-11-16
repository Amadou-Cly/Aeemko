
package dto.dtoRequest;
 
import java.time.LocalDate;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import model.Activity;
 
public class ProfileRequest {
 
	@NotBlank(message = "Veillez entrer votre prénom!")
	@Pattern(regexp = "^[A-Z][a-z]{2,15}( [A-Z][a-z]{2,15})?$",
			message = "Le prénom doit commencer par une lettre majuscule")
	private String firstName;
 
	@NotBlank(message = "Veillez entrer votre nom!")
	@Pattern(regexp = "^[A-Z][a-z]{2,15}( [A-Z][a-z]{2,15})?$",
			message = "Le nom doit commencer par une lettre majuscule")
	private String lastName;
 
	@NotNull(message = "Veillez entrer votre date de naissance")
	@Past(message = "La date de naissance doit être dans le passé")
	private LocalDate birthDate;
 
	@NotBlank(message = "Veillez entrer votre numéro de téléphone")
	private String phoneNum;
 
	@NotBlank(message = "Veillez entrer le numéro d'un de vos proches")
	private String emergencyNum;
 
	@NotNull(message = "Veillez saisir votre activité")
	private Activity activity;
 
	@NotNull(message = "Veillez entrer votre adresse")
	@Valid
	private AddressRequest address = new AddressRequest();
 
	@NotBlank(message = "Veillez entrer le nom de la ville")
	@Pattern(regexp = "^[A-Za-z ]{3,15}$", message = "Le nom de la ville est incorrect")
	private String city;
 
	@NotBlank(message = "Veillez entrer le nom du pays")
	private String country;
 
	// getters and setters
 
	public String getFirstName() {
		return firstName;
	}
 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
 
	public String getEmergencyNum() {
		return emergencyNum;
	}
 
	public void setEmergencyNum(String emergencyNum) {
		this.emergencyNum = emergencyNum;
	}
 
	public Activity getActivity() {
		return activity;
	}
 
	public void setActivity(Activity activity) {
		this.activity = activity;
	}
 
	public AddressRequest getAddress() {
		return address;
	}
 
	public void setAddress(AddressRequest address) {
		this.address = address;
	}
 
	public String getCity() {
		return city;
	}
 
	public void setCity(String city) {
		this.city = city;
	}
 
	public String getCountry() {
		return country;
	}
 
	public void setCountry(String country) {
		this.country = country;
	}
 
	// no arg constructor
	public ProfileRequest() {}
	//arg constructor
	public ProfileRequest(String firstName, String lastName, LocalDate birthDate, String phoneNum,
			String emergencyNum, Activity activity, AddressRequest address, String city, String country) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.phoneNum = phoneNum;
		this.emergencyNum = emergencyNum;
		this.activity = activity;
		this.address = address;
		this.city = city;
		this.country = country;
	}
}
 