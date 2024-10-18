package com.projeto_final.PrevisaoDoTempo.core.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class CidadeRequestDdo {

    @Getter
    @Setter
    private String nome;

    @Getter
    @Setter
    private DadoMeteorologicoRequestDto dadosMeteorologicos;
}
