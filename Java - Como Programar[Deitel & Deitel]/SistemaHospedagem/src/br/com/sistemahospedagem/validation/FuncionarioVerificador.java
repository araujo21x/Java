package br.com.sistemahospedagem.validation;

import br.com.sistemahospedagem.model.Funcionario;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FuncionarioVerificador{
    
    public static boolean verificar(Funcionario novoFuncionario){
        boolean situacaoCadastrado = false;
        
        if(verificadorEmail(novoFuncionario.getEmail())) {
            situacaoCadastrado = true;
        }
        
        return situacaoCadastrado;
    }
    
    /*public boolean verificarCpf(String cpf){
        boolean situacaoCpf = false;
        
        if(cpf != null && cpf.length() > 0){
            
            
            situacaoCpf = true;
        }
        
        return situacaoCpf;
    }*/
    
    public static boolean verificadorEmail(String email){
        boolean situacaoEmail = false;
        
        if (email != null && email.length() > 0) {
            String expressãoEmail = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expressãoEmail, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
           
            if (matcher.matches()) {
                situacaoEmail = true;
            }
        }
        
        return situacaoEmail;
    }
    
    public static boolean verificadorData(String data){//tentar colocar caixa de data no swing e tirar isso
        boolean situacaoData = false;
        
        if(data != null && data.length() > 0){
            String expressãoData = "\\d{2}/\\d{2}/\\d{4}";
            Pattern pattern = Pattern.compile(expressãoData, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(data);
            
            if(matcher.matches()){
                situacaoData = true;
            }
        }
        
        return situacaoData;
    }   
    
}
