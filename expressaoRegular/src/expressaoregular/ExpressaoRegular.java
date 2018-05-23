package expressaoregular;

import javax.swing.JOptionPane;
        
public class ExpressaoRegular {
    public static void main(String[] args) {
        /*String palavra = JOptionPane.showInputDialog("Informe a palavra:");
        Boolean retorno = palavra.matches("(?i)computação");
        System.out.println(retorno); */
        
        
        System.out.println("computação".matches("Computação"));//matches vai comparar a primeira palavra com a segunda.
        System.out.println("ab".matches("..")); //"." significa que pode ser qualquer coisa.
        System.out.println("57".matches("\\d\\d"));//\\d significa que precisa ser numero .
        System.out.println("a".matches("\\D"));//\\D não pode ser numero, se tiver numero dá false.
        System.out.println("3a".matches("\\d\\D"));//precisa colocar a mesma quanidade de meta caractere e letras, compara um por um.
        System.out.println(" ".matches("\\s"));//compara espaço.
        System.out.println("@".matches("\\w"));//compara letras e numeros, vai da erro pq e um simbolo.
        System.out.println("@".matches("\\W"));//perimite qualquer caractere.
    }
}