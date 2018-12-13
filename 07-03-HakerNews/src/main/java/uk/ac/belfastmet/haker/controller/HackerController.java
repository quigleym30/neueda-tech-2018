package uk.ac.belfastmet.haker.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.haker.domain.TopStories;

@Controller
@RequestMapping()
public class HackerController {

	ArrayList<TopStories> stories;
	
	public HackerController(ArrayList<TopStories> stories) {
		super();
		this.stories = stories;
	}
	
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
		if(this.stories.size()==0) {
			ArrayList<Integer> topStroies=restTemplate.getForObject(hackerEventUrl, ArrayList.class);
			for (int i=0;i<topStroies.size();i++)
			{
				String eventUrl=
						"https://hacker-news.firebaseio.com/v0/item/"+topStroies.get(i)+".json";
				TopStories story=restTemplate.getForObject(eventUrl, TopStories.class);
				this.stories.add(story);
			}
		}
		
		
		//System.out.println(topStroies.get(1));
		model.addAttribute("hackers",this.stories);
		
		return "hacker.html";
	}
	
	@GetMapping("/single/{number}")
	public String single(@PathVariable("number") String number,Model model)
	{
		model.addAttribute("pageTitle","Haker News Article");
		String hackerEventUrl=
				"https://hacker-news.firebaseio.com/v0/item/"+number+".json";
		RestTemplate restTemplate = new RestTemplate();
		TopStories story=restTemplate.getForObject(hackerEventUrl, TopStories.class);
		
		model.addAttribute("hacker",story);
		
		return "single.html";
	}
	
}
