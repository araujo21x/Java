package sistemahospedagem;
public class Funcionario extends Pessoa{
    private String login;
    private String senha;
    private String entrada;
    private String cargo;
    private String diaPagamento;
    private String status;
    private double salario;
    
    public Funcionario(String login, String senha, String nome, String sobrenome, String nascimento, String sexo, String rua, String bairro, String cidade, 
            String numeroCasa, String telefone, String email, String saude, String entrada, String cargo, String diaPagamento, 
            String status, double salario) {
        super(nome, sobrenome, nascimento, sexo, rua, bairro, cidade, numeroCasa, telefone, email, saude);
        this.login = login;
        this.senha = senha;
        this.entrada = entrada;
        this.cargo = cargo;
        this.diaPagamento = diaPagamento;
        this.status = status;
        this.salario = salario;
    }
    
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
