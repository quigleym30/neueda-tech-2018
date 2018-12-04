package uk.ac.belfastmet.dwarf.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.dwarf.domain.Dwarf;
import uk.ac.belfastmet.dwarf.repository.DwarfRepository;
import uk.ac.belfastmet.service.DwarfService;

@Controller

public class SearchController {

	DwarfRepository dwarfRepository;

	public SearchController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}
	
	@GetMapping("/searchid")
	public String SearchId(@RequestParam("Id") Integer dwarfId, Model model) {
		model.addAttribute("pageTitle","Search");
		model.addAttribute("Dwarfs", this.dwarfRepository.findByDwarfId(dwarfId));
		return "dwarf";
	}
		@GetMapping("/searchname")
		public String Searchname(@RequestParam("name") String name, Model model) {
			model.addAttribute("pageTitle","Search");
			model.addAttribute("Dwarfs", this.dwarfRepository.findByName(name));
			return "dwarf";
	

	}
		@GetMapping("/searchauthor")
		public String Searchauthor(@RequestParam("author") String author, Model model) {
			model.addAttribute("pageTitle","Search");
			model.addAttribute("Dwarfs", this.dwarfRepository.findByAuthor(author));
			return "dwarf";
	

	}
		@GetMapping("/searchnameauthor")
		public String Searchnameauthor(@RequestParam("author") String author,@RequestParam("name") String name, Model model) {
			model.addAttribute("pageTitle","Search");
			model.addAttribute("Dwarfs", this.dwarfRepository.findByNameAndAuthor(name,author));
			return "dwarf";
	

	}
}
