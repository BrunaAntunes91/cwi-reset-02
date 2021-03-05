package br.com.cwi.resetflix.web;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.request.CriarFilmeRequest;
import br.com.cwi.resetflix.request.CriarSerieRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;
import br.com.cwi.resetflix.response.FilmeResponse;
import br.com.cwi.resetflix.response.SerieResponse;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
@RestController
@RequestMapping("/series")
public class SeriesController implements SeriesContract  {

    //TODO Implementar service

    @Override
    @GetMapping
    public List<SerieResponse> getSeries(@RequestParam(value = "genero", required = false) final Genero genero) {
        //TODO realizar chamada
        return Collections.emptyList();
    }

    @Override
    @GetMapping("/{id}")
    public ConsultarDetalhesSerieResponse getSerieById(@PathVariable("id") final Long id) {
        //TODO realizar chamada
        return null;
    }

    @Override
    @PostMapping
    public Long criarSerie(@RequestBody final CriarSerieRequest request) {
        //TODO realizar chamada
        return null;
    }



    @Override
    @PostMapping("/{id}/assistir")
    public void assistirSerie(@PathVariable("id") Long id, Integer temporada, Integer episodio) {

    }

    @Override
    @GetMapping("/recomendacoes")
    public List<SerieResponse> getSeries() {
        //TODO realizar chamada
        return Collections.emptyList();
    }


}
