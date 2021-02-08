package exercicios;

import java.sql.SQLOutput;

public class Aplicacao {
    public static void main(String[] args) {

       //variáveis referentes aos exercícios 1 e 2
        int numero1 = 6;
        int numero2 = 5;

        //variáveis referentes ao exercício 3
        String nomeAluno = "Bruna Antunes";
        double notaAluno = 7.9;

        Calculadora calc = new Calculadora();
        Comparador comp = new Comparador();
        Aluno aluno = new Aluno(nomeAluno, notaAluno);


        int resultadoSoma = calc.soma(numero1, numero2);
        System.out.println(resultadoSoma);

        int resultadoSubtrai = calc.divide(numero1, numero2);
        System.out.println(resultadoSubtrai);

        int resultadoMultiplica = calc.multiplica(numero1, numero2);
        System.out.println(resultadoMultiplica);

        int resultadoDivide = calc.divide(numero1, numero2);
        System.out.println(resultadoDivide);

        //exercício 2

        System.out.println(comp.menorQue(numero1,numero2));

        //exercício 3
        System.out.println("O nome do(a) aluno(a) é: "+ aluno.getNome());
        System.out.println("A nota do(a) aluno(a) é: "+ aluno.getNota());
        System.out.println("Aprovado: "+ aluno.aprovado());



    }

}

