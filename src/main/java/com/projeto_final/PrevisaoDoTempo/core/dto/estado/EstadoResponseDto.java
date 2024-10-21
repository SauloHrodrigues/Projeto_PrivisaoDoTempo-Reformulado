package com.projeto_final.PrevisaoDoTempo.core.dto.estado;

import com.projeto_final.PrevisaoDoTempo.core.dto.cidade.CidadeResponseDto;

import java.util.List;

public record EstadoResponseDto(
        Long id,

        String nome,

        List<CidadeResponseDto> cidades
) {
}