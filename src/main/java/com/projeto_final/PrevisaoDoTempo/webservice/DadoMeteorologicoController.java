package com.projeto_final.PrevisaoDoTempo.webservice;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/previsao/clima/dados")
public class DadoMeteorologicoController {

//   private final DadosMeteorologicosServiceOld service;
//
////    cadastrar dados
//    @PostMapping("/")
//    void cadastrarNovoDadoMeteorologico(@RequestBody DadoMeteorologicoRequestDto novosDados){
//        service.cadastrarDado(novosDados);
//    }
////    Apagar dados
//    @DeleteMapping("/{id}")
//    void deletarDadoMeteorologico(@PathVariable("id") Long id){
//        service.deletarDadoPorId(id);
//    }
//
//    @PutMapping("/{id}")
//    ResponseEntity<DadoMeteorologicoResponseDto> alterarDado(@PathVariable("id") Long id, @RequestBody DadoMeteorologicoResponseDto dto){
//        service.alterarDado(id,dto);
//
//        return null;
//    }
}
