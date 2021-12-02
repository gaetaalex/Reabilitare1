package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class Agendamentos {
    
    private int id;
    private Pacientes pacientes;
    private Servicos servicos;
    private Servicos valor;
    private Date data;
    private String observacao;
    private String status;
    
    /**
     *
     * @param id
     * @param pacientes
     * @param servicos
     * @param valor
     * @param dataHora
     * @param observacao
     * @param status
     */
     
    public Agendamentos(int id, Pacientes pacientes, Servicos servicos, Servicos valor,  String dataHora, String observacao, String status){
        this.id = id;
        this.pacientes = pacientes;
        this.servicos = servicos;
        this.valor = valor;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dataHora);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.observacao = observacao;
        this.status = status;
    }

   /* public Agendamentos(int id, Pacientes pacientes, Servicos servicos, float valor, String data, String hora, String observacao, String status) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public Agendamentos(int id, Pacientes pacientes, Servicos servicos,  float valor, String dataHora, String observacao, String status) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pacientes getPacientes() {
        return pacientes;
    }

    public void setPacientes(Pacientes pacientes) {
        this.pacientes = pacientes;
    }

    public Servicos getServicos() {
        return servicos;
    }

    public void setServicos(Servicos servicos) {
        this.servicos = servicos;
    }

    public Servicos getValor() {
        return valor;
    }

    public void setValor(Servicos valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }
    
    public String getDataFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }
    
    public String getHoraFormatada(){
        return new SimpleDateFormat("HH:mm").format(data);
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    public String getStatus() {
        return status;
    }

    public void setStatus(Agendamentos agendamentos) {
        this.status = status;
    }

    
    public void setVisible(boolean b) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
