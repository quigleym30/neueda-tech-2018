package uk.ac.belfastmet.dwarf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.dwarf.repository.DwarfRepository;


@Controller
@RequestMapping
public class DwarfViewController {
	
	DwarfRepository dwarfRepository;

	public DwarfViewController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}
	
	
	@GetMapping("/dwarfs")
	public String Dwarfs( Model model) {
		model.addAttribute("pageTitle","All Dwarfs");
		model.addAttribute("Dwarfs", this.dwarfRepository.findAll());
		return "dwarf";
	}
	
	@GetMapping("/view/{dwarfId}")
	public String View(@PathVariable("dwarfId")Integer dwarfId, Model model) {
		model.addAttribute("pageTitle","View");
		model.addAttribute("dwarf", this.dwarfRepository.findByDwarfId(dwarfId));
		return "viewDwarf";
	}
	@GetMapping("/delete/{dwarfId}")
	public String Delete(@PathVariable("dwarfId")Integer dwarfId, Model model, RedirectAttributes redirectAttributes) {
        this.dwarfRepository.deleteById(dwarfId);
        redirectAttributes.addFlashAttribute("message", "Dwarf Deleted");
		return "redirect:/dwarfs";
	}
}

