package uk.ac.belfastmet.haker.domain;

import java.util.ArrayList;

import lombok.Data;

@Data
public class TopStories {

	private String by;
	private Integer descendants; 
	private Integer id; 
	private ArrayList<Integer>kids;
	private Integer score; 
	private Integer time; 
	private String title;
	private String type;
	private String url;

}
