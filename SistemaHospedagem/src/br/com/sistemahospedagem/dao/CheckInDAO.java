package br.com.sistemahospedagem.dao;

import br.com.sistemahospedagem.model.CheckIn;
import java.util.ArrayList;
import java.util.List;

public class CheckInDAO {
   
    private static List<CheckIn> listaCheckIn;

    public CheckInDAO() {//inicializando construct
            
    }
    
    public void save(CheckIn novoCheckIn) {
        if(listaCheckIn == null) {
            listaCheckIn = new ArrayList<>();
        }
        listaCheckIn.add(novoCheckIn);
    }
    
    public List<CheckIn> list() {
        return listaCheckIn;
    }
    
    public void remove(int index) {
        listaCheckIn.remove(index);
    }
    
}
