package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CadastroProprietarioController {
    @FXML
    private TextField txfNome;
    @FXML
    private TextField txfCPF;
    @FXML
    private TextField txfTelefone;
    @FXML
    private TextField txfCodigo;
    @FXML
    private TextField txfEndereço;
    
    public void onActionConfirmar() {
        String nome = txfNome.getText();
        String CPF = txfCPF.getText();
        String telefone = txfTelefone.getText();
        String Codigo = txfCodigo.getText();
        String Endereço = txfEndereço.getText();
       
        System.out.println(nome);
        System.out.println(CPF);
        System.out.println(telefone);
        System.out.println(Codigo);
        System.out.println(Endereço);
    }
    
}
