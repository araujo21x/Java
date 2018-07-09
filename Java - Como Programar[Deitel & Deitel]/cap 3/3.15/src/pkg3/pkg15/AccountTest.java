package pkg3.pkg15;
 // @author lucas
import java.util.Scanner;
public class AccountTest{
    public static void displayAccount(Account accountToDisplay){
        System.out.printf("%s balance: $ %.2f %n",
                accountToDisplay.getName(), accountToDisplay.getBalance() );
    }
    public static void main(String[] args){
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);
        Scanner input = new Scanner(System.in);
        

        System.out.print("Qual conta deseja ver 1(account1)/2(account2): ");
         int menu = input.nextInt(); 
        if(menu == 1){
            displayAccount(account1);
        }else{
            displayAccount(account2);
        }
        
        System.out.print("Enter deposit amount for account1: "); 
        double depositAmount = input.nextDouble(); 
        System.out.printf("%nadding %.2f to account1 balance%n%n",
                depositAmount);
        account1.deposit(depositAmount);
    
        System.out.print("Qual conta deseja ver 1(account1)/2(account2): ");
        menu = input.nextInt(); 
        if(menu == 1){
            displayAccount(account1);
        }else{
            displayAccount(account2);
        }
    
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n",
                depositAmount);
        account2.deposit(depositAmount);

        System.out.print("Qual conta deseja ver 1(account1)/2(account2): ");
        menu = input.nextInt(); 
        if(menu == 1){
            displayAccount(account1);
        }else{
            displayAccount(account2);
        }
    } 
}