package com.example.users.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.users.domain.Bonus;
import com.example.users.domain.User;
import com.example.users.repository.BonusRepository;
import com.example.users.repository.UserLoginRepository;

@Service
public class BonusService {

	@Autowired
	BonusRepository userLoginRepository;
	
	
	public void addTravelRequest(Bonus user) throws Exception {
		try {
			userLoginRepository.save(user);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public List<Bonus> findAllUsers() throws Exception {
		List<Bonus> usersList = new ArrayList<>();
		try {
			usersList = (List<Bonus>) userLoginRepository.findAll();
		} catch (Exception e) {
			throw new Exception(e);
		}
		return usersList;
	}
}
