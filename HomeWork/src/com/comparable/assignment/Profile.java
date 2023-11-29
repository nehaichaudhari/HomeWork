package com.comparable.assignment;

public class Profile {
	private String country;
	private String state;
	
	public Profile() {
		super();
	}
	
	public Profile(String country,String state) {
		this.country=country;
		this.state=state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Profile [country=" + country + ", state=" + state + "]";
	}

}
