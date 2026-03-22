package com.example.apiRestBaoziStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apiRestBaoziStore.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long>{
	
}
