package uk.ac.belfastmet.dwarf.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dwarf {
	private String name, author, image;
	
	@Id
	@GeneratedValue
	private Integer dwarfId;

	public Dwarf() {
		super();
	}
	
	

	public Integer getDwarfId() {
		return dwarfId;
	}



	public void setDwarfId(Integer dwarfId) {
		this.dwarfId = dwarfId;
	}

	public Dwarf(String name, String author, String image) {
		super();
		this.name = name;
		this.author = author;
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
