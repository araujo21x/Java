/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemahospedagem.dao;

import br.com.sistemahospedagem.model.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class FuncionarioDAO {
    
    private static List<Funcionario> listaFuncionario;// inicializando
    
    public FuncionarioDAO(){//inicializando construct
    
    }
    
    public void save(Funcionario novoFuncionario){
        if(listaFuncionario == null){
            listaFuncionario = new ArrayList<>();
        }
        listaFuncionario.add(novoFuncionario);
    }
    
    public List<Funcionario> list(){
        return listaFuncionario;
    }
    
    public void remover(int index){
        listaFuncionario.remove(index);
    }
    
}
