package sistemahospedagem;
public class Cliente extends Pessoa{
    private String placaCarro;
    private String observacao;
            
    public Cliente(String nome, String sobrenome, String nascimento, String sexo, String rua, String bairro, String cidade,
            String numeroCasa, String telefone, String email, String saude, String placaCarro, String observacao) {
        super(nome, sobrenome, nascimento, sexo, rua, bairro, cidade, numeroCasa, telefone, email, saude);
        this.placaCarro = placaCarro;
        this.observacao = observacao;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getObservação() {
        return observacao;
    }

    public void setObservação(String Observação) {
        this.observacao = Observação;
    }
    
}
