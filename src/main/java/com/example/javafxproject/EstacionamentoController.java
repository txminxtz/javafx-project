package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;

public class EstacionamentoController {

    @FXML
    private PasswordField psfSenha;
    
    public void onActionEntrar() {
        
        String senha = psfSenha.getText();

        if (senha.equals("root")) {
            System.out.println("Fez o login com sucesso!");
        }
        else {
            System.out.println("Errou a senha!");
        }
    }
    
}
