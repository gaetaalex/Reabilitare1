package Model;

/**
 *
 * @author Administrador
 */
public class Usuarios {
    
    private int id;
    private String nome;
    private String senha;
    private String nivelAcesso;
    
    public Usuarios(){
    }

    public Usuarios(int id, String nome, String senha, String nivelAcesso) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuarios(int id, String name, String senha) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    
    
}
