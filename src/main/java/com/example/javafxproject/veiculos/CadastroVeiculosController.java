package com.example.javafxproject.veiculos;

import com.example.javafxproject.veiculos.DAO_Veiculo;

import javafx.fxml.FXML;
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
    }
    
}
