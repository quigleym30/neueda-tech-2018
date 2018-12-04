package uk.ac.belfastmet.titanic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import uk.ac.belfastmet.titanic.repository.PassengersRepository;
@Controller
public class HomeController {

	PassengersRepository passengersRepository;

	public HomeController(PassengersRepository passengersRepository) {
		super();
		this.passengersRepository = passengersRepository;
	}
	
	@GetMapping("")
	public String home(Model model) {
		return "index";
	}
}
