//  @author Lucas de Araujo
package sistemavendas;

public class Cliente {
    
    private int cod;
    private String nome;
    private String endereço;
    
    public  Cliente(int cod, String nome, String endereço) {
        
        this.cod= cod;
        this.nome= nome;
        this.endereço= endereço;
        
        
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
}
