/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Agendamentos;
import Model.Pacientes;
import Model.Especialistas;
import Model.Servicos;
import Model.Usuarios;
import java.text.ParseException;
import java.util.ArrayList;

public class Banco {
    
    public static ArrayList<Usuarios> usuarios;
    public static ArrayList<Pacientes> pacientes;
    public static ArrayList<Especialistas> especialistas;
    public static ArrayList<Servicos> servicos;
    public static ArrayList<Agendamentos> agendamentos;
    
    
    public static void inicia() throws ParseException{
    
        //Instancia os Objetos
        usuarios = new ArrayList<>();
        pacientes = new ArrayList<>();
        especialistas = new ArrayList<>();
        servicos = new ArrayList<>();
        agendamentos = new ArrayList<>();
        
        //criando elementos
        
        Usuarios usuarios1 = new Usuarios(1, "alex", "alex", "administrador");
        Usuarios usuarios2 = new Usuarios(2, "estagiario", "estagiario", "funcionario");
         
        Pacientes pacientes1 = new Pacientes(1, "Alex Gaeta", 'M', "30/01/1995", "30212126", "tiagoluz.h607@gmail.com", "5142487", "Rua jaboti 35 Canudos NH",  "93300012");
        Pacientes pacientes2 = new Pacientes(2, "Judite Oliveira", 'F', "30/08/1994", "30212127", "juditeoliveirapet@gmail.com", "5142487745", "Rua campo bom 78 Centro NH",  "93300045");
        Pacientes pacientes3 = new Pacientes(3, "Paulo Ricado", 'M', "24/04/1997", "30212128", "pauloricardopet@gmail.com", "78451458", "Rua Tres Irmaos 30 Vila Nova - NH",  "933007496");
        Pacientes pacientes4 = new Pacientes(4, "Neymar Santos", 'M', "20/08/1995", "30212130", "neymarsantospet@gmail.com", "2745487", "Rua Lombardi 40 Canudos NH",  "93300748");
        Pacientes pacientes5 = new Pacientes(5, "Debruine Pipoqueiro", 'M', "13/09/1992", "30212131", "debruinepet@gmail.com", "4742487", "Rua pedro quaresma 784 Canudos Belgica",  "933000847");
        Pacientes pacientes6 = new Pacientes(6, "Matuidi Pareira", 'M', "17/08/1994", "302122324", "matuidipet@gmail.com", "78512457", "Rua champions 10 Kephas Franca",  "933000782");
        Pacientes pacientes7 = new Pacientes(7, "Marta de Souza", 'F', "25/03/1993", "302121292", "martasouzapet@gmail.com", "4658237314", "Rua tesla 215 Canudos NH",  "93352012");
        Pacientes pacientes8 = new Pacientes(8, "Aline Ferrari", 'F', "04/03/1990", "302121451", "alineferraripet@gmail.com", "8475123687", "Rua hyrule 32 Canudos NH",  "9334714747");
        Pacientes pacientes9 = new Pacientes(9, "Samuel Coltinho", 'M', "09/02/1998", "302121189", "samuelcoltinhopet@gmail.com", "74595142487", "Rua floresta 12 Canudos NH",  "9330046364");
        Pacientes pacientes10 = new Pacientes(10, "Felipe Luis", 'M', "12/06/1999", "3021212478", "felipeluispet@gmail.com", "845713647", "Rua marechal 1023 Canudos NH",  "933000874");
        
        Especialistas especialistas1 = new Especialistas(1, "Lucilaine de Oliveira", 'F', "13/07/1978", "30212126", "lucilaine@gmail.com", "5142487", "Rua jaboti 35 Canudos NH",  "93300012");
        
        
        Servicos servicos1 = new Servicos(1, "Fisioterapia", 100);
        Servicos servicos2 = new Servicos(2, "Corte Degrade", 30);
        Servicos servicos3 = new Servicos(3, "Barba Simples", 15);
        Servicos servicos4 = new Servicos(4, "Barba Desenhada", 25);
        Servicos servicos5 = new Servicos(5, "Sombrancelhas", 10);
        Servicos servicos6 = new Servicos(6, "Penteados", 3);

        Agendamentos agendamentos1 = new Agendamentos(1, pacientes1, servicos1, servicos1, "14/07/2018 10:00", "teste0", "Pendente");
        Agendamentos agendamentos2 = new Agendamentos(2, pacientes3, servicos4, servicos4, "14/07/2018 10:00", "teste1", "Confirmado");
        Agendamentos agendamentos3 = new Agendamentos(3, pacientes4, servicos1, servicos2, "14/07/2018 10:30", "teste2", "Cancelado");
        
        //Adiciona Elementos na lista
        usuarios.add(usuarios1);
        usuarios.add(usuarios2);
        
        pacientes.add(pacientes1);
        pacientes.add(pacientes2);
        pacientes.add(pacientes3);
        pacientes.add(pacientes4);
        pacientes.add(pacientes5);
        pacientes.add(pacientes6);
        pacientes.add(pacientes7);
        pacientes.add(pacientes8);
        pacientes.add(pacientes9);
        pacientes.add(pacientes10);
        
        especialistas.add(especialistas1);
        
        servicos.add(servicos1);
        servicos.add(servicos2);
        servicos.add(servicos3);
        servicos.add(servicos4);
        servicos.add(servicos5);
        servicos.add(servicos6);
       
        
        agendamentos.add(agendamentos1);
        agendamentos.add(agendamentos2);
        agendamentos.add(agendamentos3);
        
    }
    
    
}
