/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;


import Model.Pacientes;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class PacientesDAO {
    
    
    /**
     * Insere um cliente dentro do banco de dados
     * @param pacientes exige que seja passado um objeto do tipo cliente
     */
    public void insert(Pacientes pacientes){
        Banco.pacientes.add(pacientes);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param pacientes
     * @return 
     */
    public boolean update(Pacientes pacientes){
        
        for (int i = 0; i < Banco.pacientes.size(); i++) {
            if(idSaoIguais(Banco.pacientes.get(i),pacientes)){
                Banco.pacientes.set(i, pacientes);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do cliente passado
     * @param pacientes
     * @return 
     */
    public boolean delete(Pacientes pacientes){
        for (Pacientes pacientesLista : Banco.pacientes) {
            if(idSaoIguais(pacientesLista,pacientes)){
                Banco.pacientes.remove(pacientesLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os clientes do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Pacientes> selectAll(){
        return Banco.pacientes;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param pacientes
     * @param pacientesAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Pacientes pacientes, Pacientes pacientesAComparar) {
        return pacientes.getId() ==  pacientesAComparar.getId();
        
    }
    
    
}
