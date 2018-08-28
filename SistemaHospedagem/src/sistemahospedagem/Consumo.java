package sistemahospedagem;
public class Consumo {
    private String tipo;
    private Integer quantidade;
    private double valor;
    private double subtotal;
    
    public Consumo(String tipo, Integer quantidade, double valor, double subtotal){
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.subtotal = subtotal;
        this.valor = valor;
        
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
