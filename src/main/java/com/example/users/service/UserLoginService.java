package com.example.users.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.users.domain.User;
import com.example.users.repository.UserLoginRepository;

@Service
public class UserLoginService {

	@Autowired
	UserLoginRepository userLoginRepository;
	
	public void addTravelRequest(User user) throws Exception {
		try {
			userLoginRepository.save(user);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public List<User> findAllUsers() throws Exception {
		List<User> usersList = new ArrayList<>();
		try {
			usersList = (List<User>) userLoginRepository.findAll();
		} catch (Exception e) {
			throw new Exception(e);
		}
		return usersList;
	}
}
