/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Agendamentos;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class AgendamentoDAO {
    
    /**
     * Insere um agendamento dentro do banco de dados
     * @param agendamentos exige que seja passado um objeto do tipo agendamento
     */
    public void insert(Agendamentos agendamentos){
          
        if(agendamentos.getId() == 0){
            agendamentos.setId(proximoId());
            Banco.agendamentos.add(agendamentos);
        }
        
        
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param agendamentos
     * @return 
     */
    public boolean update(Agendamentos agendamentos){
        
        for (int i = 0; i < Banco.agendamentos.size(); i++) {
            if(idSaoIguais(Banco.agendamentos.get(i),agendamentos)){
                Banco.agendamentos.set(i, agendamentos);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do agendamento passado
     * @param agendamentos
     * @return 
     */
    public boolean delete(Agendamentos agendamentos){
        for (Agendamentos agendamentosLista : Banco.agendamentos) {
            if(idSaoIguais(agendamentosLista,agendamentos)){
                Banco.agendamentos.remove(agendamentosLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os agendamentos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Agendamentos> selectAll(){
        return Banco.agendamentos;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param agendamentos
     * @param agendamentosAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Agendamentos agendamentos, Agendamentos agendamentosAComparar) {
        return agendamentos.getId() ==  agendamentosAComparar.getId();
    }
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (Agendamentos agendamentos : Banco.agendamentos) {           
           int id = agendamentos.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
            
        }
        
        return maiorId + 1;
    }
    
}
