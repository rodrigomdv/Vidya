package com.TesteTec.testetec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TesteTec.testetec.entities.Produtos;
import com.TesteTec.testetec.repositories.ProdutosRepository;

@RestController
@RequestMapping(value = "/Produtos")
public class ProdutosController {
	
	@Autowired
	private ProdutosRepository repository;
	
	@GetMapping
	public List<Produtos> findAll() {
		List<Produtos> result = repository.findAll();
		return result;

}
}
