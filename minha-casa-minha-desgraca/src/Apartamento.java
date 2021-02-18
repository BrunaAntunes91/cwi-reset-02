import java.util.RandomAccess;

public class Apartamento extends Imovel {

    private int andar;

    public Apartamento(Endereco endereco, double valor, int andar){
        super(endereco, valor);
        this.andar = andar;
    }


    public int getAndar() {
        return andar;
    }
}
