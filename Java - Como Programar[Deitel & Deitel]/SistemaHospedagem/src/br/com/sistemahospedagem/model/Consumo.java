package br.com.sistemahospedagem.model;
public class Consumo {
    private String tipo;
    private Integer quantidade;
    private Double valor;
    private Double subtotal;
    
    public Consumo(){
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Double getSubtotal() {
        return subtotal = quantidade*valor;
    }

}
