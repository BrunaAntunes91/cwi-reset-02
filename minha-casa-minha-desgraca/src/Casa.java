public class Casa extends Imovel{

    private boolean temPatio;

    public Casa(Endereco endereco, double valor, boolean temPatio){
        super(endereco, valor);
        this.temPatio = temPatio;

    }

    public boolean temPatio() {
        return temPatio;
    }
}
