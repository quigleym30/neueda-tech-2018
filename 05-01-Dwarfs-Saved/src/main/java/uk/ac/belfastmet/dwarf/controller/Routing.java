package uk.ac.belfastmet.dwarf.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarf.domain.Dwarf;
import uk.ac.belfastmet.dwarf.repository.DwarfRepository;
import uk.ac.belfastmet.service.DwarfService;

@Controller
@RequestMapping("")
public class Routing {

	DwarfRepository dwarfRepository;
	
	
	
	public Routing(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}

	@GetMapping("")
	public String home(Model model) {
		return "index.html";
	}
	
	@GetMapping("/disney")
	public String disney(Model model) {
		
		//ArrayList<Dwarf> dwarfs = new ArrayList<>();
		//dwarfs = new DwarfService().getDisneyDwarfs();	
		model.addAttribute("pageTitle", "Disney");
		//model.addAttribute("disneyDwarfs", dwarfs);
		model.addAttribute("Dwarfs",this.dwarfRepository.findByAuthor("Disney"));
		return "dwarf.html";
	}
	
	@GetMapping("/tolkien")
	public String tolkien(Model model) {
		
		ArrayList<Dwarf> dwarves = new ArrayList<>();
		dwarves = new DwarfService().getTolkienDwarfs();
		
		model.addAttribute("pageTitle", "Tolkien");
		//model.addAttribute("tolkienDwarfs", dwarves);
		model.addAttribute("Dwarfs",this.dwarfRepository.findByAuthor("Tolkien"));
		return "dwarf.html";
	}
}
