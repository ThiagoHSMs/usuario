package com.thiago.usuario.infrastructure.repository;

import com.thiago_melhorando_spring.infrastructure.entiry.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
