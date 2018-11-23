package uk.ac.belfastmet.building.domain;

public class FloorArea extends Building{
	
	private String floorArea;

	public FloorArea() {
		super();
	}

	public FloorArea(String name, String country, String place, String image, String map, String floorArea) {
		super(name, country, place, image, map);
		this.floorArea = floorArea;
	}

	public FloorArea(String floorArea) {
		super();
		this.floorArea = floorArea;
	}

	public String getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}
	
	
}
