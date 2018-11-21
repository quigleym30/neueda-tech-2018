
public class Toy {

	private String charName;
	private String fName;
	private String lName;

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Toy() {
		super();
	}

	public Toy(String charName, String fName, String lName) {
		super();
		this.charName = charName;
		this.fName = fName;
		this.lName = lName;
	}

}
