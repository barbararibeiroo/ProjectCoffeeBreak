package com.devproject.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devproject.springboot.entities.Alimento;

public interface AlimentoRepository extends JpaRepository<Alimento, Long> {

}
