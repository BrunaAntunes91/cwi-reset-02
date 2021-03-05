package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.entity.SerieEntity;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

public class SerieRepository {
    static List<SerieEntity> series = Collections.singletonList(
            new SerieEntity(2l,"Friends", 10,240, Genero.COMEDIA, asList(2l)));

    public List<SerieEntity> getSeries(){
        return series;
    }

    public List<SerieEntity> acharSeriesAtor(final Long id) {
        //TODO Filtrar na repository por id de ator
        return series;
    }
}
