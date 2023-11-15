package com.example.javafxproject.usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;

public class DAO_Usuario {

    //////////////////////////
    ////////// CREATE
    //////////////////////////
    public Usuario cadastrar(Usuario u) {
        Usuario usuario = null;
        String sql = "INSERT INTO tbl_usuarios (login, nome, email, telefone, cargo, senha) VALUES (?, ?, ?, ?, ?, ?)";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {
            statement.setString(1, u.getLogin());
            statement.setString(2, u.getNome());
            statement.setString(3, u.getEmail());
            statement.setString(4, u.getTelefone());
            statement.setString(5, u.getCargo());
            statement.setString(6, u.getSenha());
            statement.executeUpdate();

            usuario = new Usuario(u.getLogin(), u.getNome(), u.getCargo(), u.getEmail(), u.getTelefone(), u.getSenha());

            return usuario;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //////////////////////////
    ////////// READ
    //////////////////////////
    /*public Usuario read(String sLogin) {
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
    }*/
    
}

