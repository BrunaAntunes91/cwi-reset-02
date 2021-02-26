package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.conta.*;
import br.com.banco.desgraca.exception.OpcaoInvalida;

import java.util.Scanner;
//import br.com.banco.desgraca.domain.conta.ContaPoupanca;


public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        RegistroDeContas registroDeContas = new RegistroDeContas();


        registroDeContas.registrarConta(new ContaCorrente(5555,InstituicaoBancaria.BRADESCO, 1500));
        registroDeContas.registrarConta(new ContaCorrente(9355, InstituicaoBancaria.NUBANK, 15.76));
        registroDeContas.registrarConta(new ContaCorrente(3409,InstituicaoBancaria.CAIXA,21345.57));
        registroDeContas.registrarConta(new ContaCorrente(3409,InstituicaoBancaria.CAIXA,245.75));
        registroDeContas.registrarConta(new ContaPoupanca(8957,InstituicaoBancaria.BANCO_DO_BRASIL,21870.89));
        registroDeContas.registrarConta(new ContaDigital(3597,InstituicaoBancaria.NUBANK,6457.32));
        registroDeContas.registrarConta(new ContaPoupanca(8971,InstituicaoBancaria.BANCO_DO_BRASIL,781.98));
        registroDeContas.registrarConta(new ContaDigital(2222,InstituicaoBancaria.ITAU,-45.70));
        registroDeContas.registrarConta(new ContaPoupanca(8998,InstituicaoBancaria.BRADESCO,561.90));
        registroDeContas.registrarConta(new ContaCorrente(1023,InstituicaoBancaria.ITAU,15.30));
        registroDeContas.registrarConta(new ContaCorrente(5478,InstituicaoBancaria.BANCO_DO_BRASIL,345.98));
        registroDeContas.registrarConta(new ContaCorrente(7408,InstituicaoBancaria.NUBANK, -36.09));
        registroDeContas.registrarConta(new ContaCorrente(99987,InstituicaoBancaria.ITAU, 1460));
        registroDeContas.registrarConta(new ContaPoupanca(3986,InstituicaoBancaria.CAIXA, 10000));
        registroDeContas.registrarConta(new ContaCorrente(3232, InstituicaoBancaria.BRADESCO,350.56));
        registroDeContas.registrarConta(new ContaPoupanca(3674,InstituicaoBancaria.ITAU, 2056.67));
        registroDeContas.registrarConta(new ContaCorrente(8972,InstituicaoBancaria.BANCO_DO_BRASIL, 145.50));




        System.out.println("\n ### Olá, Bem-vindo ao Banco Da Desgraça! ###\n");
        //o programa dá erro se eu responder com a String, preciso escrever como está no ENUM. EX: BANCO_DO_BRASIL e não Banco do Brasil. Não consegui  resolver. :(
        System.out.println("\n Qual é o seu banco?\n");
        InstituicaoBancaria banco = InstituicaoBancaria.valueOf(new Scanner(System.in).next());

        System.out.println("\n Qual é o número da sua conta?\n");
        Integer numeroConta = new Scanner(System.in).nextInt();

        ContaBancaria conta = registroDeContas.buscarConta(banco, numeroConta);


        System.out.println("\n\nDigite 1 Para consultar seu SALDO." +
                "\nDigite 2 Para DEPÓSITO.\nDigite 3 para SAQUE." +
                "\nDigite 4 Para TRANSFERÊNCIA.\nDigite 5 Para consultar seu EXTRATO." +
                "\nDigite 9 Para SAIR.");

        int acao = new Scanner(System.in).nextInt();

        while(acao != 9){
            if (acao == 1) {//Saldo
                conta.consultarSaldo();
            } else if (acao == 2) { //Deposito

                System.out.println("\nQual valor você gostaria de depositar?\n");

                double valor = new Scanner(System.in).nextDouble();
                conta.depositar(valor);

                System.out.println("\nDeposito feito com sucesso\n");
                conta.consultarSaldo();


            } else if (acao == 3) { //SAQUE
                System.out.println("\nQual valor você gostaria de sacar?\n");

                double valor = new Scanner(System.in).nextDouble();
                conta.sacar(valor);

                System.out.println("\nSaque realizado com sucesso!\n\nRetire o seu dinheiro.\n");
                conta.consultarSaldo();

            }else if (acao==4) { //TRANSFERÊNCIA
                System.out.println("\nPara qual Instituição bancária você deseja transferir?\n");
                InstituicaoBancaria bancoDestino = InstituicaoBancaria.valueOf(new Scanner(System.in).next());

                System.out.println("\nPara qual conta você deseja transferir?\n");
                Integer numeroContaDestino = new Scanner(System.in).nextInt();
                ContaBancaria contaDestino = registroDeContas.buscarConta(bancoDestino, numeroContaDestino);

                System.out.println("\nQual valor você gostaria de transferir?\n");

                double valor = new Scanner(System.in).nextDouble();
                conta.transferir(valor, contaDestino);

                System.out.println("\nTransferência feita com sucesso\n");
                conta.consultarSaldo();


            }else if (acao==5) { //EXTRATO
                conta.exibirExtrato(null, null);
            }else
                throw new OpcaoInvalida("\nOpção Inválida!\n\nComece novamente." );

            System.out.println("\n\nDigite 1 Para consultar seu SALDO." +
                    "\nDigite 2 Para DEPÓSITO.\nDigite 3 para SAQUE." +
                    "\nDigite 4 Para TRANSFERÊNCIA.\nDigite 5 Para consultar seu EXTRATO." +
                    "\nDigite 9 Para SAIR.");
            acao = new Scanner(System.in).nextInt();
        }

    }



}

