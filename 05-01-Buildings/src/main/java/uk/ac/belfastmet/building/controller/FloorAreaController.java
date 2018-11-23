package uk.ac.belfastmet.building.controller;

	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;

	import uk.ac.belfastmet.building.domain.FloorArea;
	import uk.ac.belfastmet.building.service.BuildingService;

	import java.util.ArrayList;

	import org.springframework.stereotype.Controller;

	
	@Controller
	@RequestMapping
public class FloorAreaController {
	@GetMapping("/floor")
	
	public String FloorArea(Model model) {
		
		BuildingService buildingService = new BuildingService();
		ArrayList<FloorArea> floorArea = buildingService.getFloorArea();
		model.addAttribute("floorList",floorArea);
		
		return "floor.html";
	}
	

}
