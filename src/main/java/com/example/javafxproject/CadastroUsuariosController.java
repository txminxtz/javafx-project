package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class CadastroUsuariosController {
    @FXML
    private TextField txfNome;
    @FXML
    private TextField txfEmail;
    @FXML
    private TextField txfTelefone;
    @FXML
    private TextField txfCargo;
    @FXML
    private TextField txfCodigo;
    @FXML
    private TextField txfSenha;
    
    public void onActionConfirmar() {
        String nome = txfNome.getText();
        String email = txfEmail.getText();
        String telefone = txfTelefone.getText();
        String cargo = txfCargo.getText();
        String codigo = txfCodigo.getText();
        String senha = txfSenha.getText();

        System.out.println(nome);
        System.out.println(email);
        System.out.println(telefone);
        System.out.println(cargo);
        System.out.println(codigo);
        System.out.println(senha);
    }
    
}
