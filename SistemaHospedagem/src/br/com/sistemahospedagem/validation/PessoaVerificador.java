package br.com.sistemahospedagem.validation;

import br.com.sistemahospedagem.model.Cliente;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PessoaVerificador{
    
    public static boolean verificar(Cliente novoCliente){
        boolean situacaoCadastrado = false;
        
        if(verificadorCelular(novoCliente.getCelular())) {
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
    
    public static boolean verificadorCelular(String celular){
        boolean situacaoCelular = false;
        
        if(celular != null && celular.length() > 0){
            String expressãoCelular = "9\\[0-9]{4}-\\[0-9]{4}";
            Pattern pattern = Pattern.compile(expressãoCelular, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(celular);
            
            if(matcher.matches()){
                situacaoCelular = true;
            }
        }

        return situacaoCelular;
    }
    
    public static boolean verificadorData(String data){
        boolean situacaoData = false;
        
        if(data != null && data.length() > 0){
            String expressãoData = "\\[0-9]{2}/\\[0-9]{2}/\\[0-9]{4}";
            Pattern pattern = Pattern.compile(expressãoData, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(data);
            
            if(matcher.matches()){
                situacaoData = true;
            }
        }
        
        return situacaoData;
    }
    
    public static boolean verificadorCep(String cep){
        boolean situacaoCep = false;
        
        if(cep != null && cep.length() > 0){
            String expressãoCep = "\\[0-9]{5}-\\[0-9]{3}";
            Pattern pattern = Pattern.compile(expressãoCep, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(cep);
            
            if(matcher.matches()){
                situacaoCep = true;
            }
        }
        
        return situacaoCep;
    }
    
    public static boolean verificadorPlacaCarro(String placa){
        boolean situacaoPlaca = false;
        
        if(placa != null && placa.length() > 0){
            String expressãoPlaca = "\\[a-zA-Z]{3}-\\[0-9]{3}";
            Pattern pattern = Pattern.compile(expressãoPlaca, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(placa);
            
            if(matcher.matches()){
                situacaoPlaca = true;
            }
        }
        
        return situacaoPlaca;
    }
}
