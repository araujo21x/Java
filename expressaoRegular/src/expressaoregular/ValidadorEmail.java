package expressaoregular;

import javax.swing.JOptionPane;

public class ValidadorEmail {
    public static void main(String[] args) {
        String email = JOptionPane.showInputDialog("Informe o email:");
        Boolean retorno = email.matches("[a-z|A-Z].+@.+.com");
        System.out.println(retorno);
    }
}
