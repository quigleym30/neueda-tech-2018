package uk.ac.belfastmet.building.controller;

	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;

	import uk.ac.belfastmet.building.domain.Volume;
	import uk.ac.belfastmet.building.service.BuildingService;

	import java.util.ArrayList;

	import org.springframework.stereotype.Controller;

	
	@Controller
	@RequestMapping
public class VolumeController {
	@GetMapping("/volume")
	
	public String volume(Model model) {
		
		BuildingService buildingService = new BuildingService();
		ArrayList<Volume> volume = buildingService.getVolume();
		model.addAttribute("volumeList",volume);

		return "volume.html";
	}
	

}
