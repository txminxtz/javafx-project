package com.example.javafxproject.proprietario;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class CadastroProprietarioController {
    @FXML
    private TextField txfNome;
    @FXML
    private TextField txfTelefone;
    @FXML
    private TextField txfEmail;
    
    public void onActionConfirmar() {
        String nome = txfNome.getText();
        String email = txfEmail.getText();
        String telefone = txfTelefone.getText();
    
        Proprietario proprietario = new Proprietario(nome, email, telefone);
    
        DAO_Proprietario daoProprietario = new DAO_Proprietario();
        proprietario = daoProprietario.create(proprietario);
    
        System.out.println(proprietario.getCod());
        System.out.println(proprietario.getNome());
        System.out.println(proprietario.getEmail());
        System.out.println(proprietario.getTelefone());
    }
    
}
