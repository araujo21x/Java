/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemahospedagem.dao;

import br.com.sistemahospedagem.model.Cliente;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author arauj
 */
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
