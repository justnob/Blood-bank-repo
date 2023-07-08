package com.amarnath.blood.donation.blooddonationproject.dto;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.amarnath.blood.donation.blooddonationproject.entity.bloodbank.BloodBank;
import com.amarnath.blood.donation.blooddonationproject.repository.BloodBankRepo;

@Service
public class BloodBankDTO {
	
	@Autowired
	private BloodBankRepo repo;
	
	
	public BloodBankDTO(BloodBankRepo repo) {
		super();
		this.repo = repo;
	}
	
	public List<BloodBank> getAllBloodBanks(){
		
		List<BloodBank> findAll = repo.findAll();
		
		if(findAll.isEmpty()) {
			
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
			
		}
		
		return findAll;
		
	}
	
	public ResponseEntity<Object> createNewBloodBank(BloodBank body) {
		
		BloodBank save = repo.save(body);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(save.getId())
				.toUri();
		return ResponseEntity.created(location ).build();
		
	}
	
	public BloodBank getByIdBloodBank(int bloodBankId){
		
		 Optional<BloodBank> bloodBank = repo.findById(bloodBankId);
		 
		 if(bloodBank.isEmpty()) {
			 
			 throw new ResponseStatusException(HttpStatus.NOT_FOUND);
			 
		 }
	
			 return bloodBank.get(); 
		
	}
	
	public void deleteABloodBank(int bloodBankId) {
		
		repo.deleteById(bloodBankId);
		
	}
	
	
}
