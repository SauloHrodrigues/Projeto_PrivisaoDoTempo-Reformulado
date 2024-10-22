package com.projeto_final.PrevisaoDoTempo.service.implementacoes;

import com.projeto_final.PrevisaoDoTempo.core.dto.dado_meteorologico.DadoNovoDto;
import com.projeto_final.PrevisaoDoTempo.core.dto.dado_meteorologico.DadoRequestDto;
import com.projeto_final.PrevisaoDoTempo.core.dto.dado_meteorologico.DadoResponseDto;
import com.projeto_final.PrevisaoDoTempo.core.entities.Cidade;
import com.projeto_final.PrevisaoDoTempo.core.entities.DadoMeteorologico;
import com.projeto_final.PrevisaoDoTempo.mapper.DadosMapper;
import com.projeto_final.PrevisaoDoTempo.repositories.DadoMeteorologicoRepository;
import com.projeto_final.PrevisaoDoTempo.service.DadoMeteorologicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadoMeteriologicoInplementacao implements DadoMeteorologicoService {

    @Autowired
    private DadoMeteorologicoRepository repository;

    @Autowired
    private CidadeService cidadeService;

    private final DadosMapper mapper = DadosMapper.INSTANCE;

    public DadoResponseDto cadastrarDado(DadoRequestDto dadoRequestDto) {

        Cidade cidade = cidadeService.buscarCidadePorNome(dadoRequestDto.cidade());

        DadoNovoDto dadoNovoDto = new DadoNovoDto(
                dadoRequestDto.data(),
                dadoRequestDto.temperaturaMinima(),
                dadoRequestDto.temperaturaMaxima(),
                dadoRequestDto.turno(),
                dadoRequestDto.clima(),
                dadoRequestDto.precipitacao(),
                cidade
        );

        DadoMeteorologico dadoCadastrado = repository.save(mapper.dtoToDado(dadoNovoDto));

        return mapper.dadoToResponseDto(dadoCadastrado);
    }

    public void deletarDadoPorId(Long id) {


    }

    public void alterarDado(Long id) {


    }
}
