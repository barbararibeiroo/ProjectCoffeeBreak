package com.devproject.springboot.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devproject.springboot.entities.Pessoa;
import com.devproject.springboot.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

	@Autowired
	private PessoaService service;
	

	@GetMapping
	public ResponseEntity<List> findAll(){
		List<Pessoa> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	//RECUPERADA SOMENTE DADOS DO DETERMINADO ID
		@GetMapping(value = "/{id}")
		public ResponseEntity<Pessoa> findById(@PathVariable Long id){
			Pessoa obj = service.findById(id);
			return ResponseEntity.ok().body(obj);
	
	
}
}