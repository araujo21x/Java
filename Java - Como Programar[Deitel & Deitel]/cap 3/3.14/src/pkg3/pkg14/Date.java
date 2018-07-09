 // @author lucas
package pkg3.pkg14;

import javax.swing.JOptionPane;

public class Date {
    
    private int dia;
    private int mes;
    private int ano;
    //meu metodo construtor
    public Date(int newDia, int newMes, int newAno){//pega valores informado pelo usuario e inserir no objeto
        this.dia = newDia;
        this.mes = newMes;
        this.ano = newAno;
    }
    //set metodos para mudar somente um valor especifico
    public void setDia(int newDia){
        if(newDia<1 || newDia>31){
             JOptionPane.showMessageDialog(null, "Erro no valor informado");
        }else{
            this.dia = newDia; 
        }
    }
    public void setMes(int newMes){
        if(newMes<1 || newMes>12){
            JOptionPane.showMessageDialog(null, "Erro no valor informado");
        }else{
            this.mes = newMes;
        }
    }
    public void setAno(int newAno){
        if(newAno>0){
            JOptionPane.showMessageDialog(null, "Erro no valor informado");
        }else{
            this.ano = newAno;
        }
    }
    //get metodos para retornar o valor
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    public void displayDate(){
        JOptionPane.showMessageDialog(null, dia+"/"+mes+"/"+ano+"/");
    }
}
