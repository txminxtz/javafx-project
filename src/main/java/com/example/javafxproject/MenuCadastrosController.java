package com.example.javafxproject;

import javafx.scene.control.Alert;

public class MenuCadastrosController {
    
    public void abrirUsuarios() {
    
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cadastro Usuarios");
        alert.setHeaderText("Entrada efetuada!");
        alert.setContentText("Você será levado(a) à tela Cadastro Usuarios !");
        alert.showAndWait();        
    }
    
    public void abrirPoprietarios() {
      
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cadastro Proprietarios");
        alert.setHeaderText("Entrada efetuada!");
        alert.setContentText("Você será levado(a) à tela Cadastro Proprietarios !");
        alert.showAndWait();     
    }

    public void abrirVeiculos() {
    
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cadastro Veiculos");
        alert.setHeaderText("Entrada efetuada!");
        alert.setContentText("Você será levado(a) à tela Cadastro Veiculos !");
        alert.showAndWait();         
    }

    public void abrirPrecos() {
    
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Atualizar Preços");
        alert.setHeaderText("Entrada efetuada!");
        alert.setContentText("Você será levado(a) à tela Atualização de Preços !");
        alert.showAndWait();        
    }
   
}
