package com.devproject.springboot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.devproject.springboot.entities.Alimento;
import com.devproject.springboot.entities.Pessoa;
import com.devproject.springboot.repository.AlimentoRepository;
import com.devproject.springboot.repository.PessoaRepository;

@Configuration
public class Config implements CommandLineRunner {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private AlimentoRepository alimentoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Alimento a1 = new Alimento(null, "Bolo de laranja");
		Alimento a2 = new Alimento(null, "Presunto");
		Alimento a3 = new Alimento(null, "Pão");
		Alimento a4 = new Alimento(null, "Queijo");
		
		alimentoRepository.saveAll(Arrays.asList(a1,a2,a3,a4));
		
		Pessoa p1 = new Pessoa(null, "120.445.387-99", "Bárbara Ribeiro");
		Pessoa p2 = new Pessoa(null, "002.585.777-22", "Diego Ramon");
		Pessoa p3 = new Pessoa(null, "455-500-277-00", "Lucas Maldonado");
		Pessoa p4 = new Pessoa(null, "455-500-277-00", "Lucas Maldonado");
		
		
		
		
		pessoaRepository.saveAll(Arrays.asList(p1,p2,p3));
	}
	
	

}
