package com.projeto_final.PrevisaoDoTempo.service;

import com.projeto_final.PrevisaoDoTempo.core.dto.dado_meteorologico.DadoRequestDto;
import com.projeto_final.PrevisaoDoTempo.core.dto.dado_meteorologico.DadoResponseDto;

public interface DadoMeteorologicoService {


    public DadoResponseDto cadastrarDado(DadoRequestDto dado);
    public void deletarDadoPorId(Long id);
    public void alterarDado(Long id);

}
