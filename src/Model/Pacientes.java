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
/*
    @Override
    public char getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public Date getDataNasc() {
        return dataNasc;
    }

    @Override
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getCep() {
        return cep;
    }

    @Override
    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String getLogradouro() {
        return logradouro;
    }

    @Override
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @Override
    public String getNumero() {
        return numero;
    }

    @Override
    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String getBairro() {
        return bairro;
    }

    @Override
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String getCidade() {
        return cidade;
    }

    @Override
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    */
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
