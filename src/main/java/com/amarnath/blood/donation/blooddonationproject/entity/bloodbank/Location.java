package com.amarnath.blood.donation.blooddonationproject.entity.bloodbank;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public class Location {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	private String locality;
	
	@NotNull
	private String Province;
	
	@NotNull
	private String country;
	
	
	@OneToOne(mappedBy = "bloodbankLocation")
	private BloodBank bloodbank;
	
	public Location() {
		super();
	}

	public Location(int id, String locality, String province, String country, BloodBank bloodbank) {
		super();
		this.id = id;
		this.locality = locality;
		Province = province;
		this.country = country;
		this.bloodbank = bloodbank;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getProvince() {
		return Province;
	}

	public void setProvince(String province) {
		Province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setBloodbank(BloodBank bloodbank) {
		this.bloodbank = bloodbank;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", locality=" + locality + ", Province=" + Province + ", country=" + country
				+ "]";
	}

}
