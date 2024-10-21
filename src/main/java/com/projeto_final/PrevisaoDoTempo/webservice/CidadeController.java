package com.projeto_final.PrevisaoDoTempo.webservice;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/cidade")
public class CidadeController {

//    private final CidadeService cidadeService;

//    @PostMapping("/")
//    public ResponseEntity<CidadeResponseDto> cadastraCidade(@RequestBody CidadeRequestDdo requisicao ){
//        CidadeResponseDto responseDto = cidadeService.cadastrarCidade(requisicao);
//        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
//    }
//
//    @GetMapping("/")
//    public List<Cidade> lista(){
//        return cidadeService.listar();
//    }
//
//    @GetMapping("/{cidade}/proximos_sete_dias")
//    CidadeResponseDto  ultimos07Dias(@PathVariable("cidade") String cidade){
//        return cidadeService.retornarDadosProximosSeteDias(cidade);
//    }
//
//    @GetMapping("/{cidade}/hoje")
//    CidadeResponseDto  dadosDeHoje(@PathVariable("cidade") String cidade){
//        return cidadeService.retornarDadosDeHoje(cidade);
//    }
//
//
//    @GetMapping("/{cidade}")
//    public CidadeResponseDto pesquisarCidade(@PathVariable("cidade") String nomeCidade){
//        return cidadeService.retornaDadosMeteorologicoPorCidade(nomeCidade);
//    }
//
//    @DeleteMapping("/{cidade}")
//    public ResponseEntity deletarCidade(@PathVariable("cidade") String nomeCidade){
//        return cidadeService.deletarCidade(nomeCidade);
//    }
}