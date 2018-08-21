package sistemahospedagem;
public class Pessoa {
    private String nome;
    private String sobrenome;
    private String nascimento;
    private String sexo;
    private String rua;
    private String bairro;
    private String cidade;
    private String numeroCasa;
    private String telefone;
    private String email;
    private String saude;
    
    public Pessoa(String nome, String sobrenome, String nascimento, String sexo, String rua, String bairro, String cidade, 
            String numeroCasa,  String telefone,  String email, String saude){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nascimento= nascimento;
        this.sexo = sexo;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numeroCasa = numeroCasa;
        this.telefone = telefone;
        this.email = email;
        this.saude = saude;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSaude() {
        return saude;
    }

    public void setSaude(String saude) {
        this.saude = saude;
    }
    
}
