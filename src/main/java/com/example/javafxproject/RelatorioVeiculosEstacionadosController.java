package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;

import java.time.LocalDate;

public class RelatorioVeiculosEstacionadosController {

    @FXML
    private DatePicker dtpData;

    public void onActionConfirmar() {
        LocalDate data = dtpData.getValue();

        String message = "Data: " + data;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Relatorios Veiculo Estacionados");
        alert.setHeaderText("Relatorio:");
        alert.setContentText(message);
        alert.showAndWait();
    }
}
