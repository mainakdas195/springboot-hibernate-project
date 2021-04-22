package com.example.users.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.users.domain.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
	
}
