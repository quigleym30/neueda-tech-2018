package uk.ac.belfastmet.haker.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.haker.domain.TopStories;

@Controller
@RequestMapping()
public class HakerController {

	@GetMapping
	public String home(Model model) {
		model.addAttribute("pageTitle","Home");
		return "index";
	}
	@GetMapping("/hacker")
	public String haker(Model model)
	{
		model.addAttribute("pageTitle","Haker News Articles");
		String hackerEventUrl=
				"https://hacker-news.firebaseio.com/v0/topstories.json";
		RestTemplate restTemplate = new RestTemplate();
		ArrayList<Integer> topSrories=restTemplate.getForObject(hackerEventUrl, ArrayList.class);
		System.out.println(topSrories.get(1));
		model.addAttribute("hackers",topSrories);
		
		return "hacker.html";
	}
	
}
