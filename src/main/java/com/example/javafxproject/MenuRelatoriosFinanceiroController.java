package com.example.javafxproject;

import javafx.scene.control.Alert;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuRelatoriosFinanceiroController {

    
    @FXML
    protected void abrirGeral() throws IOException {
        FXMLLoader loader = new FXMLLoader(MenuRelatoriosFinanceiroController.class.getResource("relatorio-geral.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Relatorio Geral por Periodo");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }
    

    @FXML
    protected void abrirVeiculos() throws IOException {
        FXMLLoader loader = new FXMLLoader(MenuRelatoriosFinanceiroController.class.getResource("relatorio-veiculos.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Relatorio Veiculos por Periodo");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }
    
    @FXML
    protected void abrirVeiculosEstacionados() throws IOException {
        FXMLLoader loader = new FXMLLoader(MenuPrincipalController.class.getResource("relatorio-veiculos-estacionados.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Relatorio Veiculos Estacionados");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }
       
}
