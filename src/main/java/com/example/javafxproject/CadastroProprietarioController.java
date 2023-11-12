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
    private TextField txfEndereco;
    
    public void onActionConfirmar() {
        String nome = txfNome.getText();
        String CPF = txfCPF.getText();
        String telefone = txfTelefone.getText();
        String codigo = txfCodigo.getText();
        String endereco = txfEndereco.getText();
        
        System.out.println(nome + ", " + CPF + ", "
        + telefone + ", " + codigo + ", " + endereco);
    }
    
}
