package com.example.javafxproject.usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;

public class DAO_Usuario {

    //////////////////////////
    ////////// CREATE
    //////////////////////////
    public Usuario cadastrar(Usuario u) {
        Usuario usuario = null;
        String sql = "INSERT INTO usuario (nome, email, telefone, cargo, senha) VALUES (?, ?, ?, ?, ?)";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {
            statement.setString(1, u.getNome());
            statement.setString(2, u.getEmail());
            statement.setString(3, u.getTelefone());
            statement.setString(4, u.getCargo());
            statement.setString(5, u.getSenha());
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            System.out.println("O usuario " + u.getNome() + " foi incluido com sucesso.");

            if (rs.next()) {
                usuario = new Usuario(u.getNome(), u.getCargo(), u.getEmail(), u.getTelefone(), u.getSenha());
            }

            rs.close();

            return usuario;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //////////////////////////
    ////////// READ
    //////////////////////////
    public Usuario read(String sLogin) {
        Usuario usuario = null;
        String sql = "SELECT * FROM usuario WHERE login = ?";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setString(1, sLogin);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                usuario = new Usuario(rs.getString("nome"), rs.getString("email"), rs.getString("telefone"), rs.getString("cargo"),rs.getString("senha"));
            }

            rs.close();

            return usuario;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //////////////////////////
    ////////// UPDATE
    //////////////////////////
    public void update(Usuario u) {
        String sql = "UPDATE usuario SET nome = ?, email = ?, telefone = ?, cargo = ?, senha = ? WHERE nome = ?";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setString(1, u.getNome());
            statement.setString(2, u.getEmail());
            statement.setString(3, u.getTelefone());
            statement.setString(4, u.getCargo());
            statement.setString(5, u.getSenha());

            statement.executeUpdate();

            System.out.println("O usuario " + u.getNome() + " foi atualizado com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //////////////////////////
    ////////// DELETE
    //////////////////////////
    public void delete(Usuario u) {
        String sql = "DELETE FROM usuario WHERE nome = ?";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setString(1, u.getNome());

            statement.execute();

            System.out.println("O usuario " + u.getNome() + " foi excluido com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //////////////////////////
    ////////// EXIBE
    //////////////////////////
    public List<Usuario> listarTodos() {
        String sql = "SELECT * FROM usuario";
        List<Usuario> usuarios = new ArrayList<>();

        try (
            Connection connection = Conexao.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        ) {
            while (rs.next()) {
                usuarios.add(
                    new Usuario(
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getString("telefone"),
                        rs.getString("cargo"),
                        rs.getString("senha")
                    )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

        return usuarios;
    }

}

