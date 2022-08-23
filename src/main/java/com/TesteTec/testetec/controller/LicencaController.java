package com.TesteTec.testetec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TesteTec.testetec.entities.Licenca;
import com.TesteTec.testetec.repositories.LicencaRepository;

@RestController
@RequestMapping(value = "/Licença")
public class LicencaController {
	
	@Autowired
	private LicencaRepository repository;
	
	@GetMapping
	public List<Licenca> findAll() {
		List<Licenca> result = repository.findAll();
		return result;
		
	}
}
