package br.com.sistemahospedagem.dao;

import br.com.sistemahospedagem.model.Consumo;
import java.util.ArrayList;
import java.util.List;

public class ConsumoDAO {
   
    private static List<Consumo> listaConsumo;

    public ConsumoDAO() {
            
    }
    
    public void save(Consumo novoConsumo) {
        if(listaConsumo == null) {
            listaConsumo = new ArrayList<>();
        }
        listaConsumo.add(novoConsumo);
    }
    
    public List<Consumo> list() {
        return listaConsumo;
    }
    
    public void remove(int index) {
        listaConsumo.remove(index);
    }
}
