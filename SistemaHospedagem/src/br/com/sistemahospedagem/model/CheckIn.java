package br.com.sistemahospedagem.model;

public class CheckIn {
    private Cliente cliente;
    //private Consumo consumo;
    private Quarto quarto;
    private Integer dias;
    private Integer pessoas;
    private Integer quantidadeQuartos;
    
    public CheckIn(){
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente clienteSelecionado) {
        this.cliente = clienteSelecionado;
    }

    /*public Consumo getConsumo() {
        return consumo;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }*/

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quartoSelecionado) {
        this.quarto = quartoSelecionado;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public Integer getPessoas() {
        return pessoas;
    }

    public void setPessoas(Integer pessoas) {
        this.pessoas = pessoas;
    }

    public Integer getQuantidadeQuartos() {
        return quantidadeQuartos;
    }

    public void setQuantidadeQuartos(Integer quantidadeQuartos) {
        this.quantidadeQuartos = quantidadeQuartos;
    }

}
