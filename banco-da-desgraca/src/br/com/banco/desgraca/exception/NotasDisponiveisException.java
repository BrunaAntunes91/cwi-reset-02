package br.com.banco.desgraca.exception;

public class NotasDisponiveisException extends RuntimeException {

    public NotasDisponiveisException(String mensagemDeErro) {
        super(mensagemDeErro);
    }
}
