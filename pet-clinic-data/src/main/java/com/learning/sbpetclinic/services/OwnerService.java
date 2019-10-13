package com.learning.sbpetclinic.services;

import java.util.Set;

import com.learning.sbpetclinic.model.Owner;

public interface OwnerService {
	Owner findByLastName(String lastName);
	
	Owner findById(Long Id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
	

}
