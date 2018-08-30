package br.com.sistemahospedagem.validation;

import br.com.sistemahospedagem.model.Cliente;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClienteVerificador{
    
    public static boolean verificar(Cliente novoCliente){
        boolean situacaoCadastrado = false;
        
        if(verificadorEmail(novoCliente.getEmail()) && verificadorPlacaCarro(novoCliente.getPlacaCarro())) {
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
     
    public static boolean verificadorPlacaCarro(String placa){//Mal funcionamento corrigir as letras, ve como deixar só elas ou um '&&'
        boolean situacaoPlaca = false;
        
        if(placa != null && placa.length() > 0){
            String expressãoPlaca = "\\w{3}-\\d{4}";
            Pattern pattern = Pattern.compile(expressãoPlaca, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(placa);
            
            if(matcher.matches()){
                situacaoPlaca = true;
            }
        }
        
        return situacaoPlaca;
    }
}