package uk.ac.belfastmet.titanic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import uk.ac.belfastmet.titanic.repository.PassengersRepository;

@Controller
public class PassengerController {

	PassengersRepository passengersRepository;

	public PassengerController(PassengersRepository passengersRepository) {
		super();
		this.passengersRepository = passengersRepository;
	}
	
	@GetMapping("/pass")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Passenger");
		model.addAttribute("passengers",this.passengersRepository.findAll());
		return "pass";
	}
	
	
}
