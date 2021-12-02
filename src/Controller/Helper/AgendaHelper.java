package Controller.Helper;

import Model.Agendamentos;
import Model.Pacientes;
import Model.Servicos;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class AgendaHelper implements IHelper{
    
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamentos> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTableAgenda().getModel();
        tableModel.setNumRows(0);
        
        //Percorrer a lista preenchendo a tabela
        for (Agendamentos agendamento : agendamentos) {
           tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getPacientes().getNome(),
                agendamento.getServicos().getDescricao(),
                agendamento.getServicos().getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao(),
                agendamento.getStatus()
            });
        }
    }

    public void preencherPaciente(ArrayList<Pacientes> pacientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxPaciente().getModel();
        for (Pacientes paciente : pacientes) {
            comboBoxModel.addElement(paciente);
        }
    }

    public void preencherServico(ArrayList<Servicos> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxServicos().getModel();
        
        for (Servicos servico : servicos) {
            comboBoxModel.addElement(servico);
        }
    }

    public Agendamentos obterStatus() {
        return (Agendamentos) view.getjComboBoxStatus().getSelectedItem();       
    }
    
    public Pacientes obterPaciente() {
        return (Pacientes) view.getjComboBoxPaciente().getSelectedItem();       
    }
    
    public Servicos obterServico() {
        return (Servicos) view.getjComboBoxServicos().getSelectedItem();       
    }

    public void setValor(float valor) {
        view.getjTextFieldValor().setText(valor+"");
    }

    @Override
    public Object obterModelo() {
        
        String idString = view.getjTextFieldId().getText();
        int id = Integer.parseInt(idString);
        Pacientes pacientes = obterPaciente();
        Servicos servicos = obterServico();
        String valorString = view.getjTextFieldValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getjTextFieldData().getText();
        String hora = view.getjTextFieldHora().getText();
        String dataHora = data + "" + hora;
        String observacao = view.getjTextAreaObservacao().getText();
        String status = (String) view.getjComboBoxStatus().getSelectedItem();
        
        Agendamentos agendamentos = new Agendamentos(id, pacientes, servicos, valor, dataHora, observacao,  status);
        return agendamentos;
        //new Agendamentos()
        
    }

    @Override
    public void limparTela() {
        view.getjTextFieldId().setText("");
        view.getjTextFieldData().setText("");
        view.getjTextFieldHora().setText("");
        view.getjTextAreaObservacao().setText("");
    }
    
}
