package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import java.time.LocalDate;

public class RelatorioGeralController {

    @FXML
    private DatePicker dtpdataInicial;
    @FXML
    private DatePicker dtpdataFinal;

    public void onActionConfirmar() {
        LocalDate dataInicial = dtpdataInicial.getValue();
        LocalDate dataFinal = dtpdataFinal.getValue();

        String message = "Data inicial: " + dataInicial + "\nData final: " + dataFinal;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Relatorio Geral");
        alert.setHeaderText("Datas selecionadas:");
        alert.setContentText(message);
        alert.showAndWait();
    }
}
