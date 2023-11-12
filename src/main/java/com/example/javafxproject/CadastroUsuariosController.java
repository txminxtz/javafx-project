package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;

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
    private PasswordField psfSenha;
        
    @FXML
    private Label nomeErroLabel;

    @FXML
    public void onActionConfirmar() {
        String nome = txfNome.getText();
        String email = txfEmail.getText();
        String telefone = txfTelefone.getText();
        String cargo = txfCargo.getText();
        String codigo = txfCodigo.getText();

        System.out.println(nome + ", " + email + ", "
         + telefone + ", " + cargo + ", " + codigo);

    }

}