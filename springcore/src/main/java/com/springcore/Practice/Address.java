package com.springcore.Practice;

public class Address {
	private String cityName;
	private String cityNumber;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityNumber() {
		return cityNumber;
	}

	public void setCityNumber(String cityNumber) {
		this.cityNumber = cityNumber;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + ", cityNumber=" + cityNumber + "]";
	}

}
