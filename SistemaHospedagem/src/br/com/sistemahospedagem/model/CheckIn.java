package br.com.sistemahospedagem.model;

import java.util.ArrayList;
import java.util.List;

public class CheckIn {
    private List<Consumo> ConsumoCliente;
    private Cliente cliente;
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

    public List<Consumo> getConsumoCliente() {
        return ConsumoCliente;
    }

    public void setConsumoCliente(Consumo Consumonovo) {
        if(ConsumoCliente == null){
            ConsumoCliente = new ArrayList<>();
        }
        ConsumoCliente.add(Consumonovo);  
    }
    
}
