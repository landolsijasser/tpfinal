package fr.diginamic.tpfinal;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
@Entity
public class PetStore implements Serializable {
@Id
	private Long id;
	private String name;
	private String managerName;
	@OneToOne
	@JoinColumn(unique = true)
	private Address address;
	@OneToMany(mappedBy = "petStore")
	private Set <Animal> animals;
	@ManyToMany
	@JoinTable(name = "pet_prod",
	joinColumns = @JoinColumn(name = "pet_id"),
	inverseJoinColumns = @JoinColumn(name ="prod_id"))
	private Set<Product> products;
	public PetStore() {
		super();
	}
	public PetStore(Long id, String name, String managerName) {
		super();
		this.id = id;
		this.name = name;
		this.managerName = managerName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	@Override
	public String toString() {
		return "PetStore [id=" + id + ", name=" + name + ", managerName=" + managerName + "]";
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Set<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(Set<Animal> animals) {
		this.animals = animals;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
}
