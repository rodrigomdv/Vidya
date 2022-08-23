package com.TesteTec.testetec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TesteTec.testetec.entities.Clientes;
import com.TesteTec.testetec.repositories.ClientesRepository;


@RestController
@RequestMapping(value = "/Clientes")
public class ClientesController {
	
	@Autowired
	private ClientesRepository repository;
	
	@GetMapping
	public List<Clientes> findAll() {
		List<Clientes> result = repository.findAll();
		return result;
		
	}
}
