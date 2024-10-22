package com.projeto_final.PrevisaoDoTempo.webservice;

import com.projeto_final.PrevisaoDoTempo.core.dto.dado_meteorologico.DadoRequestDto;
import com.projeto_final.PrevisaoDoTempo.core.dto.dado_meteorologico.DadoResponseDto;
import com.projeto_final.PrevisaoDoTempo.core.dto.estado.EstadoAtualizarDto;
import com.projeto_final.PrevisaoDoTempo.core.dto.estado.EstadoRequestDto;
import com.projeto_final.PrevisaoDoTempo.core.dto.estado.EstadoResponseDto;
import com.projeto_final.PrevisaoDoTempo.service.DadoMeteorologicoService;
import com.projeto_final.PrevisaoDoTempo.service.EstadoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/dado_meteorologico")
public class DadoMeteorologicoController {

    @Autowired
    DadoMeteorologicoService service;

    @PostMapping()
    public ResponseEntity<DadoResponseDto> registrar(@RequestBody DadoRequestDto requestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.cadastrarDado(requestDto));
    }
//
//    @GetMapping()
//    public ResponseEntity<List<EstadoResponseDto>> litaDeEstados(){
//        return ResponseEntity.status(HttpStatus.OK).body(service.buscar());
//    }
//
//    @GetMapping("/")
//    @ResponseBody
//    public ResponseEntity<EstadoResponseDto> buscarEstadosPorNome(@RequestParam(required = false) String nome) {
//        return ResponseEntity.status(HttpStatus.OK).body(service.buscarNome(nome));
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<EstadoResponseDto> buscarEstadosId(@PathVariable Long id) {
//        return ResponseEntity.status(HttpStatus.OK).body(service.buscar(id));
//    }
//
//    @PutMapping("{id}")
//    public ResponseEntity<EstadoResponseDto> atualizar(@PathVariable Long id, @RequestBody EstadoAtualizarDto estadoAtualizarDto){
//        return ResponseEntity.status(HttpStatus.OK).body(service.alterar(id, estadoAtualizarDto ));
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity deletar(@PathVariable Long id){
//        return ResponseEntity.status(HttpStatus.OK).body(service.excluir(id));
//    }
//
//    @DeleteMapping()
//    @ResponseBody
//    public ResponseEntity deletar(@RequestParam(required = false) String nome) {
//        return ResponseEntity.status(HttpStatus.OK).body(service.excluir(nome));
//    }

}
