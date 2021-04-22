package com.example.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.users.domain.Owner;
import com.example.users.repository.OwnerRepository;

@Service
public class OwnerService {
	
	@Autowired
	OwnerRepository ownerRepository;
	
	public void addOwner(Owner owner) throws Exception {
		try {
			ownerRepository.save(owner);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}
