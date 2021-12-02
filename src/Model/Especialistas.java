package Model;

import java.util.Date;


public class Especialistas extends Pessoas{
    

    protected String especialidade;
      
    
    public Especialistas(){
    }

    public Especialistas(String especialidade, int id, String nome, char sexo, String dataNasc, String telefone, String email, String cpf, String cep, String logradouro, String numero, String bairro, String cidade) {
        super(id, nome, sexo, dataNasc, telefone, email, cpf, cep, logradouro, numero, bairro, cidade);
        this.especialidade = especialidade;
    }
    
    public Especialistas(int id, String nome, String especialidade) {
        super(id, nome);
        this.especialidade = especialidade;
    }

    public Especialistas(int i, String lucilaine_de_Oliveira, char c, String string, String string0, String lucilainegmailcom, String string1, String rua_jaboti_35_Canudos_NH, String string2) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

   
    
}
