package br.com.banco.desgraca.exception;

public class OpcaoInvalida extends RuntimeException {

    public OpcaoInvalida(String mensagemDeErro) {
        super(mensagemDeErro);
    }
}