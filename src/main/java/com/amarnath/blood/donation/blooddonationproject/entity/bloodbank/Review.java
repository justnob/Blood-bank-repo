package com.amarnath.blood.donation.blooddonationproject.entity.bloodbank;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Review {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String title;
	private String description;
	
	@ManyToOne
	private BloodBank bloodbank;

	public Review() {
		super();
	}

	public Review(int id, String title, String description, BloodBank bloodbank) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.bloodbank = bloodbank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

	public void setBloodbank(BloodBank bloodbank) {
		this.bloodbank = bloodbank;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", title=" + title + ", description=" + description + ", bloodbank=" + bloodbank
				+ "]";
	}
	
	

}
