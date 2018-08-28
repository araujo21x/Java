package sistemahospedagem;
public class Funcionario extends Pessoa{
    private String login;
    private String senha;
    private String entrada;
    private String cargo;
    private String diaPagamento;
    private String status;
    private Double salario;
   
    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDiaPagamento() {
        return diaPagamento;
    }

    public void setDiaPagamento(String diaPagamento) {
        this.diaPagamento = diaPagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
