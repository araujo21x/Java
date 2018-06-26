package pkg3.pkg13;
// @author lucas
import javax.swing.JOptionPane;

public class EmployeeTest {
    public static void trocarNome(Employee empregado, String nome){
        empregado.setNome(nome);
    }
    public static void trocarSobrenome(Employee empregado, String sobrenome){
        empregado.setSobrenome(sobrenome);
    }
    public static void trocarSalario(Employee empregado, double salario){
        empregado.setSalario(salario);
    }
    public static void mostrar(Employee empregado){
        int menu;
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog("Mostrar\n1 - Nome:\n"
                    + "2 - Sobrenome:\n3 - Salário\n4 - Tados Informações\n5 - Sair"));
            
            switch(menu){
            case 1:
                JOptionPane.showMessageDialog(null, "Nome do fucionário: "+empregado.getNome());
            break;  
            
            case 2:
                JOptionPane.showMessageDialog(null, "Sobrenome do fucionário: : "+empregado.getSobrenome());
            break; 
            
            case 3:
                JOptionPane.showMessageDialog(null, "Salario do funcionário: "+empregado.getSalario());
            break;  
            
            case 4:                
                JOptionPane.showMessageDialog(null, empregado.getNome()+" "+empregado.getSobrenome()+""
                            + " sálario: "+empregado.getSalario());

            break;
            }
        }while(menu != 5);             
    }
    public static void aumento(Employee empregado){
        double aumento= empregado.getSalario();
        aumento = aumento + (aumento*0.1);
        empregado.setSalario(aumento);
    }
    public static void main(String[] args){
        String nome, sobrenome;
        double salario;
        
        //Pegar dados para primerio objeto
        nome = JOptionPane.showInputDialog("Informe Nome do funcionário:");
        sobrenome = JOptionPane.showInputDialog("Infome sobrenome do funcionário:");
        salario = Double.parseDouble(JOptionPane.showInputDialog("Infome salário do funcionário:"));
        while(salario < 0.0){
            JOptionPane.showMessageDialog(null, "Somente Valore Acima de 0");
            salario = Double.parseDouble(JOptionPane.showInputDialog("Infome salário do funcionário:"));
        }
        Employee empregado1 = new Employee(nome, sobrenome, salario);//Criar e inserir valor no primeiro objeto
        
        //Pegar dados do segundo objeto
        nome = JOptionPane.showInputDialog("Informe Nome do funcionário:");
        sobrenome = JOptionPane.showInputDialog("Infome sobrenome do funcionário:");
        salario = Double.parseDouble(JOptionPane.showInputDialog("Infome salário do funcionário:"));
        while(salario < 0.0){
            JOptionPane.showMessageDialog(null, "Somente Valore Acima de 0");
            salario = Double.parseDouble(JOptionPane.showInputDialog("Infome salário do funcionário:"));
        }
        Employee empregado2 = new Employee(nome, sobrenome, salario);//Criar e inserir valor no segundo objeto
    
        int menu;
        
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog("Menu\n1 - Trocar nome\n"
                    + "2 - Trocar sobrenome\n3 - Trocar salário\n4 - Mostrar dados\n"
                    + "5 - Mostrar ambos e acréscimo\n0 - Sair"));
            
            switch(menu){
                case 1:
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Empregado 1 ou 2?"));
                    nome = JOptionPane.showInputDialog("Informe Nome do funcionário:");
                    
                    if (menu == 1){
                        trocarNome(empregado1, nome);
                    }else{
                        trocarNome(empregado2, nome);
                    }
                break;
                
                case 2:
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Empregado 1 ou 2?"));
                    sobrenome = JOptionPane.showInputDialog("Informe Nome do funcionário:");
                    
                    if (menu == 1){
                        trocarSobrenome(empregado1, sobrenome);
                    }else{
                        trocarSobrenome(empregado2, sobrenome);
                    }
                break;
                
                case 3:
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Empregado 1 ou 2?"));
                    salario = Double.parseDouble(JOptionPane.showInputDialog("Infome salário do funcionário:"));
                    
                    if (menu == 1){
                        trocarSalario(empregado1, salario);
                    }else{
                        trocarSalario(empregado2, salario);
                    }
                break;
                case 4:
                    menu = Integer.parseInt(JOptionPane.showInputDialog("Empregado 1 ou 2?"));
                    
                    if (menu == 1){
                        mostrar(empregado1);
                    }else{
                        mostrar(empregado2);
                    }
                break;
                case 5:
                    JOptionPane.showMessageDialog(null, empregado1.getNome()+" "+empregado1.getSobrenome()+""
                            + " sálario: "+empregado1.getSalario());
                    aumento(empregado1);//fazer aumento de 10%
                    JOptionPane.showMessageDialog(null, empregado2.getNome()+" "+empregado2.getSobrenome()+""
                            + " sálario: "+empregado2.getSalario());
                    aumento(empregado2);//fazer aumento de 10%
                    //mostrar novamente com o aumento de 10% 
                    JOptionPane.showMessageDialog(null, empregado1.getNome()+" "+empregado1.getSobrenome()+""
                            + " sálario: "+empregado1.getSalario());
                    JOptionPane.showMessageDialog(null, empregado2.getNome()+" "+empregado2.getSobrenome()+""
                            + " sálario: "+empregado2.getSalario());
                    
                break;
            }
        }while(menu!=0);
    }
}
