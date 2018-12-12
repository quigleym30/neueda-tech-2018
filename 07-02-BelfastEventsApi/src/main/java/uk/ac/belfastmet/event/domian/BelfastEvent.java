package uk.ac.belfastmet.event.domian;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class BelfastEvent {

	
	private Integer identifier;
	private String url;
	private String title;
	@JsonFormat(pattern="yyy-MM-dd HH:mm:ss")
	private String startDate;
	@JsonFormat(pattern="yyy-MM-dd HH:mm:ss")
	private String endDate;
	private String time;
	private String venue;
	private String venueUrl;
	private String image;
	private String audience;
	private String theme;
	private String cost;
	private String content;
	
	public String toString() {
	
		String event=this.getIdentifier()+", "
				+this.getUrl()+", "
				+this.getTitle()+", "
				+this.getStartDate()+", "
				+this.getEndDate()+", "
				+this.getTime()+", "
				+this.getVenue()+", "
				+this.getVenueUrl()+", "
				+this.getImage()+", "
				+this.getAudience()+","
				+this.getTheme()+","
				+this.getCost()+", "
				+this.getContent();	
	
		return event;
	}
}
