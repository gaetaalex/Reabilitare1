/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Dao;

import Model.Prontuario;

/**
 *
 * @author Administrador
 */
public class ProntuarioController {
    public Boolean insert(Prontuario prontuario){
        Boolean retorno = false;
        String sql = "INSERT INTO prontuario (imagem) value (?)";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            pst.setBytes(1, prontuario.getImagem());
            retorno = pst.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return retorno;
    }
}
