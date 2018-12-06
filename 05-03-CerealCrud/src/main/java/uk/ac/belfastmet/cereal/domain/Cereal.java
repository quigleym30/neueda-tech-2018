package uk.ac.belfastmet.cereal.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cereal {


	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer CerealId;
	
	private String manufacturer,cereal,sodium,salt,iron;
	
	private Integer energy,calories;
	
	private Double protein,carbs,sugers,fats,saturates,fibre;

	public Cereal() {
		super();
	}

	public Cereal(Integer cerealId, String manufacturer, String cereal, String sodium, String salt, String iron,
			Integer energy, Integer calories, Double protein, Double carbs, Double sugers, Double fats,
			Double saturates, Double fibre) {
		super();
		CerealId = cerealId;
		this.manufacturer = manufacturer;
		this.cereal = cereal;
		this.sodium = sodium;
		this.salt = salt;
		this.iron = iron;
		this.energy = energy;
		this.calories = calories;
		this.protein = protein;
		this.carbs = carbs;
		this.sugers = sugers;
		this.fats = fats;
		this.saturates = saturates;
		this.fibre = fibre;
	}

	public Integer getCerealId() {
		return CerealId;
	}

	public void setCerealId(Integer cerealId) {
		CerealId = cerealId;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCereal() {
		return cereal;
	}

	public void setCereal(String cereal) {
		this.cereal = cereal;
	}

	public String getSodium() {
		return sodium;
	}

	public void setSodium(String sodium) {
		this.sodium = sodium;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getIron() {
		return iron;
	}

	public void setIron(String iron) {
		this.iron = iron;
	}

	public Integer getEnergy() {
		return energy;
	}

	public void setEnergy(Integer energy) {
		this.energy = energy;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Double getProtein() {
		return protein;
	}

	public void setProtein(Double protein) {
		this.protein = protein;
	}

	public Double getCarbs() {
		return carbs;
	}

	public void setCarbs(Double carbs) {
		this.carbs = carbs;
	}

	public Double getSugers() {
		return sugers;
	}

	public void setSugers(Double sugers) {
		this.sugers = sugers;
	}

	public Double getFats() {
		return fats;
	}

	public void setFats(Double fats) {
		this.fats = fats;
	}

	public Double getSaturates() {
		return saturates;
	}

	public void setSaturates(Double saturates) {
		this.saturates = saturates;
	}

	public Double getFibre() {
		return fibre;
	}

	public void setFibre(Double fibre) {
		this.fibre = fibre;
	}
	
	
}
