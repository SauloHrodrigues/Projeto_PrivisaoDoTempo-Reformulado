package com.projeto_final.PrevisaoDoTempo.repositories;

import com.projeto_final.PrevisaoDoTempo.core.entities.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {
    boolean existsByNome(String nome);

    Optional<Cidade> findByNome(String nome);

}