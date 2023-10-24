package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class EstacionamentoController {
    @FXML
    private TextField txfFuncao;
    @FXML
    private TextField txfNome;
    @FXML
    private TextField txfEmail;
    @FXML
    private TextField txfTelefone;
    @FXML
    private TextField txfSenha;
    
    public void onActionCadastrar() {
        String funcao = txfFuncao.getText();
        String nome = txfNome.getText();
        String email = txfEmail.getText();
        String telefone = txfTelefone.getText();
        String senha = txfSenha.getText();

        System.out.println(funcao);
        System.out.println(nome);
        System.out.println(email);
        System.out.println(telefone);
        System.out.println(senha);
    }
    
}
