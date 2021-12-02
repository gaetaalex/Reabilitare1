package View;

import Model.Agendamentos;
import Model.Especialistas;
import Model.Pacientes;
import Model.Servicos;


public class Main {
    public static void main(String[] args){
        String nome  ="Alex Gaeta";
        System.out.println(nome);
        
        Servicos servicos = new Servicos(1, "Fisio", 30);
        
        System.out.println(servicos.getDescricao());
        System.out.println(servicos.getValor());
        
        Pacientes pacientes = new Pacientes(1, "Alex Gaeta");
        System.out.println(pacientes.getNome());
        Especialistas especialistas = new Especialistas(1, "Lucilaine", "Fisioterapeuta");
        System.out.println(especialistas.getNome());
        System.out.println( especialistas.getEspecialidade());
        
        
        //Agendamentos agendamentos = new Agendamentos(1, pacientes, servicos, servicos, "02/12/2021 09:00","02/12/2021 90:00");
        System.out.println();
    }
}
