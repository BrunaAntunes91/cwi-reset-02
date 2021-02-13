package exercicio01;

public class Filme {
    private String nome;
    private String descricao;
    private int duracao;
    private int ano;
    private double nota;
    private Diretor diretor;

    public Filme(String nome, String descricao, int duracao, int ano, double nota, Diretor diretor) {
        this.nome=nome;
        this.descricao= descricao;
        this.duracao= duracao;
        this.ano = ano;
        this.nota = nota;
        this.diretor = diretor;
    }


    public void exibir(){
        System.out.println("Nome Filme " +this.nome);
        System.out.println("Deescrição " + this.descricao);
        System.out.println("Duração " + this.duracao);
        System.out.println("Nome do diretor: "+ diretor.getNome());
    }
    }