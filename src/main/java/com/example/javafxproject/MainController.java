package com.example.javafxproject;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {

    @FXML
    protected void onAbrirCadastroCliente() throws IOException {
    FXMLLoader loader = new FXMLLoader(MainController.class.getResource("cliente/cadastro-view.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Cadastro de Cliente");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }
}
