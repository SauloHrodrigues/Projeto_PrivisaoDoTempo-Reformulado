package com.projeto_final.PrevisaoDoTempo.service.implementacoes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CidadeServiceOld {

//    private final CidadeRepository cidadeRepository;
//
//    private final DadoMeteorologicoRepository dadoRepository;
//
//    public CidadeResponseDto cadastrarCidade(CidadeRequestDdo cidadeRequestDdo) {
//
//        Cidade novaCidade = MapperCidade.dtoToEntity(cidadeRequestDdo);
//        novaCidade.setNome(cidadeRequestDdo.getNome());
//
//        if (cidadeRequestDdo.getDadosMeteorologicos() != null) {
//            DadoMeteorologico novoDado = criarNovoDado(cidadeRequestDdo.getDadosMeteorologicos());
//            novoDado.setCidade(novaCidade);
//            novaCidade.getDadosMeteorologicos().add(novoDado);
//        }
//        try {
//            cidadeRepository.save(novaCidade);
//        } catch (Exception e) {
//            throw new IllegalArgumentException("Cidade já cadastrada.");
//        }
//
//        return MapperCidade.entityToResponseDto(novaCidade);
//    }
//
//    public List<Cidade> listar() {
//
//        List<Cidade> response = cidadeRepository.findAll();
//        return response;
//    }
//
//    public CidadeResponseDto retornarDadosProximosSeteDias(String nomeDaCidade) {
//
//        Cidade cidadeBuscada = pesquisarCidade(nomeDaCidade);
//        List<DadoMeteorologico> todosDados = cidadeBuscada.getDadosMeteorologicos();
//        List<DadoMeteorologico> dadosSelecionados = new ArrayList<>();
//        LocalDate data = LocalDate.now();
//        LocalDate dataFutura = LocalDate.now().plusDays(7);
//
//        for (DadoMeteorologico dado : todosDados) {
//            if (dado.getData().isAfter(data) && dado.getData().isBefore(dataFutura.plusDays(1))) {
//                dadosSelecionados.add(dado);
//            }
//        }
//
//        CidadeResponseDto response = new CidadeResponseDto();
//        response.setId(cidadeBuscada.getId());
//        response.setNome(cidadeBuscada.getNome());
//        response.setDadosMeteorologicos(dadosSelecionados);
//        return response;
//    }
//
//    public CidadeResponseDto retornaDadosMeteorologicoPorCidade(String nomeDaCidade) {
//
//        Cidade cidadePesquisada = pesquisarCidade(nomeDaCidade);
//        return MapperCidade.entityToResponseDto(cidadePesquisada);
//    }
//
//    public ResponseEntity deletarCidade(String nomeDaCidade) {
//
//        Cidade cidadePesquisada = pesquisarCidade(nomeDaCidade);
//        cidadeRepository.deleteById(cidadePesquisada.getId());
//        return ResponseEntity.ok().build();
//    }
//
//    public CidadeResponseDto retornarDadosDeHoje(String nomeDaCidade) {
//
//        CidadeResponseDto cidadeBuscada = retornaDadosMeteorologicoPorCidade(nomeDaCidade);
//        List<DadoMeteorologico> dadoMeteorologicos = cidadeBuscada.getDadosMeteorologicos();
//        List<DadoMeteorologico> dadosDeHoje = new ArrayList<>();
//
//        for (DadoMeteorologico dado : dadoMeteorologicos) {
//            if (dado.getData().equals(LocalDate.now())) {
//                dadosDeHoje.add(dado);
//            }
//        }
//        CidadeResponseDto response = new CidadeResponseDto();
//        response.setId(cidadeBuscada.getId());
//        response.setNome(cidadeBuscada.getNome());
//        response.setDadosMeteorologicos(dadosDeHoje);
//        return response;
//    }
//
//    private Cidade pesquisarCidade(String nomeDaCidade) {
//
//        return cidadeRepository.findByNome(nomeDaCidade).orElseThrow(() -> new NoSuchElementException(
//                "Cidade não encontrada"));
//    }
//
//    private DadoMeteorologico criarNovoDado(DadoMeteorologicoRequestDto dados) {
//
//        DadoMeteorologico novoDado = new DadoMeteorologico();
//        novoDado.setData(dados.getData());
//        novoDado.setTemperaturaMinima(dados.getTemperaturaMinima());
//        novoDado.setTemperaturaMaxima(dados.getTemperaturaMaxima());
//        novoDado.setTurno(dados.getTurno());
//        novoDado.setClima(dados.getClima());
//        novoDado.setPrecipitacao(dados.getPrecipitacao());
//        dadoRepository.save(novoDado);
//        return novoDado;
//    }
}