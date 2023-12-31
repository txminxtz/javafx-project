package com.example.javafxproject.usuario;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;


public class CadastroUsuariosController {


    @FXML
    private TextField txfLogin;
    @FXML
    private TextField txfNome;
    @FXML
    private TextField txfEmail;
    @FXML
    private TextField txfTelefone;
    @FXML
    private TextField txfCargo;
    @FXML
    private PasswordField psfSenha;
        
    @FXML
    private Label nomeErroLabel;

    @FXML
    public void onActionConfirmar(ActionEvent event) {
        String login = txfLogin.getText();
        String nome = txfNome.getText();
        String email = txfEmail.getText();
        String telefone = txfTelefone.getText();
        String cargo = txfCargo.getText();
        String senha = psfSenha.getText();
    
        Usuario usuario = new Usuario(login, nome, email, telefone, cargo, senha);

        DAO_Usuario daoUsuario = new DAO_Usuario();
        usuario = daoUsuario.cadastrar(usuario);

        System.out.println(usuario.getLogin());
        System.out.println(usuario.getNome());
        System.out.println(usuario.getEmail());
        System.out.println(usuario.getTelefone());
        System.out.println(usuario.getCargo());
        System.out.println(usuario.getSenha());

        String message = "Login: " + login + "\nNome: " + nome + "\nEmail: " + email + "\nTelefone: " 
            + telefone + "\nCargo: " + cargo + "\nSenha: " + senha;

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cadastro Usuario");
        alert.setHeaderText("Cadastro bem sucedido!");
        alert.setContentText(message);
        alert.showAndWait();

    }

}