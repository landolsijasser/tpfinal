package fr.diginamic.tpfinal;

import javax.persistence.*;
@Entity
public class Fish extends Animal{
	@Enumerated(EnumType.STRING)
	private FishLivEnv livingEnv;

	public Fish() {
		super();
	}

	public Fish(FishLivEnv livingEnv) {
		super();
		this.livingEnv = livingEnv;
	}

	public FishLivEnv getLivingEnv() {
		return livingEnv;
	}

	public void setLivingEnv(FishLivEnv livingEnv) {
		this.livingEnv = livingEnv;
	}

	@Override
	public String toString() {
		return "Fish [livingEnv=" + livingEnv + "]";
	}

}
