package pkg3.pkg12;
// @author lucas

import javax.swing.JOptionPane;

public class Invoice {
    private String numero, descricao;
    private  int quantidade;
    private  double valor;
    
    public Invoice(String numero, String descricao, int quantidade, double valor){
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
        
        if(quantidade < 0){
            this.quantidade = 0;
        }
        if(valor < 0.0){
            this.valor = 0;
        }
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setQuantidade(int quantidade){
        if(quantidade >= 0){
            this.quantidade = quantidade;
        }else{
            JOptionPane.showMessageDialog(null, "Erro no valor informado");
        }
    }
    public void setValor(double valor){
        if(valor >= 0.0){
           this.valor = valor; 
        }else{
            JOptionPane.showMessageDialog(null, "Erro no valor informado");
        }
    }
    public String getNumero(){
        return numero;
    }
    public String getDescricao(){
        return descricao;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public double getValor(){
        return valor;
    }
    public double getInvoiceAmount(){
        return (valor*quantidade);
    }
}
