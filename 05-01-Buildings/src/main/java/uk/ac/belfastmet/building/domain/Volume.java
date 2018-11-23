package uk.ac.belfastmet.building.domain;

public class Volume extends Building{

	private String  floorArea;
	private String  volume;
	private String  des;
	
	
	
	public Volume() {
		super();
	}



	public Volume(String floorArea, String volume, String des) {
		super();
		this.floorArea = floorArea;
		this.volume = volume;
		this.des = des;
	}



	public Volume(String name, String country, String place, String image, String map,String floorArea, String volume, String des) {
		super(name, country, place, image, map);
		this.floorArea = floorArea;
		this.volume = volume;
		this.des = des;
	}
	
	
	public String getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}



	public String getVolume() {
		return volume;
	}



	public void setVolume(String volume) {
		this.volume = volume;
	}



	public String getDes() {
		return des;
	}



	public void setDes(String des) {
		this.des = des;
	}
	
	
}
