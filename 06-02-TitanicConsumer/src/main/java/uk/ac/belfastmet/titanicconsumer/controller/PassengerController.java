package uk.ac.belfastmet.titanicconsumer.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titanicconsumer.domain.AllPassengers;
import uk.ac.belfastmet.titanicconsumer.domain.Passenger;
import uk.ac.belfastmet.titanicconsumer.service.PassengerService;
import uk.ac.belfastmet.titanicconsumer.service.PassengerServiceImpl;

@Controller
@RequestMapping("/titanic")
public class PassengerController {
	
	@Autowired
	PassengerServiceImpl passengerService;
	AllPassengers allPassengers;
	
	
	
	public PassengerController() {
		super();
	}

	
	public PassengerController(PassengerServiceImpl passengerService) {
		super();
		this.passengerService = passengerService;
	}


	public PassengerController(PassengerServiceImpl passengerService, AllPassengers allPassengers) {
		super();
		this.passengerService = passengerService;
		this.allPassengers = allPassengers;
	}
	

	
//	@GetMapping("/{passengerId}")
//	public String viewPassenger(@PathVariable("passengerId") Integer passengerId, Model model) {
//		
//		model.addAttribute("pageTitle", "View Passenger");
//		
//		Passenger passenger = this.passengerService.get(passengerId);
//		model.addAttribute("passenger", passenger);
//		return "viewPassenger";
//	}
	
	@GetMapping("")
	public String listPassenger(Model model) {
		model.addAttribute("pageTitle", "Passeneger List");
		ArrayList<Passenger> list=this.passengerService.list();
		model.addAttribute("passengers", list);
		return "passenger";
	}
	
	@GetMapping("/view/{passengerId}")
	public String viewPassenger(@PathVariable("passengerId")Integer passengerId,Model model) {
		model.addAttribute("pageTitle", "View Passeneger");
		Passenger passenger=this.passengerService.get(passengerId);
		model.addAttribute("passenger", passenger);
		return "viewPassenger";
	}
	
	@GetMapping("/edit/{passengerId}")
	public String editPassenger(@PathVariable("passengerId")Integer passengerId,Model model) {
		model.addAttribute("pageTitle", "Edit");
		Passenger passenger=this.passengerService.get(passengerId);
		model.addAttribute("passenger", passenger);
		return "editPassenger";
	}
	@GetMapping("/add")
	public String addPassenger( Model model) {
		
		model.addAttribute("pageTitle","Add");
		Passenger passenger = new Passenger();
		model.addAttribute("passenger",passenger);
		return "editPassenger";
	}
	@GetMapping("/delete/{passengerId}")
	public String Delete(@PathVariable("passengerId")Integer passengerId, Model model,RedirectAttributes redirectAttributes) {
		 this.passengerService.delete(passengerId);
		 redirectAttributes.addFlashAttribute("message", "Passenger Deleted");
		return "redirect:/titanic";
	}
	
	
	@PostMapping("/save")
	public String savePassenger(Passenger passenger, @RequestParam("addUpdate") String addUpdate, Model model) {
		
		if(addUpdate.equals("Add")){
			
			this.passengerService.add(passenger);
			return "redirect:/titanic";
		}else {
			this.passengerService.update(passenger);
			return "redirect:/titanic/view/"+passenger.getPassengerId();
		}
		
	
		}
}
