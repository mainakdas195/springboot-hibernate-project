package com.example.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.users.domain.Owner;
import com.example.users.service.OwnerService;

@RestController
@RequestMapping("/owner")
public class OwnerController {

	@Autowired
	private OwnerService ownerService;
	
	@RequestMapping(method=RequestMethod.POST, value="/addOwner")
	public void addOwnerOneToOne(@RequestBody Owner owner) throws Exception {
		ownerService.addOwner(owner);
	}
	
	@PostMapping("/addOwnerOTM")
	public void addOwnerOnetoMany(@RequestBody Owner owner) {
		
	}
}
