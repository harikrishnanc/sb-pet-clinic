package com.learning.sbpetclinic.services;

import java.util.Set;

import com.learning.sbpetclinic.model.Vet;

public interface VetService {
	Vet findById(Long Id);
	
	Vet save(Vet vet);
	
	Set<Vet> findAll();
}
