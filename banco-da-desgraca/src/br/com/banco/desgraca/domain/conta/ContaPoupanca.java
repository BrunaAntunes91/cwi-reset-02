
package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.exception.SaldoInsuficienteException;
import br.com.banco.desgraca.exception.ValorMinimoException;

import java.time.LocalDate;


public class ContaPoupanca implements ContaBancaria {
    private Integer numeroDeContaCorrente;
    private InstituicaoBancaria banco;
    private String extrato;
    private double saldo;

    public ContaPoupanca(Integer numeroDeContaCorrente, InstituicaoBancaria banco, double saldo) {
        this.numeroDeContaCorrente = numeroDeContaCorrente;
        this.banco = banco;
        this.saldo = saldo;
        this.extrato= "";
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
        if (valor < saldo) {
            throw new SaldoInsuficienteException("Você não tem saldo suficiente.");
        }
        else if (valor >= 50){
            valor = valor * 1.2;
            System.out.println("Sacando o valor de R$" + valor);
            this.saldo -= valor;
            this.extrato += String.format("\n-  %s   %s", valor, new Data().getDataTransacao());
        }
        else
            throw new ValorMinimoException("Atenção!\n\nO valor mínimo para saque é de R$50,00");
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
            if (valor < saldo){
                throw new SaldoInsuficienteException("Você não tem saldo suficiente.");
            }
            else if(banco==contaDestino.getInstituicaoBancaria()){
            valor = valor * 1.05;
            System.out.println(" Transferindo o valor de R$" + valor +" Para a conta " + contaDestino);
            }
            else{
            valor = valor * 1.1;
            }


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





