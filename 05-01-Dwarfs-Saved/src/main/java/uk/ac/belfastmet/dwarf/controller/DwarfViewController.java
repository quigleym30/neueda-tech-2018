package uk.ac.belfastmet.dwarf.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.dwarf.domain.Dwarf;
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
	@GetMapping("/add")
	public String addDwarf( Model model) {
		
		model.addAttribute("pageTitle","Add");
		model.addAttribute("dwarf",new Dwarf());
		return "editDwarf";
	}
	@GetMapping("/edit/{dwarfId}")
	public String editDwarf(@PathVariable("dwarfId") Integer dwarfId, Model model) {
		
		model.addAttribute("pageTitle","Edit");
		model.addAttribute("dwarf",this.dwarfRepository.findByDwarfId(dwarfId));
		return "editDwarf";
	}
	@PostMapping("/save")
	public String saveDwarf(@Valid Dwarf dwarf, BindingResult bindingResult,Model model) {
		if(bindingResult.hasErrors()){
			model.addAttribute("pageTitle","Invaild Dwarf");
			return "editDwarf";
		}else {
		Dwarf savedDwarf=this.dwarfRepository.save(dwarf);
		return "redirect:/view/"+dwarf.getDwarfId();
	}
		}
	
}

