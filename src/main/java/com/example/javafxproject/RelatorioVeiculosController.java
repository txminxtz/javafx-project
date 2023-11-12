package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class RelatorioVeiculosController {

    @FXML
    private TextField txfPlaca;
    @FXML
    private DatePicker dtpdataInicial;
    @FXML
    private DatePicker dtpdataFinal;

    public void onActionConfirmar() {
        String placa = txfPlaca.getText();
        LocalDate dataInicial = dtpdataInicial.getValue();
        LocalDate dataFinal = dtpdataFinal.getValue();

        String message = "Placa: " + placa + "\nData inicial: " + dataInicial + "\nData final: " + dataFinal;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Relatorios Veiculo");
        alert.setHeaderText("Relatorio:");
        alert.setContentText(message);
        alert.showAndWait();
    }
}
