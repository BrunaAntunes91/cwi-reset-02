

public class PropostaFinanciamento {



    private Beneficiario beneficiario;
    private  Imovel imovelEscolhido;
    private int mesesParaPagamento;

    public PropostaFinanciamento(Beneficiario beneficiario, Imovel imovelEscolhido, int mesesParaPagamento) {
        this.beneficiario = beneficiario;
        this.imovelEscolhido = imovelEscolhido;
        this.mesesParaPagamento = mesesParaPagamento;
    }


    /**
     * Valida a proposta de financiamento e apresenta o resultado para o cliente.
     *
     * A proposta de financiamento é aceita somente se o salário do beneficiário multiplicado pelo prazo de pagamento
     *   for equivalente a pelo menos 50% do valor do imóvel.
     *
     *   Esta regra possui duas exceções: se o imóvel se localiza no estado SP ou RJ,
     *      o salário multiplicado pelo prazo deve ser equivalente a 65% e 60% do valor imóvel (respectivamente).
     */
    public void validarProposta() {
        if (this.imovelEscolhido.getEndereco().getEstado() == UnidadeFederativa.SAO_PAULO && this.beneficiario.getSalario() * this.mesesParaPagamento < (this.imovelEscolhido.getValor() * 0.65)){
            System.out.printf("Desculpe, mas o seu salário não é suficiente para adquirir um imóvel com este valor em SP");
        }
        else if (this.imovelEscolhido.getEndereco().getEstado() == UnidadeFederativa.RIO_DE_JANEIRO && this.beneficiario.getSalario() * this.mesesParaPagamento < (this.imovelEscolhido.getValor() * 0.6)){
            System.out.printf("Desculpe, mas o seu salário não é suficiente para adquirir um imóvel com este valor no RJ");
        }
        else if (this.imovelEscolhido.getEndereco().getEstado() != UnidadeFederativa.SAO_PAULO &&
                this.imovelEscolhido.getEndereco().getEstado() != UnidadeFederativa.RIO_DE_JANEIRO && this.beneficiario.getSalario() * this.mesesParaPagamento < (this.imovelEscolhido.getValor() * 0.5))
        {
            System.out.printf("Desculpe, mas o seu salário não é suficiente para adquirir este imóvel em %s.", this.imovelEscolhido.getEndereco().getEstado());
        }
        else{
            System.out.printf("Parabéns! Sua proposta de financiamento está aprovada. Seguem os dados: \nImóvel: %s %s %s, %s, %s\nNo valor de: %s \nSerá seu por %s x de %s ",
                    this.imovelEscolhido.getEndereco().getLogradouro(),this.imovelEscolhido.getEndereco().getNumero(), this.imovelEscolhido.getEndereco().getComplemento(),
                    this.imovelEscolhido.getEndereco().getBairro(), this.imovelEscolhido.getEndereco().getCidade(), imovelEscolhido.getValor(),
                    this.mesesParaPagamento, this.imovelEscolhido.getValor() / this.mesesParaPagamento);
        }
    }
}
