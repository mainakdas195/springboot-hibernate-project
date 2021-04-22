package com.example.users.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.users.domain.Bonus;
import com.example.users.domain.User;

public interface BonusRepository extends CrudRepository<Bonus, Long>{
	
}
