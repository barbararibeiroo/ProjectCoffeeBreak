package com.devproject.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devproject.springboot.entities.Alimento;
import com.devproject.springboot.repository.AlimentoRepository;
@Service
public class AlimentoService {


	@Autowired
	private AlimentoRepository alimentoRepository;

	public List<Alimento> findAll(){
		return alimentoRepository.findAll();
	}
	public Alimento findById(Long id) {
		Optional<Alimento> obj = alimentoRepository.findById(id);
		return obj.get();
	}
}
