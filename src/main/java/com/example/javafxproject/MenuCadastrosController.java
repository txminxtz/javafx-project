package com.example.javafxproject;

import javafx.scene.control.Alert;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuCadastrosController {
    
    @FXML
    protected void abrirUsuarios() throws IOException {
        FXMLLoader loader = new FXMLLoader(MenuCadastrosController.class.getResource("cadastro-usuarios.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Cadastros de Usuarios");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }
      
    @FXML
    protected void abrirProprietarios() throws IOException {
        FXMLLoader loader = new FXMLLoader(MenuCadastrosController.class.getResource("cadastro-proprietario.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Cadastro de Proprietarios");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }
      
    @FXML
    protected void abrirVeiculos() throws IOException {
        FXMLLoader loader = new FXMLLoader(MenuCadastrosController.class.getResource("cadastro-veiculos.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Cadastro de Veiculos");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }
          
    @FXML
    protected void abrirPrecos() throws IOException {
        FXMLLoader loader = new FXMLLoader(MenuCadastrosController.class.getResource("atualizacao-precos.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Atualização de Preços");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    }
   
}
