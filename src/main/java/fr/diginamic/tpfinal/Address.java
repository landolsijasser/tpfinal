package fr.diginamic.tpfinal;

import java.io.Serializable;

import javax.persistence.*;
@Entity
public class Address implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String number;
	private String street;
	private String zipCode;
	private String city;
	@OneToOne(mappedBy = "address")
	private PetStore petstore;
	
	
	public Address() {
		super();
	}
	public Address(Long id, String number, String street, String zipCode, String city) {
		super();
		this.id = id;
		this.number = number;
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Adress [id=" + id + ", number=" + number + ", street=" + street + ", zipCode=" + zipCode + ", city="
				+ city + "]";
	}
	public PetStore getPetstore() {
		return petstore;
	}
	public void setPetstore(PetStore petstore) {
		this.petstore = petstore;
	}
	

}
