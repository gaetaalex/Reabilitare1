/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Servicos;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class ServicosDAO {
    
    
    /**
     * Insere um servico dentro do banco de dados
     * @param servicos exige que seja passado um objeto do tipo servico
     */
    public void insert(Servicos servicos){
        Banco.servicos.add(servicos);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param servicos
     * @return 
     */
    public boolean update(Servicos servicos){
        
        for (int i = 0; i < Banco.servicos.size(); i++) {
            if(idSaoIguais(Banco.servicos.get(i),servicos)){
                Banco.servicos.set(i, servicos);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do servico passado
     * @param servicos
     * @return 
     */
    public boolean delete(Servicos servicos){
        for (Servicos servicosLista : Banco.servicos) {
            if(idSaoIguais(servicosLista,servicos)){
                Banco.servicos.remove(servicosLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os servicos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Servicos> selectAll(){
        return Banco.servicos;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param servicos
     * @param servicosAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Servicos servicos, Servicos servicosAComparar) {
        return servicos.getId() ==  servicosAComparar.getId();
    }
    
}
