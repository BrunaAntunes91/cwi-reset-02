package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;

import java.util.ArrayList;
import java.util.List;

public class RegistroDeContas {
    private List<ContaBancaria> contas;

    public RegistroDeContas() {
        contas = new ArrayList<>();

    }

    public void registrarConta(ContaBancaria conta){
        contas.add(conta);
    }

    public ContaBancaria buscarConta(InstituicaoBancaria banco, Integer numeroConta){
        ContaBancaria conta = null;

        for (ContaBancaria contaBancaria : this.contas) {
            if (contaBancaria.getInstituicaoBancaria() == banco && contaBancaria.getNumeroDeContaCorrente().equals(numeroConta)){
                conta = contaBancaria;
                break;
            }
        }

        if (conta == null){
            throw new RuntimeException("Conta não encntrada!");
        }

        return conta;
            
    }

}
