package Controller.Helper;

import Model.Usuarios;
import View.Login;

/**
 *
 * @author Administrador
 */
public class LoginHelper implements IHelper{
    private final Login view;
    
    public LoginHelper(Login view){
        this.view = view;
    }
    public Usuarios obterModelo(){
        String name = view.getjTextUsuario().getText();
        String senha = view.getjTextSenha().getText();
        Usuarios modelo = new Usuarios(0, name, senha, name);
        return modelo;
    }
    
    public void setarModelo(Usuarios modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getjTextUsuario().setText(nome);
        view.getjTextSenha().setText(senha);
    }
    
    public void limparTela(){
        view.getjTextUsuario().setText("");
        view.getjTextSenha().setText("");
    }

}
    

