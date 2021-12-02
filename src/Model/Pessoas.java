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
abstract public class Pessoas {
    
    protected int id;
    protected String nome;
    protected char sexo;
    protected Date dataNasc;
    protected String telefone;
    protected String email;
    protected String cpf;
    protected String cep;
    protected String logradouro;
    protected String numero;
    protected String bairro;
    protected String cidade;
    
    public Pessoas (){
    }

    public Pessoas(int id, String nome, char sexo, String dataNasc, String telefone, String email, String cpf, String cep, String logradouro, String numero, String bairro, String cidade) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        try {
            this.dataNasc = new SimpleDateFormat("dd/MM/yyyy").parse(dataNasc);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoas.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Pessoas(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoas(int id, String nome, char sexo, String dataNasc, String telefone, String email, String cpf, String logradouro, String cep) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        try {
            this.dataNasc = new SimpleDateFormat("dd/MM/yyyy").parse(dataNasc);
        } catch (ParseException ex) {
            Logger.getLogger(Pessoas.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.logradouro = logradouro;
        this.cep = cep;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
}
