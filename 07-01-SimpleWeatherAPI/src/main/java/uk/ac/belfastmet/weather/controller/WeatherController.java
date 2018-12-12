package uk.ac.belfastmet.weather.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.weather.domian.TodaysWeather;

@Controller
@RequestMapping()
public class WeatherController {

	@GetMapping
	public String home(Model model) {
		model.addAttribute("pageTitle","Home");
		return "index";
	}
	@GetMapping("/weather/{location}")
		public String weather(@PathVariable("location") String location,Model model) {
			String belfastWeatherUrl=
					"http://www.codingfury.net/training/weathersample/weather.php?location="+location;
			RestTemplate restTemplate = new RestTemplate();
			TodaysWeather todaysWeather=restTemplate.getForObject(belfastWeatherUrl, TodaysWeather.class);
			
			Logger logger= LoggerFactory.getLogger(TodaysWeather.class);
			logger.info(todaysWeather.getLocation().toString());
			logger.info(todaysWeather.getWeather().toString());
			logger.info(todaysWeather.getWeather().getWind().toString());
			model.addAttribute("pageTitle","Weather");
			model.addAttribute("todaysWeather",todaysWeather);
			return "weather";
		}
}
	

