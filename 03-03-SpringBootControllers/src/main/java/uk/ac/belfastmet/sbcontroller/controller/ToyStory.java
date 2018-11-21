package uk.ac.belfastmet.sbcontroller.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/toystory")
public class ToyStory {
	
	@GetMapping("")
	public String toystory(Model model) {
		return "Toy Story Chararacters";
	}
	
	@GetMapping("/woody")
	public String woody(Model model) {
		return "Woody was played by Tom Hanks";
	}
	@GetMapping("/buzz")
	public String buzz(Model model) {
		return "Buzz was played by Tim Allen";
	}
	@GetMapping("/slinkey")
	public String slinkey(Model model) {
		return "Slinkey was played by Jim Varney";
	}
	@GetMapping("/hamm")
	public String hamm(Model model) {
		return "Hamm was played by John Ratzenberger";
	}
	@GetMapping("/rex")
	public String rex(Model model) {
		return "Rex was played by Wallace Shawn";
	}
	@GetMapping("/potato")
	public String potato(Model model) {
		return "Mr. Potato Head was played by Don Rickles";
	}
}
