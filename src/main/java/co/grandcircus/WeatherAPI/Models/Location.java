package co.grandcircus.WeatherAPI.Models;

public class Location {
	// fields we need within location
	
	// areaDescription for spec 3.a:
	// The areaDescription from the "location" section.
	
	private String areaDescription;
	
	// latitude & longitude for spec 4: 
	// Try calling the API using different latitudes and longitudes. 
	// You can use text boxes to submit the data to the API.
	
//	private String latitude;
//	private String longitude;
//	
//	public String getLatitude() {
//		return latitude;
//	}
//	public void setLatitude(String latitude) {
//		this.latitude = latitude;
//	}
//	public String getLongitude() {
//		return longitude;
//	}
//	public void setLongitude(String longitude) {
//		this.longitude = longitude;
//	}
	public String getAreaDescription() {
		return areaDescription;
	}
	public void setAreaDescription(String areaDescription) {
		this.areaDescription = areaDescription;
	}
	
	// String latitude, String longitude, 
	public Location(String areaDescription) {
		super();
//		this.latitude = latitude;
//		this.longitude = longitude;
		this.areaDescription = areaDescription;
	}
	
	public Location() {
		
	}
	
}
