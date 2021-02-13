package exercicio01;

public class Aplicacao {
    public static void main(String[] args) {
        Diretor RobertStromberg = new Diretor("Robert Stromberg", 56,13);
        Diretor  JamesCameron = new Diretor (" James Cameron", 66, 50);
        Filme malevola = new Filme("Malévoa","Muito bom", 87, 2014, 4.7, RobertStromberg);

        Filme titanic = new Filme("Titanic", "Clássico", 210,1995,4.7, JamesCameron);

        titanic.exibir();
        malevola.exibir();

    }
}
