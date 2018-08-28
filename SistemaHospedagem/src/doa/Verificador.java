package doa;

import sistemahospedagem.Cliente;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verificador{
    
    public static boolean verificar(Cliente novoCliente){
        boolean situacaoCadastrado = false;
        
        if(verificadorEmail(novoCliente.getEmail()) && verificadorCelular(novoCliente.getCelular()) 
                && verificadorData(novoCliente.getNascimento()) && verificadorCep(novoCliente.getCep())
                && verificadorPlacaCarro(novoCliente.getPlacaCarro())) {
            situacaoCadastrado = true;
        }//fmaskdmfkaskdmfklamçlfmasçmdfklamçeklfmasl
        
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
            
        }

        return situacaoCelular;
    }
    
    public static boolean verificadorData(String data){
        boolean situacaoData = false;
        
        if(data != null && data.length() > 0){
            
            
            situacaoData = true;
        }
        
        return situacaoData;
    }
    
    public static boolean verificadorCep(String cep){
        boolean situacaoCep = false;
        
        if(cep != null && cep.length() > 0){
            String expressãoCep = "\\d{5}-\\d{3}";
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
            
            situacaoPlaca = true;
        }
        
        return situacaoPlaca;
    }
}
