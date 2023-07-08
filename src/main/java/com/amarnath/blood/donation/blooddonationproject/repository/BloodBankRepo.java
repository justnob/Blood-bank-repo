package com.amarnath.blood.donation.blooddonationproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amarnath.blood.donation.blooddonationproject.entity.bloodbank.BloodBank;

public interface BloodBankRepo extends JpaRepository<BloodBank, Integer>{
	

}
