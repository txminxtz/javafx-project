package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class AtualizarPrecosController {
    @FXML
    private TextField txfPh;
    @FXML
    private TextField txfDh;
    @FXML
    private TextField txfDiaria;
    @FXML
    private TextField txfMensalistas;
    
    public void onActionConfirmar() {
        String ph = txfPh.getText();
        String dh = txfDh.getText();
        String diaria = txfDiaria.getText();
        String mensalistas = txfMensalistas.getText();

        System.out.println(ph);
        System.out.println(dh);
        System.out.println(diaria);
        System.out.println(mensalistas);
    }
    
}
