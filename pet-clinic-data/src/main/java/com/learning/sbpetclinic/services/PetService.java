package com.learning.sbpetclinic.services;

import java.util.Set;

import com.learning.sbpetclinic.model.Pet;

public interface PetService {
	
	Pet findById(Long Id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();

}
