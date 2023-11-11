package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MenuRegistrosController {
    @FXML
    private TextField txfPlaca;
    @FXML
    private TextField txfEntrada;
    @FXML
    private TextField txfSaida;
    @FXML
    private TextField txfMensalistas;
    @FXML
    private TextField txfValor;
    
    public void onActionConfirmar() {
        String placa = txfPlaca.getText();
        String entrada = txfEntrada.getText();
        String saida = txfSaida.getText();
        String mensalistas = txfMensalistas.getText();
        String valor = txfValor.getText();

        System.out.println(placa + ", " + entrada + ", "
         + saida + ", " + mensalistas + ", " + valor);
        
    }
    
}
