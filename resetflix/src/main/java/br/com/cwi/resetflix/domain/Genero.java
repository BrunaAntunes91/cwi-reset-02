package br.com.cwi.resetflix.domain;

public enum Genero {
    ACAO("Ação"),
    COMEDIA("Comédia"),
    DRAMA("Drama"),
    EPICO("Épico"),
    LENDARIO("Lendário"),
    RUIM("Ruim"),
    SUSPENSE("Suspense"),
    TERROR("Terror"),
    FICCAO_CIENTIFICA("Ficção Científica");

    private String genero;

    Genero(String genero){
        this.genero = genero;
    }

    public String getGenero() {

        return genero;
    }
}
