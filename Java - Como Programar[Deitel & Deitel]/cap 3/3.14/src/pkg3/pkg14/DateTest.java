package pkg3.pkg14;
 // @author lucas
import javax.swing.JOptionPane;

public class DateTest {
    public static void main(String[] args) {
        
        int newDia, newMes, newAno;
        
        do{
            newDia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia"));
        }while(newDia<1 || newDia>31);
        do{
            newMes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês"));
        }while(newMes<1 || newMes>12);
        do{
            newAno = Integer.parseInt(JOptionPane.showInputDialog("informe o ano"));
        }while(newAno>0);
        
        Date dados = new Date(newDia, newMes, newAno);
        
        int menu;
        int subMenu;
        
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog("1 - Para mostrar "
                    + "data completa\n2 - Mostrar por parte\n3 - Configurar\n0 - Sair"));
            switch(menu){
                case 1:
                    dados.displayDate();
                break;

                case 2:
                    do{
                        subMenu = Integer.parseInt(JOptionPane.showInputDialog("1 - Para mostrar dia"
                                + "\n2 - Para mostrar mês\n3 - Para mostrar ano\n0 - Voltar"));
                        
                        switch(subMenu){
                        case 1:
                            JOptionPane.showMessageDialog(null, "Dia: "+dados.getDia());
                        break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Mês: "+dados.getMes());
                        break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Ano: "+dados.getAno());
                        break;
                        }
                    }while(subMenu!=0);
                break;
                
                case 3:
                    do{
                        subMenu = Integer.parseInt(JOptionPane.showInputDialog("1 - Para trocar dia"
                                + "\n2 - Para trocar mês\n3 - Para trocar ano\n0 - Voltar"));
                        
                        switch(subMenu){
                        case 1:
                            newDia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia"));
                            dados.setDia(newDia);
                        break;
                        case 2:
                            newMes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês"));
                            dados.setMes(newMes);
                        break;
                        case 3:
                            newAno = Integer.parseInt(JOptionPane.showInputDialog("informe o ano"));
                            dados.setAno(newAno);
                        break;
                        }
                    }while(subMenu!=0);
                    
                break;
            }
        }while(menu!=0);
    }
    
}
