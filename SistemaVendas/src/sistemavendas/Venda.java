//  @author Lucas de Araujo
package sistemavendas;

public class Venda {
    
    private int cod;
    private String situação;
    private String data;
    private Cliente cliente;
    private Vendedor vendedor;
    private String formapagamento;
    private double total;
    
    public Venda (int cod,String data, Cliente cliente, Vendedor vendedor, String formapagamento){
            
        this.cod= cod;
        this.data= data;
        this.cliente=cliente;
        this.vendedor= vendedor;
        this.formapagamento = formapagamento;
        this.situação  = "Ativa";
}

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getSituação() {
        return situação;
    }

    public void setSituação(String situação) {
        this.situação = situação;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    

    public String getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(String Formapagamento) {
        this.formapagamento = formapagamento;
    }  
    public void setTotalVenda(double subtotal){//para gerar total da vendaS
        this.total = this.total + subtotal;
    }
    public double getTotalVenda(){//para printar total da venda
        return this.total;
    }
}
