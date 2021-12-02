/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Usuarios;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class UsuariosDAO {
    
    /**
     * Insere um usuario dentro do banco de dados
     * @param usuarios exige que seja passado um objeto do tipo usuario
     */
    public void insert(Usuarios usuarios){
        Banco.usuarios.add(usuarios);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param usuarios
     * @return 
     */
    public boolean update(Usuarios usuarios){
        
        for (int i = 0; i < Banco.usuarios.size(); i++) {
            if(idSaoIguais(Banco.usuarios.get(i),usuarios)){
                Banco.usuarios.set(i, usuarios);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do usuario passado
     * @param usuarios
     * @return 
     */
    public boolean delete(Usuarios usuarios){
        for (Usuarios usuariosLista : Banco.usuarios) {
            if(idSaoIguais(usuariosLista,usuarios)){
                Banco.usuarios.remove(usuariosLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os usuarios do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Usuarios> selectAll(){
        return Banco.usuarios;
    }
    
    /**
     * Retorna um Objeto do tipo usuario se a funcao encontrar o usuario passado como parâmetro no banco, para considerar sao usado nome e senha
     * @param usuarios
     * @return Usuario encontrado no banco de dados
     */
    public Usuarios selectPorNomeESenha(Usuarios usuarios){
        for (Usuarios usuariosLista : Banco.usuarios) {
            if(nomeESenhaSaoIguais(usuariosLista,usuarios)){
                return usuariosLista;
            }
        }
        return null;
    }

    /**
     * Recebe dois objetos e verifica se são iguais verificando o nome e senha
     * @param usuarios
     * @param usuariosAPesquisar
     * @return verdadeiro caso sejam iguais e falso caso nao forem iguais
     */
    private boolean nomeESenhaSaoIguais(Usuarios usuarios, Usuarios usuariosAPesquisar) {
        return usuarios.getNome().equals(usuariosAPesquisar.getNome()) && usuarios.getSenha().equals(usuariosAPesquisar.getSenha());
    }

    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param usuarios
     * @param usuariosAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Usuarios usuarios, Usuarios usuariosAComparar) {
        return usuarios.getId() ==  usuariosAComparar.getId();
    }
    
    
    
}
