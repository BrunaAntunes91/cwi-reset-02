package br.com.banco.desgraca.domain;

public enum TipoTransacao {

    CONSULTAR_SALDO("Consultar o saldo"),
    DEPOSITO("Depositar"),
    EXIBIR_EXTRATO("Exibir extrato"),
    SAQUE("Sacar"),
    TRANSFERENCIA("Tranferir");

    private String transacao;

    TipoTransacao(String transacao) {

        this.transacao = transacao;
    }

    public String getTransacao() {
        return transacao;
    }
}
