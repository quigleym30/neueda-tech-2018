package uk.ac.belfastmet.building.domain;

public class Footprint extends Building{

	private String footprint;
	private String lxw;
	private String des;
	
	public Footprint() {
		super();
	}
	public Footprint(String footprint, String lxw, String des) {
		super();
		this.footprint = footprint;
		this.lxw = lxw;
		this.des = des;
	}
	
	public Footprint(String name, String country, String place, String image, String map,String footprint, String lxw, String des) {
		super(name, country, place, image, map);
		this.footprint = footprint;
		this.lxw = lxw;
		this.des = des;
	}
	public String getFootprint() {
		return footprint;
	}
	public void setFootprint(String footprint) {
		this.footprint = footprint;
	}
	public String getLxw() {
		return lxw;
	}
	public void setLxw(String lxw) {
		this.lxw = lxw;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	
	
}
