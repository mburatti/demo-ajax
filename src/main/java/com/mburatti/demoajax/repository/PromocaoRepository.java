package com.mburatti.demoajax.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mburatti.demoajax.domain.Promocao;

public interface PromocaoRepository extends JpaRepository<Promocao, Long> {

}
