package com.example.javafxproject.proprietario;

import com.example.javafxproject.proprietario.DAO_Proprietario;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class CadastroProprietarioController {
    @FXML
    private TextField txfNome;
    @FXML
    private TextField txfTelefone;
    @FXML
    private TextField txfCodigo;
    @FXML
    private TextField txfEmail;
    
    public void onActionConfirmar() {
        String codigo = txfCodigo.getText();
        String nome = txfNome.getText();
        String email = txfEmail.getText();
        String telefone = txfTelefone.getText();
    
        Proprietario proprietario = new Proprietario();
    
        DAO_Proprietario daoProprietario = new DAO_Proprietario();
        proprietario = daoProprietario.create(proprietario);
    
        System.out.println(proprietario.getCod());
        System.out.println(proprietario.getNome());
        System.out.println(proprietario.getEmail());
        System.out.println(proprietario.getTelefone());
    }
    
}
