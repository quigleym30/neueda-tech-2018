package uk.ac.belfastmet.building.controller;

	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;

	import uk.ac.belfastmet.building.domain.Footprint;
	import uk.ac.belfastmet.building.service.BuildingService;

	import java.util.ArrayList;

	import org.springframework.stereotype.Controller;

	
	@Controller
	@RequestMapping
public class FootprintController {
	@GetMapping("/foot")
	
	public String volume(Model model) {
		
		BuildingService buildingService = new BuildingService();
		ArrayList<Footprint> foot = buildingService.getFootprint();
		model.addAttribute("footprint",foot);
		
		return "foot.html";
	}
	

}
