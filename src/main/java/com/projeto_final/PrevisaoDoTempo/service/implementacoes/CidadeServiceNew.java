package com.projeto_final.PrevisaoDoTempo.service.implementacoes;

import com.projeto_final.PrevisaoDoTempo.core.dto.cidade.CidadeRequestDdo;
import com.projeto_final.PrevisaoDoTempo.core.dto.cidade.CidadeResponseDto;
import com.projeto_final.PrevisaoDoTempo.repositories.CidadeRepository;
import com.projeto_final.PrevisaoDoTempo.service.CidadeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CidadeServiceNew implements CidadeService {

    @Autowired
    CidadeRepository repository;




    @Override
    public CidadeResponseDto registrar(CidadeRequestDdo requestDdo) {
        return null;
    }

    @Override
    public List<CidadeResponseDto> buscar() {
        return null;
    }

    @Override
    public CidadeResponseDto buscar(Long id) {
        return null;
    }

    @Override
    public CidadeResponseDto buscarNome(String nome) {
        return null;
    }

    @Override
    public CidadeResponseDto alterar(Long id) {
        return null;
    }

    @Override
    public CidadeResponseDto alterar(String nome) {
        return null;
    }

    @Override
    public boolean excluir(Long id) {
        return false;
    }

    @Override
    public boolean excluir(String nome) {
        return false;
    }
}