package com.example.apiRestBaoziStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apiRestBaoziStore.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}