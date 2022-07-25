package co.grandcircus.WeatherAPI.Models;

public class Time {
	
	private String[] startPeriodName;

	public String[] getStartPeriodName() {
		return startPeriodName;
	}

	public void setStartPeriodName(String[] startPeriodName) {
		this.startPeriodName = startPeriodName;
	}

	public Time(String[] startPeriodName) {
		super();
		this.startPeriodName = startPeriodName;
	}
	
	public Time() {
		
	}

}
