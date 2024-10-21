package com.projeto_final.PrevisaoDoTempo.service;

import com.projeto_final.PrevisaoDoTempo.core.dto.cidade.CidadeRequestDdo;
import com.projeto_final.PrevisaoDoTempo.core.dto.cidade.CidadeResponseDto;

import java.util.List;

public interface CidadeService {

    CidadeResponseDto registrar(CidadeRequestDdo requestDdo);

    List<CidadeResponseDto> buscar();

    CidadeResponseDto buscar(Long id);

    CidadeResponseDto buscarNome(String nome);

    CidadeResponseDto alterar(Long id);

    CidadeResponseDto alterar(String nome);

    boolean excluir(Long id);

    boolean excluir(String nome);
}