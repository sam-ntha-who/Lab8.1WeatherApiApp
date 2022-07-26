package co.grandcircus.WeatherAPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.WeatherAPI.Service.WeatherApiService;
import co.grandcircus.WeatherAPI.Service.WeatherResponse;

@Controller
public class WeatherController {

	@Autowired
	private WeatherApiService apiService;
	
	
	@RequestMapping("/")
	private String showHomepage() {
		return "index";
	}
	
	@RequestMapping("/weather")
	private String ShowWeather(Model model, String latitude, String longitude) {
		model.addAttribute("latitude", latitude);
		model.addAttribute("longitude", longitude);
		model.addAttribute("weather", apiService.getWeather(latitude, longitude));
				
		return "weather";
	}
	
	@PostMapping("/weather-display")
	private String displayWeather(Model model, @RequestParam String latitude, @RequestParam String longitude) {
	WeatherResponse weather = apiService.getWeather(latitude, longitude);
	// tested with latitude 42.6811, longitude -82.7369 (new baltimore, mi) 
	// seems to have to take in an accurate lat/long not just any number 0.0000 - 180.0000
	// should create a method or class to deal with the number and format appropriately. 
	
	
	model.addAttribute("latitude", latitude);
	model.addAttribute("longitude", longitude);
	model.addAttribute("weather", weather);
		
		return "weather";
	}
}
