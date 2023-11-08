package com.example.javafxproject;

import java.util.Set;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastroUsuariosController {

    private Set<String> txfNome() {
        return null;
    }

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
        
    @FXML
    private Label nomeErroLabel;
    
    @FXML
    public void onActionConfirmar() {
        String nome = txfNome.getText();
        String email = txfEmail.getText();
        String telefone = txfTelefone.getText();
        String cargo = txfCargo.getText();
        String codigo = txfCodigo.getText();
        String senha = txfSenha.getText();

        if (nome.isBlank()) {
            nomeErroLabel.setManaged(true);
            nomeErroLabel.setVisible(true);
            nomeErroLabel.setText("Nome não pode ser vazio");

            Set<String> styleClasses = txfNome();
            styleClasses.add("erroTextField");
            txfNome.getStyleClass().setAll(styleClasses);
        } else {
            nomeErroLabel.setManaged(false);
            nomeErroLabel.setVisible(false);

            Set<String> styleClasses = txfNome();
            styleClasses.remove("erroTextField");
            txfNome.getStyleClass().setAll(styleClasses);
        }
        
        System.out.println(nome + ", " + email + ", "
         + telefone + ", " + cargo + ", " + codigo + ", " + senha);

    }
    
}
