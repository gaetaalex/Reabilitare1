/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Dao;


import Model.DAO.Banco;
import Model.Especialistas;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class EspecialistasDAO {
    
    
    /**
     * Insere um cliente dentro do banco de dados
     * @param especialistas
     */
     public void insert(Especialistas especialistas){
         Banco.especialistas.add(especialistas);
     }
    /**
     * Atualiza um Objeto no banco de dados
     * @param especialistas
     * @return 
     */
    public boolean update(Especialistas especialistas){
        
        for (int i = 0; i < Banco.especialistas.size(); i++) {
            if(idSaoIguais(Banco.especialistas.get(i),especialistas)){
                Banco.especialistas.set(i, especialistas);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do cliente passado
     * @param especialistas
     * @return 
     */
    public boolean delete(Especialistas especialistas){
        for (Especialistas especialistasLista : Banco.especialistas) {
            if(idSaoIguais(especialistasLista,especialistas)){
                Banco.especialistas.remove(especialistasLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os clientes do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Especialistas> selectAll(){
        return Banco.especialistas;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param especialistas
     * @param especialistasAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Especialistas especialistas, Especialistas especialistasAComparar) {
        return especialistas.getId() ==  especialistasAComparar.getId();
        
    }
    
    
}
