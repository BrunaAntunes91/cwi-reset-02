package br.com.banco.desgraca.domain;

import br.com.banco.desgraca.Data;

import java.time.LocalDate;

public class Transacao {
    private String tipoDeTransacao;

    private Data dataDaTransacao;
    private Double valorDaTransacao;


    public Transacao(String tipoDeTransacao, Data dataDaTransacao, Double valorDaTransacao) {
        this.tipoDeTransacao = tipoDeTransacao;
        this.dataDaTransacao = dataDaTransacao;
        this.valorDaTransacao = valorDaTransacao;

    }
    public String getTipoDeTransacao() {
        return tipoDeTransacao;
    }

    public Data getDataDaTransacao() {
        return dataDaTransacao;
    }

    public Double getValorDaTransacao() {
        return valorDaTransacao;
    }
}