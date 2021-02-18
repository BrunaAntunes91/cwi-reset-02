public class Imovel {


    private double valor;
    private Endereco endereco;

    public Imovel(Endereco endereco, double valor) {
        this.endereco = endereco;
        this.valor=valor;

    }
    public String apresentacao(){

        return String.format("Imóvel localizado no endereço %s %s %s, %s, %s", endereco.getLogradouro(), endereco.getNumero(),
                endereco.getComplemento(),endereco.getBairro(), endereco.getCidade(),endereco.getEstado());
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }
}
