 //* @author lucas
public class Account {
    private String name;
    private double balance;
    
    public Account(String name, double balance){
        this.name = name;
        
        if(balance > 0.0){
            this.balance = balance;
        }
    }
    
    public void deposit (double depositAmount){
        if(depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }
    
    public void withdraw(double withdrawAmount){
        if(withdrawAmount <= balance && withdrawAmount> 0.0){
            balance = balance - withdrawAmount;
        }else if(withdrawAmount > balance){
            System.out.println("Withdrawal amount exceeded account balance[Valor de débito excedeu o saldo da conta].");
        }else{
            System.out.println("Valor informado é negativo");
        }
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
