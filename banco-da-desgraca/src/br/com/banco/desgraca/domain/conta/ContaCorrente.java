package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.exception.NotasDisponiveisException;
import br.com.banco.desgraca.exception.SaldoInsuficienteException;

import java.time.LocalDate;

public class ContaCorrente implements ContaBancaria {

    private Integer numeroDeContaCorrente;
    private InstituicaoBancaria banco;
    private String extrato;
    private double saldo;

    public ContaCorrente(Integer numeroDeContaCorrente, InstituicaoBancaria banco, double saldo) {
        this.numeroDeContaCorrente = numeroDeContaCorrente;
        this.banco = banco;
        this.saldo = saldo;
        this.extrato = "";
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return this.banco;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("O seu saldo é R$ " + saldo);
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
        this.extrato += String.format("\n+  %s   %s", valor, new Data().getDataTransacao());
        System.out.println("Depositando o valor de R$" +valor);

    }

    @Override
    public void sacar(Double valor) {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Você não tem saldo suficiente.");

        } else if (valor % 5 != 0) {
            throw new NotasDisponiveisException("Atenção!\n\n Notas disponíveis: R$5, R$10, R$20, R$ 50, R$100, R$200");

        }
        else{
            this.saldo -= valor;
            this.extrato += String.format("\n-  %s   %s", valor, new Data().getDataTransacao());
        }
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Você não tem saldo suficiente.");
        }

        contaDestino.depositar(valor);
        this.saldo -= valor;
        this.extrato += String.format("\n-  %s   %s", valor, new Data().getDataTransacao());

    }
    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
        System.out.println(this.extrato);
    }

    @Override
    public Integer getNumeroDeContaCorrente() {
        return numeroDeContaCorrente;
    }
}
