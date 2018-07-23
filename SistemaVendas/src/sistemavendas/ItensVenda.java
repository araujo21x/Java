//  @author Lucas de Araujo
package sistemavendas;

public class ItensVenda {
    
    private int cod;
    private  double desconto;
    private  Produto produto;
    private  int quantidade;
    private  double subtotal;
    private  Venda venda;
    private String  situaçao;
    private int itemGeral;

    public int getItemGeral() {
        return itemGeral;
    }

    public void setItemGeral(int itemGeral) {
        this.itemGeral += itemGeral;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getDesconto() {
        return desconto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public String getSituaçao() {
        return situaçao;
    }

    public void setSituaçao(String situaçao) {
        this.situaçao = situaçao;
    }

    
    
    
    
    
}
