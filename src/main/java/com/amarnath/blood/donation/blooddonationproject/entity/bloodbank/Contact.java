package com.amarnath.blood.donation.blooddonationproject.entity.bloodbank;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Contact {
	
	@Id
	@GeneratedValue
	private int id;
	
	
	private String phone;
	
	
	private String mobile;
	
	@OneToOne(mappedBy = "bloodbankContact")
	private BloodBank bloodbank;

	public Contact() {
		super();
	}

	public Contact(int id, String phone, String mobile, BloodBank bloodbank) {
		super();
		this.id = id;
		this.phone = phone;
		this.mobile = mobile;
		this.bloodbank = bloodbank;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setBloodbank(BloodBank bloodbank) {
		this.bloodbank = bloodbank;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", phone=" + phone + ", mobile=" + mobile + "]";
	}
	
	
	
	

}
