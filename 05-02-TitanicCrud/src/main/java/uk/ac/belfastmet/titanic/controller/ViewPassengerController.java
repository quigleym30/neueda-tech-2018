package uk.ac.belfastmet.titanic.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titanic.domain.Passenger;
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
	@GetMapping("/add")
	public String addPassenger( Model model) {
		
		model.addAttribute("pageTitle","Add");
		model.addAttribute("passenger",new Passenger());
		return "editPass";
	}
	@GetMapping("/edit/{passengerId}")
	public String editPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
		
		model.addAttribute("pageTitle","Edit");
		model.addAttribute("passenger",this.passengersRepository.findByPassengerId(passengerId));
		return "editPass";
	}
	@PostMapping("/save")
	public String savePassenger(@Valid Passenger passenger, BindingResult bindingResult,Model model) {
		if(bindingResult.hasErrors()){
			model.addAttribute("pageTitle","Passenger ");
			return "editPass";
		}else {
		Passenger savedPassenger=this.passengersRepository.save(passenger);
		return "redirect:/view/"+passenger.getPassengerId();
	}
		}
}


