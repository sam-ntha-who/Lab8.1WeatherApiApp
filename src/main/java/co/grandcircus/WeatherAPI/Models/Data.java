package co.grandcircus.WeatherAPI.Models;

public class Data {

	private String[] text;

	public String[] getText() {
		return text;
	}

	public void setText(String[] text) {
		this.text = text;
	}

	public Data(String[] text) {
		super();
		this.text = text;
	}
	
	public Data() {
		
	}
	
}
