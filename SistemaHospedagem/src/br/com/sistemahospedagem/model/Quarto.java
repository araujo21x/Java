package br.com.sistemahospedagem.model;
public class Quarto {
    private Integer quantidadeCamaCasal;
    private Integer quantidadeCamaSolteiro;
    private String tipoCama;
    private String ventilacao;
    private String status;
    private String numero;  

    public Quarto() {
         
    }

    public Integer getQuantidadeCamaCasal() {
        return quantidadeCamaCasal;
    }

    public void setQuantidadeCamaCasal(Integer quantidadeCamaCasal) {
        this.quantidadeCamaCasal = quantidadeCamaCasal;
    }

    public Integer getQuantidadeCamaSolteiro() {
        return quantidadeCamaSolteiro;
    }

    public void setQuantidadeCamaSolteiro(Integer quantidadeCamaSolteiro) {
        this.quantidadeCamaSolteiro = quantidadeCamaSolteiro;
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
