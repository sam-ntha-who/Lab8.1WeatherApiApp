package co.grandcircus.WeatherAPI.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentObservation {

	// CurrentObservation fields needed for spec 3.b:
	// At least three (3) values from the "currentobservation" section. 
	// Can add more later.
	
	@JsonProperty("Date")
	private String date;
	
	@JsonProperty("Visibility")
	private String visibility;
	
	@JsonProperty("WindChill")
	private String windChill;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getWindChill() {
		return windChill;
	}

	public void setWindChill(String windChill) {
		this.windChill = windChill;
	}

	public CurrentObservation(String date, String visibility, String windChill) {
		super();
		this.date = date;
		this.visibility = visibility;
		this.windChill = windChill;
	}
	
	public CurrentObservation() {
		
	}
	
	
}
