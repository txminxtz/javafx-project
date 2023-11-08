package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CadastroVeiculosController {
    @FXML
    private TextField txfPlaca;
    @FXML
    private TextField txfModelo;
    @FXML
    private TextField txfMarca;
    @FXML
    private TextField txfCor;
    @FXML
    private TextField txfProprietario;
    
    public void onActionConfirmar() {
        String placa = txfPlaca.getText();
        String modelo = txfModelo.getText();
        String marca = txfMarca.getText();
        String cor = txfCor.getText();
        String proprietario = txfProprietario.getText();

        System.out.println(placa + ", " + modelo + ", "
         + marca + ", " + cor + ", " + proprietario);
        
    }
    
}
