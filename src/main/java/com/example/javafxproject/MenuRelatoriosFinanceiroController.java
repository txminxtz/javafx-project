package com.example.javafxproject;

import javafx.scene.control.Alert;

public class MenuRelatoriosFinanceiroController {
    
    public void abrirGeral() {
    
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Relatorio Geral por Periodo");
        alert.setHeaderText("Entrada efetuada!");
        alert.setContentText("Você será levado(a) à tela Geral por Periodo!");
        alert.showAndWait();        
    }
    
    public void abrirVeiculos() {
      
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Relatorio Veiculos por Periodo");
        alert.setHeaderText("Entrada efetuada!");
        alert.setContentText("Você será levado(a) à tela Veiculos por Periodo !");
        alert.showAndWait();     
    }

    public void abrirVeiculosEstacionados() {
    
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Relatorio Veiculos Estacionados");
        alert.setHeaderText("Entrada efetuada!");
        alert.setContentText("Você será levado(a) à tela Veiculos Estacionados!");
        alert.showAndWait();         
    }
   
}
