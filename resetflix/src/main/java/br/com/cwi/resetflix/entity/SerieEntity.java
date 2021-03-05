package br.com.cwi.resetflix.entity;

import br.com.cwi.resetflix.domain.Genero;

import java.util.List;

public class SerieEntity {
    private Long id;
    private String nome;
    private Integer temporadas;
    private Integer episodios;
    private Genero genero;
    private List<Long> idsAtores;


    public SerieEntity(Long id, String nome, Integer temporadas, Integer episodios, Genero genero, List<Long> idsAtores) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.temporadas = temporadas;
        this.episodios = episodios;
        this.idsAtores = idsAtores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }

    public Integer getEpisodios() {
        return episodios;
    }

    public void setEpisodios(Integer episodios) {
        this.episodios = episodios;
    }

    public List<Long> getIdsAtores() {
        return idsAtores;
    }

    public void setIdsAtores(List<Long> idsAtores) {
        this.idsAtores = idsAtores;
    }
}
