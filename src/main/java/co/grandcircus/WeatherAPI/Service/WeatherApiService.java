package co.grandcircus.WeatherAPI.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherApiService {

	private RestTemplate restTemplate = new RestTemplate();
	
	public WeatherResponse getWeather(String latitude, String longitude) {
		String url = "https://forecast.weather.gov/MapClick.php?lat={latitude}&lon={longitude}&FcstType=json";
		WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class, latitude, longitude);
		return response;
	}
	
}
