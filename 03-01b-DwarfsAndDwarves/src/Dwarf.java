
public class Dwarf {
	
	private String name;
	private String autthor;
	private String image;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAutthor() {
		return autthor;
	}
	public void setAutthor(String autthor) {
		this.autthor = autthor;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Dwarf() {
		super();
	}
	public Dwarf(String name, String autthor, String image) {
		super();
		this.name = name;
		this.autthor = autthor;
		this.image = image;
	}
		
}
