package com.example.javafxproject.veiculos;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;


public class CadastroVeiculosController {
    @FXML
    private TextField txfPlaca;
    @FXML
    private TextField txfModelo;
    @FXML
    private TextField txfMarca;
    @FXML
    private TextField txfCor;
    @FXML
    private TextField txfProprietario;
    
    public void onActionConfirmar() {
        String placa = txfPlaca.getText();
        String modelo = txfModelo.getText();
        String marca = txfMarca.getText();
        String cor = txfCor.getText();
        String proprietario = txfProprietario.getText();
    
        Veiculo veiculo = new Veiculo();
    
        DAO_Veiculo daoVeiculo = new DAO_Veiculo();
        veiculo = daoVeiculo.cadastrar(veiculo);
    
        System.out.println(veiculo.getPlaca());
        System.out.println(veiculo.getModelo());
        System.out.println(veiculo.getMarca());
        System.out.println(veiculo.getCor());
        System.out.println(veiculo.getProprietario());

        String message = "Placa: " + placa + "\nModelo: " + modelo + "\nMarca: " 
            + marca + "\nCor: " + cor + "\nProprietario: " + proprietario;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cadastro Veiculos");
        alert.setHeaderText("Cadastro bem sucedido!");
        alert.setContentText(message);
        alert.showAndWait();



    }
    
}
