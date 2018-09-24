package br.com.sistemahospedagem.dao;

import br.com.sistemahospedagem.model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
   
    private static List<Cliente> listaClientes;// inicializando

    public ClienteDAO() {//inicializando construct

    }
    
    public void save(Cliente novocliente) {
        if(listaClientes == null) {
            listaClientes = new ArrayList<>();
        }
        listaClientes.add(novocliente);
    }
    
    public List<Cliente> list() {
        return listaClientes;
    }
    
    public void remove(int index) {
        listaClientes.remove(index);
    }
    
}
