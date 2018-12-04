package uk.ac.belfastmet.titanic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.titanic.repository.PassengersRepository;

@Controller
public class SearchController {

	PassengersRepository passengersRepository;

	public SearchController(PassengersRepository passengersRepository) {
		super();
		this.passengersRepository = passengersRepository;
	}
	
	@GetMapping("/searchid")
	public String SearchId(@RequestParam("Id") Integer passengerId, Model model) {
		model.addAttribute("pageTitle","Search");
		model.addAttribute("passengers", this.passengersRepository.findByPassengerId(passengerId));
		return "pass";
	}
	
	@GetMapping("/searchsurvived")
	public String Searchsurvived(@RequestParam("Survived") Integer survived, Model model) {
		model.addAttribute("pageTitle","Search");
		model.addAttribute("passengers", this.passengersRepository.findBySurvived(survived));
		return "pass";
	}
	
	@GetMapping("/searchp_class")
	public String Searchp_class(@RequestParam("pClass") Integer pClass, Model model) {
		model.addAttribute("pageTitle","Search");
		model.addAttribute("passengers", this.passengersRepository.findByPClass(pClass));
		return "pass";
	}
}