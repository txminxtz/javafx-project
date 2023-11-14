package com.example.javafxproject.proprietario;

class Proprietario{

    private int cod;
    private String nome;
    private String email;
    private String telefone;

    public Proprietario(){}

    public Proprietario (
        int cod, 
        String nome, 
        String email, 
        String telefone) 
    {

        this.cod = cod;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

    }
    
    public Proprietario (
        String nome, 
        String email, 
        String telefone) 
    {

        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

    }

    public int getCod () {
        return this.cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome () {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail () {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone () {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}