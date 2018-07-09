// @author lucas
import javax.swing.JOptionPane;
        
public class AccountTest {
    public static void main(String[] args){
        
        String name = JOptionPane.showInputDialog(null, "Informe seu nome");
        double balance = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do seu saldo:"));
        
        Account myAccount = new Account(name, balance);
        
        int menu;
        
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Para depositar algum valor:\n2 - Para retirar algum valor:\n3 - para mostrar saldo:\n4 - Para Sair do programa:"));
            
            switch(menu){
                case 1:
                    double depositAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor para depositar:"));
                    myAccount.deposit(depositAmount);
                break;
                
                case 2:
                    double withdrawAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor para Sacar:"));
                    myAccount.withdraw(withdrawAmount);
                case 3:
                    System.out.println(myAccount.getName()+" saldo: "+myAccount.getBalance());
                break;    
            }
            
        }while(menu != 4);
    }
}
