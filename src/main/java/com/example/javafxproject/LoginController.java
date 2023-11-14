package com.example.javafxproject;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private Button botaoLogin;

    @FXML
    private TextField campoSenha;

    @FXML
    private TextField campoUsuario;

    @FXML private VBox root;
    


    @FXML
    void fazerlogin(ActionEvent event) throws IOException {

        String usuario = campoUsuario.getText();
        String senha = campoSenha.getText();

        // Verifica as credenciais do usuário
        if (usuario.equals("root") && senha.equals("root")) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Login");
            alert.setHeaderText("Login bem sucedido!");
            alert.setContentText("Você foi logado com sucesso!");
            alert.showAndWait();

            FXMLLoader loader = new FXMLLoader(LoginController.class.getResource("menu-principal.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = new Stage();
            stage.setTitle("Menu de Principal");
            stage.setScene(scene);
            stage.sizeToScene();
            stage.show();


            Stage rootStage = (Stage) root.getScene().getWindow();
            rootStage.close();

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login");
            alert.setHeaderText("Entrada negada!");
            alert.setContentText("Usuário ou senha incorretos.");
            alert.showAndWait();
        }

        }
    
    }
