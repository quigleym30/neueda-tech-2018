package uk.ac.belfastmet.cereal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
