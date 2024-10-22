package com.projeto_final.PrevisaoDoTempo.mapper;

import com.projeto_final.PrevisaoDoTempo.core.dto.dado_meteorologico.DadoNovoDto;
import com.projeto_final.PrevisaoDoTempo.core.dto.dado_meteorologico.DadoRequestDto;
import com.projeto_final.PrevisaoDoTempo.core.dto.dado_meteorologico.DadoResponseDto;
import com.projeto_final.PrevisaoDoTempo.core.entities.DadoMeteorologico;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DadosMapper {

    DadosMapper INSTANCE = Mappers.getMapper(DadosMapper.class);

    @Mapping(target = "id", ignore = true)
    DadoMeteorologico dtoToDado(DadoNovoDto dadoNovoDto);

    DadoResponseDto dadoToResponseDto(DadoMeteorologico dadoMeteorologico);
//
//    CidadeResponseDto cidadeToResponseDto(Cidade cidade);
//
//    List<CidadeResponseDto> cidadeListToResponnseDtoList(List<Cidade> cidade);
//
//    @Mapping(target = "id", ignore = true)
//    @Mapping(target = "estado", ignore = true)
//    @Mapping(target = "dadosMeteorologicos", ignore = true)
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    void updateCidadeFromCidadeResponseDto(@MappingTarget Cidade cidade, CidadeAtualizadaDto cidadeAtualizadaDto);


}