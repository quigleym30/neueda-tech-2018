package uk.ac.belfastmet.cereal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.cereal.repositroies.CerealRepository;

@Controller
public class cerealController {

	CerealRepository cerealRepository;

	public cerealController(CerealRepository cerealRepository) {
		super();
		this.cerealRepository = cerealRepository;
	}
	
	@GetMapping("")
	public String home(Model model) {
		return "index";
	}
	
	@GetMapping("/cereal")
	public String cerealList(Model model) {
		model.addAttribute("pageTitle", "cereal");
		model.addAttribute("Cereal",this.cerealRepository.findAll());
		return "cereal";
	}
	@GetMapping("/searchmanufacturer")
	public String SearchManufacturer(@RequestParam("manufacturer") String manufacturer, Model model) {
		model.addAttribute("pageTitle","Search");
		model.addAttribute("Cereal", this.cerealRepository.findByManufacturerContaining(manufacturer));
		return "cereal";
	}
	@GetMapping("/searchcereal")
	public String SearchCereal(@RequestParam("cereal") String cereal, Model model) {
		model.addAttribute("pageTitle","Search");
		model.addAttribute("Cereal", this.cerealRepository.findByCerealContaining(cereal));
		return "cereal";
	}
	@GetMapping("/view/{cerealId}")
	public String View(@PathVariable("cerealId")Integer cerealId, Model model) {
		model.addAttribute("pageTitle","View");
		model.addAttribute("cereal", this.cerealRepository.findByCerealId(cerealId));
		return "viewCereal";
	}
}
