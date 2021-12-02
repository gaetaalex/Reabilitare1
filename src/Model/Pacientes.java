package Model;


public class Pacientes extends Pessoas{
    
    
    private String obs;
        
    public Pacientes(){
    }

    public Pacientes(int id, String nome) {
        super(id, nome);
    }
    
    public Pacientes(int id, String nome, char sexo, String dataNasc, String telefone, String email, String cpf, String cep, String logradouro, String numero, String bairro, String cidade, String obs) {
        super(id, nome, sexo, dataNasc, telefone, email, cpf, cep, logradouro, numero, bairro, cidade);
        this.obs = obs;
    }

    public Pacientes(int id, String nome, char sexo, String dataNasc, String telefone, String email, String cpf, String logradouro, String cep) {
        super(id, nome, sexo, dataNasc, telefone, email, cpf, logradouro, cep);
        this.logradouro = logradouro;
        this.cep = cep;
    }
    
    @Override
    public int getId(){
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    @Override
    public String toString(){
        return getNome();
    }
}
