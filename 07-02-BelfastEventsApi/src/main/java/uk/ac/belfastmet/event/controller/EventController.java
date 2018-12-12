package uk.ac.belfastmet.event.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.event.domian.AllEvents;
import uk.ac.belfastmet.event.domian.BelfastEvent;


@Controller
@RequestMapping()
public class EventController {

	@GetMapping
	public String home(Model model) {
		model.addAttribute("pageTitle","Home");
		return "index";
	}
	
	@GetMapping("/event")
	public String event(Model model) {
		String belfastEventUrl=
				"https://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
		RestTemplate restTemplate = new RestTemplate();
		AllEvents belfastEvents=restTemplate.getForObject(belfastEventUrl, AllEvents.class);
		
		Logger logger= LoggerFactory.getLogger(AllEvents.class);
		logger.info(belfastEvents.toString());

		model.addAttribute("pageTitle","Belfast Events");
		model.addAttribute("events",belfastEvents);
		return "events";
}
}
