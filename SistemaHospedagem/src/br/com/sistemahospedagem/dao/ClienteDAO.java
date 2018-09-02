package br.com.sistemahospedagem.dao;

import br.com.sistemahospedagem.model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
   
    private final List<Cliente> listaClientes = new ArrayList<>();

    public ClienteDAO() {

    }
    
    public void save(Cliente novocliente) {    
        listaClientes.add(novocliente);
    }
    
    public List<Cliente> list() {
        return listaClientes;
    }
    
    public void remove(Cliente cliente) {
        listaClientes.remove(cliente);
    }
}
