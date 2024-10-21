package com.projeto_final.PrevisaoDoTempo.mapper;

import com.projeto_final.PrevisaoDoTempo.core.dto.cidade.CidadeResponseDto;
import com.projeto_final.PrevisaoDoTempo.core.entities.Cidade;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CidadeMapper {

    CidadeMapper INSTANCE = Mappers.getMapper(CidadeMapper.class);

//    @Mapping(target = "id", ignore = true)
//    Cidade dtoToCidada(CidadeRequestDdo dto);

    CidadeResponseDto cidadeToResponseDto(Cidade cidade);
}