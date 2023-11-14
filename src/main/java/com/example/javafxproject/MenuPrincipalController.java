package com.example.javafxproject;

import javafx.scene.control.Alert;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuPrincipalController {
    
    @FXML
    protected void abrirCadastros() throws IOException {
        FXMLLoader loader = new FXMLLoader(MenuPrincipalController.class.getResource("menu-cadastros.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Menu de Cadastros");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }
    

    @FXML
    protected void abrirRegistros() throws IOException {
        FXMLLoader loader = new FXMLLoader(MenuPrincipalController.class.getResource("menu-registros.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Menu de Registros");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }
    
    @FXML
    protected void abrirRelatorios() throws IOException {
        FXMLLoader loader = new FXMLLoader(MenuPrincipalController.class.getResource("menu-relatorios-financeiro.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Menu de Relatorios");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }
    
}
