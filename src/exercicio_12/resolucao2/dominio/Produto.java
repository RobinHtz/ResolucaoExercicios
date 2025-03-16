package exercicio_12.resolucao2.dominio;

public class Produto {
    private double valor;
    private FormaPagamento formaPagamento;

    public Produto() {
    }

    public Produto(double valor, FormaPagamento formaPagamento) {
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
