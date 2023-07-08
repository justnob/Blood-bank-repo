package com.amarnath.blood.donation.blooddonationproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amarnath.blood.donation.blooddonationproject.dto.BloodBankDTO;
import com.amarnath.blood.donation.blooddonationproject.entity.bloodbank.BloodBank;

@RestController
public class BloodBankController {
	
	@Autowired
	private BloodBankDTO repo;
	
	
	public BloodBankController(BloodBankDTO repo) {
		super();
		this.repo = repo;
	}


	@GetMapping("/bloodBanks")
	private List<BloodBank> getAllBloodBank(){
		
		return repo.getAllBloodBanks();
		
	}
	
	@PostMapping("/bloodBanks")
	private ResponseEntity<Object> createBloodBank(@RequestBody BloodBank body) {
		
		return repo.createNewBloodBank(body);
		
	}
	
	@GetMapping("/bloodBanks/{bloodBankId}")
	private BloodBank getBloodBankById(@PathVariable int bloodBankId){
		
		 return repo.getByIdBloodBank(bloodBankId);

		
	}
	
	@DeleteMapping("/bloodBanks/{bloodBankId}")
	private void deleteBloodBank(@PathVariable int bloodBankId) {
		
		repo.deleteABloodBank(bloodBankId);
		
	}
	

}
