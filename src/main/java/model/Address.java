package model;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Embeddable
public class Address {
	@NotBlank(message = "Veillez le nom du quartier")
	@Pattern(regexp = "^[Aa-Zz]{3,30}$")
	private String title;
	
	@NotBlank(message = "Veillez le nom de la rue")
	@Pattern(regexp = "^[A-Za-z]{3,30}$")
	private String street;
	@Min(value = 0 , message = "Le numero dois être superieur est à 0")
	@Max(value = 100, message = "Le numero dois être inferieur est à 100")
	private int houseNo;
	
	@Min(value = 0 , message = "Le numero dois être superieur est à 0")
	@Max(value = 100, message = "Le numero dois être inferieur est à 100")
	private int apartNo;
	
	@NotBlank(message = "Veillez le nom du district")
	@Pattern(regexp = "^[Aa-Zz]{3,30}$")
	private String district;
	
	@NotBlank(message = "Veillez le numéro du code postal")
	@Pattern(regexp = "^[Aa-Zz0-9]{5}$")
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
// argument and no argument constructor
	public Address() {}
	public Address (String title, String street, int houseNo, int apartNo , String district, String codePostal) {
		setTitle(title);
		setStreet(street);
		setHouseNo(houseNo);
		setApartNo(apartNo);
		setDistrict(district);
		setCodePostal(codePostal);
	}
	//toString 

	@Override
	public String toString() {
		String  result = "Address: " + title + "mah. "+ street + "sk. "+ " Diş kapı " +houseNo + "daire " 
				+ apartNo + district + "codePostal: " + codePostal ;
		return result;
	}
	
}
