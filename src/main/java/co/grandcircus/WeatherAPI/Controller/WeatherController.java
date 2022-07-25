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
	private String ShowWeather(Model model) {
		model.addAttribute("weather", apiService.getWeather());
		
		
		return "weather";
	}
	
//	@PostMapping("/weather")
//	private String displayWeather(Model model, @RequestParam double latitude, @RequestParam double longitude) {
//
////		model.addAttribute("weather", apiService.getWeather(latitude, longitude));
//		
//		return "weather";
//	}
}
