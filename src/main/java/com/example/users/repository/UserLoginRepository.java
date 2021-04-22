package com.example.users.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.users.domain.User;

@Repository
public interface UserLoginRepository extends CrudRepository<User, Long>{
	
}
