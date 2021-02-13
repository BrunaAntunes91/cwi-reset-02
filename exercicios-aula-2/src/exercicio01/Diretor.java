package exercicio01;

public class Diretor {
    private String nome;
    private int idade;
    private int numeroDeFilmesDirigidos;

    public Diretor(String nome,int idade, int numeroDeFilmesDirigidos) {
        this.nome = nome;
        this.idade = idade;
        this.numeroDeFilmesDirigidos = numeroDeFilmesDirigidos;

    }
    public String getNome(){
        return this.nome;
    }
}
