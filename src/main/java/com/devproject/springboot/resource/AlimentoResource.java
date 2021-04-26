package com.devproject.springboot.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devproject.springboot.entities.Alimento;
import com.devproject.springboot.service.AlimentoService;

@RestController
@RequestMapping("/alimentos")
public class AlimentoResource {

	
		@Autowired
		private AlimentoService alimentoService;
		

		@GetMapping
		public ResponseEntity<List> findAll(){
			List<Alimento> list = alimentoService.findAll();
			return ResponseEntity.ok().body(list);
		}
			
		@GetMapping(value = "/{id}")
		public ResponseEntity<Alimento> findById(@PathVariable Long id){
			Alimento obj = alimentoService.findById(id);
			return ResponseEntity.ok().body(obj);
		
		
	}
}
