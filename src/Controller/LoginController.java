package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuariosDAO;
import Model.Usuarios;
import View.Login;
import View.MenuPrincipal;

public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view ) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        //pega usuario da view
        Usuarios usuarios = helper.obterModelo();
        //pesquisa usuario no banco
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        Usuarios usuariosAutenticado = usuariosDAO.selectPorNomeESenha(usuarios);
        if(usuariosAutenticado!= null){
            //entra menu principal
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }else{
            view.exibeMensagem("Usuario ou senha invalodos");
        }
        //user view = user banco vai pro menu
        // senha msg usuario ou senha invalido
        
    }
    
    
}
