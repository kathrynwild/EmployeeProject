package com.capgemini.entity;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@Column(name="addressId")
	private long id;

	@Column(name="city")
	private String city;
	
	@Column(name="pincode")
	private String pincode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
