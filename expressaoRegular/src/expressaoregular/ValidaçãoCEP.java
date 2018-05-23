package expressaoregular;

import javax.swing.JOptionPane;

public class ValidaçãoCEP {
    public static void main(String[] args) {
        String cep = JOptionPane.showInputDialog("Informe o CEP (exemplo: 11111-000):");
        Boolean retorno = cep.matches("\\d{5}-\\d{3}");
        System.out.println(retorno);
    }
}
