package com.custom.immutable;

public class Address {

	public String city;
	public String state;

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public Address(Address address) {
		this(address.getCity(), address.getState());
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
