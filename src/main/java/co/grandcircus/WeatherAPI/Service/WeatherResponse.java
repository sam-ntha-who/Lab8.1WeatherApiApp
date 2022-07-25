package co.grandcircus.WeatherAPI.Service;

import com.fasterxml.jackson.annotation.JsonProperty;

import co.grandcircus.WeatherAPI.Models.CurrentObservation;
import co.grandcircus.WeatherAPI.Models.Data;
// import co.grandcircus.WeatherAPI.Models.Data;
import co.grandcircus.WeatherAPI.Models.Location;
import co.grandcircus.WeatherAPI.Models.Time;

public class WeatherResponse {
//outermost response, need to make the innermost ones first so you can reference them here
	
private Location location;
	
	@JsonProperty("currentobservation")
	private CurrentObservation currentObservation;
	
	private Time time;
	
	private Data data;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public CurrentObservation getCurrentObservation() {
		return currentObservation;
	}

	public void setCurrentObservation(CurrentObservation currentObservation) {
		this.currentObservation = currentObservation;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
 

	public WeatherResponse(Location location, CurrentObservation currentObservation, Time time, Data data) {
		super();
		this.location = location;
		this.currentObservation = currentObservation;
		this.time = time;
		this.data = data;
	}
	
	public WeatherResponse() {
		
	}
}
