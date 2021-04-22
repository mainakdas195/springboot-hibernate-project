package com.example.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.users.domain.Bonus;
import com.example.users.domain.ReturnMessage;
import com.example.users.domain.User;
import com.example.users.service.BonusService;
import com.example.users.service.UserLoginService;

@RestController
@RequestMapping("/userLogin")
public class UserLoginController {
	
	@Autowired
	UserLoginService userLoginService;
	
	@Autowired
	BonusService bs;
	
	@RequestMapping(method=RequestMethod.POST, value="/addUser")
	public ReturnMessage addUsers(@RequestBody User user) throws Exception {
		userLoginService.addTravelRequest(user);
		
		ReturnMessage returnMessage = new ReturnMessage("User created successfully");
		return returnMessage;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/findAllUser")
	public List<Bonus> findAllUsers() throws Exception {
		List<Bonus> users = bs.findAllUsers();
		
		return users;
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/addBonus")
	public ReturnMessage addBonus(@RequestBody Bonus user) throws Exception {
		bs.addTravelRequest(user);
		
		ReturnMessage returnMessage = new ReturnMessage("User created successfully");
		return returnMessage;
	}
}
