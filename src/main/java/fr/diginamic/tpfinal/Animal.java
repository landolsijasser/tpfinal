package fr.diginamic.tpfinal;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Animal implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate birth;
	private String color;
	@ManyToOne
	@JoinColumn(name="id_petstore")
	private PetStore petStore;
	public Animal() {
		super();
	}
	public Animal(Long id, LocalDate birth, String color) {
		super();
		this.id = id;
		this.birth = birth;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", birth=" + birth + ", color=" + color + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getBirth() {
		return birth;
	}
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public PetStore getPetStore() {
		return petStore;
	}
	public void setPetStore(PetStore petStore) {
		this.petStore = petStore;
	}
	
	

}
