package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamentos;
import Model.DAO.AgendamentoDAO;
import Model.DAO.PacientesDAO;
import Model.DAO.ServicosDAO;
import Model.Pacientes;
import Model.Servicos;
import View.Agenda;
import java.util.ArrayList;


public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;
    

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
        public void atualizaTabela(){
        //buscar lista com os agendamentos
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamentos> agendamentos = agendamentoDAO.selectAll();
        
        //exibir a lista na view
        helper.preencherTabela(agendamentos);
    }
        
    public void atualizaPacientes(){
        //Buscar pacientes no db
        PacientesDAO pacientesDAO = new PacientesDAO();
        ArrayList<Pacientes> pacientes = pacientesDAO.selectAll();
        // Exibir pacientes no combobox
        helper.preencherPaciente(pacientes);
    }
    
     public void atualizaServicos(){
        //Buscar pacientes no db
        ServicosDAO servicosDAO = new ServicosDAO();
        ArrayList<Servicos> servicos = servicosDAO.selectAll();
        // Exibir pacientes no combobox
        helper.preencherServico(servicos);
    }
     
     public void atualizaValor(){
         Servicos servicos = helper.obterServico();
         helper.setValor(servicos.getValor());
    }
     
     public void agendar(){
        //buscar obj agendamento da tela
        Agendamentos agendamentos = (Agendamentos) helper.obterModelo();
        //salvar obj no banco db
        new AgendamentoDAO().insert(agendamentos);
        //inserir elementos na tabela
        atualizaTabela();
        helper.limparTela();
         
    }
}
