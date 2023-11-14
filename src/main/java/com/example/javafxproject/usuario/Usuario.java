package com.example.javafxproject.usuario;

class Usuario{
    private String nome;
    private String cargo;
    private String email;
    private String telefone;
    private String senha;

    public Usuario(){}

    public Usuario (
        String nome, 
        String cargo, 
        String email, 
        String telefone, 
        String senha) 
    {

        this.nome = nome;
        this.cargo = cargo;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome () {
        return this.nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getCargo () {
        return this.cargo;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail () {
        return this.email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefone () {
        return this.telefone;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getSenha () {
        return this.senha;
    }

}