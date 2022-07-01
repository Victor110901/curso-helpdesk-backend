package com.victor.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.helpdesk.domain.Cliente;

public interface PessoaRepository extends JpaRepository<Cliente, Integer> {

}
