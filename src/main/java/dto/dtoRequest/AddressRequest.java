package dto.dtoRequest;
 
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
 
// REQUEST: address part of the profile form
public class AddressRequest {
 
	@NotBlank(message = "Veillez entrer le nom du quartier")
	@Pattern(regexp = "^[A-Za-z ]{3,30}$", message = "Le nom du quartier est incorrect")
	private String title;
 
	@NotBlank(message = "Veillez entrer le nom de la rue")
	@Pattern(regexp = "^[A-Za-z ]{3,30}$", message = "Le nom de la rue est incorrect")
	private String street;
 
	@Min(value = 0, message = "Le numéro doit être supérieur ou égal à 0")
	@Max(value = 100, message = "Le numéro doit être inférieur ou égal à 100")
	private int houseNo;
 
	@Min(value = 0, message = "Le numéro doit être supérieur ou égal à 0")
	@Max(value = 100, message = "Le numéro doit être inférieur ou égal à 100")
	private int apartNo;
 
	@NotBlank(message = "Veillez entrer le nom du district")
	@Pattern(regexp = "^[A-Za-z ]{3,30}$", message = "Le nom du district est incorrect")
	private String district;
 
	@NotBlank(message = "Veillez entrer le code postal")
	@Pattern(regexp = "^[A-Za-z0-9]{5}$", message = "Le code postal doit contenir 5 caractères")
	private String codePostal;
 
	// getters and setters
 
	public String getTitle() {
		return title;
	}
 
	public void setTitle(String title) {
		this.title = title;
	}
 
	public String getStreet() {
		return street;
	}
 
	public void setStreet(String street) {
		this.street = street;
	}
 
	public int getHouseNo() {
		return houseNo;
	}
 
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
 
	public int getApartNo() {
		return apartNo;
	}
 
	public void setApartNo(int apartNo) {
		this.apartNo = apartNo;
	}
 
	public String getDistrict() {
		return district;
	}
 
	public void setDistrict(String district) {
		this.district = district;
	}
 
	public String getCodePostal() {
		return codePostal;
	}
 
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
 
	// no arg constructor
	public AddressRequest() {}
	
	public AddressRequest(String title, String street, int houseNo, int apartNo, String district, String codePostal) {
		this.title = title;
		this.street = street;
		this.houseNo = houseNo;
		this.apartNo = apartNo;
		this.district = district;
		this.codePostal = codePostal;
	}
}
 