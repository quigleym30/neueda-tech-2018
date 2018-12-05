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
	
	@GetMapping("/searchname")
	public String Searchname(@RequestParam("name") String name, Model model) {
		model.addAttribute("pageTitle","Search");
		model.addAttribute("passengers", this.passengersRepository.findByName(name));
		return "pass";
	}
	
	@GetMapping("/searchsex")
	public String Searchsex(@RequestParam("sex") String sex, Model model) {
		model.addAttribute("pageTitle","Search");
		model.addAttribute("passengers", this.passengersRepository.findBySex(sex));
		return "pass";
	}
	
	@GetMapping("/searchage")
	public String Searchage(@RequestParam("age") Integer age, Model model) {
		model.addAttribute("pageTitle","Search");
		model.addAttribute("passengers", this.passengersRepository.findByAge(age));
		return "pass";
	}
	
	@GetMapping("/searchsibSp")
	public String SearchsibSp(@RequestParam("sibSp") Integer sibSp, Model model) {
		model.addAttribute("pageTitle","Search");
		model.addAttribute("passengers", this.passengersRepository.findBySibSp(sibSp));
		return "pass";
	}
	
	@GetMapping("/searchparch")
	public String Searchparch(@RequestParam("parch") Integer parch, Model model) {
		model.addAttribute("pageTitle","Search");
		model.addAttribute("passengers", this.passengersRepository.findByParch(parch));
		return "pass";
	}
	@GetMapping("/searchticket")
	public String Searchticket(@RequestParam("ticket") String ticket, Model model) {
		model.addAttribute("pageTitle","Search");
		model.addAttribute("passengers", this.passengersRepository.findByTicket(ticket));
		return "pass";
	}
	@GetMapping("/searchfare")
	public String Searchfare(@RequestParam("fare") Double fare, Model model) {
		model.addAttribute("pageTitle","Search");
		model.addAttribute("passengers", this.passengersRepository.findByFare(fare));
		return "pass";
	}
	
	@GetMapping("/searchcabin")
	public String Searchcabin(@RequestParam("cabin") String cabin, Model model) {
		model.addAttribute("pageTitle","Search");
		model.addAttribute("passengers", this.passengersRepository.findByCabin(cabin));
		return "pass";
	}
	
	@GetMapping("/searchembarked")
	public String Searchembarked(@RequestParam("embarked") String embarked, Model model) {
		model.addAttribute("pageTitle","Search");
		model.addAttribute("passengers", this.passengersRepository.findByembarked(embarked));
		return "pass";
	}
}