package uk.ac.belfastmet.titanic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titanic.repository.PassengersRepository;

@Controller
@RequestMapping
public class ViewPassengerController {

	PassengersRepository passengersRepository;

	public ViewPassengerController(PassengersRepository passengersRepository) {
		super();
		this.passengersRepository = passengersRepository;
	}
	
	@GetMapping("/view/{passengerId}")
	public String View(@PathVariable("passengerId")Integer passengerId, Model model) {
		model.addAttribute("pageTitle","View");
		model.addAttribute("passenger", this.passengersRepository.findByPassengerId(passengerId));
		return "viewPassenger";
	}
	@GetMapping("/delete/{passengerId}")
	public String Delete(@PathVariable("passengerId")Integer passengerId, Model model,RedirectAttributes redirectAttributes) {
		 this.passengersRepository.deleteById(passengerId);
		 redirectAttributes.addFlashAttribute("message", "Passenger Deleted");
		return "redirect:/pass";
	}
}


