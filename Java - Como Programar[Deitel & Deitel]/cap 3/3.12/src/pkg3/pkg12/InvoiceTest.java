package pkg3.pkg12;
import javax.swing.JOptionPane;

 // @author lucas
public class InvoiceTest {
    public static void SubMenu(Invoice myInvoice){
        int menu;
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "               Mostrar"
               + "\n1 - Valor Total da fatura:\n2 - Nome:\n3 - Descrição\n4 - Quantidade:"
               + "\n5 - Valor Unitário:\n6 - Todas informaçoes:\n7 -Voltar"));
            
            switch(menu){
            case 1:
                JOptionPane.showMessageDialog(null, "Valor da Fatura: "+myInvoice.getInvoiceAmount());
            break;  
            
            case 2:
                JOptionPane.showMessageDialog(null, "Nome: "+myInvoice.getNumero());
            break; 
            
            case 3:
                JOptionPane.showMessageDialog(null, "Descrição: "+myInvoice.getDescricao());
            break;  
                
            case 4:
                JOptionPane.showMessageDialog(null, "Quantidade: "+myInvoice.getQuantidade());
            break;  
            
            case 5:
                JOptionPane.showMessageDialog(null, "Valor da unitário: "+myInvoice.getValor());
            break;
            
            case 6:                
                JOptionPane.showMessageDialog(null, "Nome: "+myInvoice.getNumero());
                JOptionPane.showMessageDialog(null, "Descrição: "+myInvoice.getDescricao());
                JOptionPane.showMessageDialog(null, "Quantidade: "+myInvoice.getQuantidade());
                JOptionPane.showMessageDialog(null, "Valor da unitário: "+myInvoice.getValor());
                JOptionPane.showMessageDialog(null, "Valor da Fatura: "+myInvoice.getInvoiceAmount());
            break;
            }
        }while(menu != 7);             
    }
    
    public static void main(String[] args){
        
        String numero = JOptionPane.showInputDialog(null, "Informe o numero da mercadoria:");
        String descricao = JOptionPane.showInputDialog(null, "Informe uma descrição da mercadoria:");
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de mercadoria:"));
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da mercadoria:"));
        
        Invoice myInvoice = new Invoice(numero, descricao, quantidade, valor);
        
        int menu;
        
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Para "
                    + "mudar numero da mercadoria:\n2 - Para mudar a descrção:\n3 - "
                    + "Para mudar a quantidade:\n4 - Para mudar o valor:\n5 - mostrar"
                    + "valor da fatura:\n6 - Mostrar\n0 - Sair"));
            
            switch(menu){
                case 1:
                    numero = JOptionPane.showInputDialog(null, "Informe o numero da mercadoria:");
                    myInvoice.setNumero(numero);
                break;
                
                case 2:
                    descricao = JOptionPane.showInputDialog(null, "Informe uma descrição da mercadoria:");
                    myInvoice.setDescricao(descricao);
                break;
                
                case 3:
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de mercadoria:"));
                    myInvoice.setQuantidade(quantidade);
                break;
                
                case 4:
                    valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor da mercadoria:"));
                    myInvoice.setValor(valor);
                break;
                
                case 5:
                    JOptionPane.showMessageDialog(null, "Mostrar fatura total"+myInvoice.getInvoiceAmount());
                break;
                
                case 6:
                    SubMenu(myInvoice);
                break;
            }
        }while(menu !=0);
    }
}