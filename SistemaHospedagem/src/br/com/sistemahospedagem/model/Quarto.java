package br.com.sistemahospedagem.model;
public class Quarto {
    private Integer quantidadeCama;
    private double diaria;
    private String tipoCama;
    private String ventilacao;
    private String status;
    private String numero;
    
    public Quarto(Integer quantidadeCama, double diaria, String tipoCama, String ventilacao, String status, String numero){
        this.quantidadeCama = quantidadeCama;
        this.diaria = diaria;
        this.tipoCama = tipoCama;
        this.ventilacao = ventilacao;
        this.status = status;
        this.numero = numero;
    }

    public Integer getQuantidadeCama() {
        return quantidadeCama;
    }

    public void setQuantidadeCama(Integer quantidadeCama) {
        this.quantidadeCama = quantidadeCama;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public String getVentilacao() {
        return ventilacao;
    }

    public void setVentilacao(String ventilacao) {
        this.ventilacao = ventilacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
