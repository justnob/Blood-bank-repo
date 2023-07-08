package com.amarnath.blood.donation.blooddonationproject.entity.bloodbank;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="BLOOD_BANK")
public class BloodBank {

	@Id
	@GeneratedValue
	private int id;

	@NotNull
	private String bloodbankName;

	
	@OneToOne(cascade = CascadeType.ALL)
	private Location bloodbankLocation;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Contact bloodbankContact;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "bloodbank")
	private List<Review> bloodbankReviews;

	public BloodBank() {
		super();
	}

	public BloodBank(int id, String bloodbankName, Location bloodbankLocation, Contact bloodbankContact, List<Review> bloodbankReviews) {
		super();
		this.id = id;
		this.bloodbankName = bloodbankName;
		this.bloodbankLocation = bloodbankLocation;
		this.bloodbankContact = bloodbankContact;
		this.bloodbankReviews = bloodbankReviews;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBloodbankName() {
		return bloodbankName;
	}

	public void setBloodbankName(String bloodbankName) {
		this.bloodbankName = bloodbankName;
	}

	public Location getBloodbankLocation() {
		return bloodbankLocation;
	}

	public void setBloodbankLocation(Location bloodbankLocation) {
		this.bloodbankLocation = bloodbankLocation;
	}

	public Contact getBloodbankContact() {
		return bloodbankContact;
	}

	public void setBloodbankContact(Contact bloodbankContact) {
		this.bloodbankContact = bloodbankContact;
	}
	

	public List<Review> getBloodbankReviews() {
		return bloodbankReviews;
	}

	public void setBloodbankReviews(List<Review> bloodbankReviews) {
		this.bloodbankReviews = bloodbankReviews;
	}

	@Override
	public String toString() {
		return "BloodBank [id=" + id + ", bloodbankName=" + bloodbankName + ", bloodbankLocation=" + bloodbankLocation
				+ ", bloodbankContact=" + bloodbankContact + ", bloodbankReviews=" + bloodbankReviews + "]";
	}

	
	

}
