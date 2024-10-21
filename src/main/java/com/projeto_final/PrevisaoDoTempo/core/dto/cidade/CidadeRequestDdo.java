package com.projeto_final.PrevisaoDoTempo.core.dto.cidade;

import com.projeto_final.PrevisaoDoTempo.core.dto.dado_meteorologico.DadoMeteorologicoRequestDto;
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
