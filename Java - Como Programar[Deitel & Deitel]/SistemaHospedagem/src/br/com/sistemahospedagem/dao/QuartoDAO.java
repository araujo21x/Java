package br.com.sistemahospedagem.dao;

import br.com.sistemahospedagem.model.Quarto;
import java.util.ArrayList;
import java.util.List;

public class QuartoDAO {
    private static List<Quarto> listaQuarto;// inicializando
    
    public QuartoDAO(){
        
    }
    
    public void save(Quarto novoQuarto){
        if(listaQuarto == null){
            listaQuarto = new ArrayList<>();
        }
        listaQuarto.add(novoQuarto);
    }
    
    public List<Quarto> list(){
        return listaQuarto;
    }
    
    public void remover(int index){
        listaQuarto.remove(index);
    }
}
