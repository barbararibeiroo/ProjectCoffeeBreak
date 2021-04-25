package com.devproject.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devproject.springboot.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
