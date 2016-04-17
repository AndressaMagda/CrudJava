package Pessoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Pessoa {
   
    private String nome, cpf, dataNascimento;

    public Pessoa(String nome, String cpf) throws PessoaException {
        this.setNome(nome);
        this.setCpf(cpf);
    }
    
    public Pessoa(String nome, String cpf, String dataNascimento) throws PessoaException{
        this.setNome(nome);
        this.setCpf(cpf);
        this.setDataNascimento(dataNascimento);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }

    private void setCpf(String cpf) throws PessoaException{
        if(cpf.length()>=11)
            this.cpf = cpf;
        else
            throw new PessoaException("CPF invalido!!");
        
    }
    
    
    public String getCpf(){
        return this.cpf;
    }

    private void setDataNascimento(String data) throws PessoaException{  
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
        df.setLenient(false);  
        try {  
            df.parse(data);
            this.dataNascimento = data;
        } catch (ParseException ex) { 
            throw new PessoaException("Data Invalida!!");
        }  
    }
    
    
    public String getDataNascimento(){
        return this.dataNascimento;
    }
}
