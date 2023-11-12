package com.example.javafxproject;

import javafx.scene.control.Alert;

public class MenuPrincipalController {
    
    public void abrirCadastros() {
    
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cadastros");
        alert.setHeaderText("Entrada efetuada!");
        alert.setContentText("Você será levado(a) à tela Menu de Cadastros !");
        alert.showAndWait();        
    }
    
    public void abrirRegistros() {
      
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registros");
        alert.setHeaderText("Entrada efetuada!");
        alert.setContentText("Você será levado(a) à tela Menu de Registros !");
        alert.showAndWait();     
    }

    public void abrirRelatorios() {
    
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Relatorios");
        alert.setHeaderText("Entrada efetuada!");
        alert.setContentText("Você será levado(a) à tela Menu de Relatorios !");
        alert.showAndWait();         
    }

}
