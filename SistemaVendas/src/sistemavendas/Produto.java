//  @author Lucas de Araujo
package sistemavendas;

public class Produto {
    
    private int cod;
    private int quantidade;
    private double valorUnit;
    private String tipo;
    private String nome;
    
     public Produto(int cod, int quantidade, double valorUnit, String tipo, String nome) {
 
         this.cod= cod;
         this.quantidade= quantidade;
         this.valorUnit= valorUnit;
         this.tipo= tipo;
         this.nome=nome;
}

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
   
    
}
