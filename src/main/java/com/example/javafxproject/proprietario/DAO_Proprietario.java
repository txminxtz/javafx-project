package com.example.javafxproject.proprietario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;

public class DAO_Proprietario {

    //////////////////////////
    ////////// CREATE
    //////////////////////////
    public Proprietario create(Proprietario p){
        Proprietario proprietario = null;
        String sql = "INSERT INTO tbl_proprietarios (nome, email, telefone) VALUES (?, ?, ?)";


        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {
            statement.setString(1, p.getNome());
            statement.setString(2, p.getEmail());
            statement.setString(3, p.getTelefone());
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if(rs.next()) {
                proprietario = new Proprietario(rs.getInt(1), p.getNome(), p.getEmail(), p.getTelefone());
            }

            rs.close();

            return proprietario;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //////////////////////////
    ////////// READ
    //////////////////////////
    // public Proprietario read(Integer cod) {
    //     Proprietario proprietario = null;
    //     String sql = "SELECT * FROM tbl_proprietarios WHERE cod = ?";

    //     try (
    //         Connection connection = Conexao.getConnection();
    //         PreparedStatement statement = connection.prepareStatement(sql);
    //     ) {
    //         statement.setInt(1, cod);

    //         ResultSet rs = statement.executeQuery();
            
    //         if (rs.next()) {
    //             proprietario = new Proprietario (rs.getInt("cod"),  rs.getString("nome"), rs.getString("email"), rs.getString("telefone"));
    //         }

    //         rs.close();

    //         return proprietario ;
    //     } catch (SQLException e) {
    //         e.printStackTrace();
    //         return null;
    //     }
    // }

    // //////////////////////////
    // ////////// UPDATE
    // //////////////////////////
    // public void update(Proprietario p) {
    //     String sql = "UPDATE proprietario SET nome = ?, email = ?, telefone = ? WHERE cod = ?";

    //     try (
    //         Connection connection = Conexao.getConnection();
    //         PreparedStatement statement = connection.prepareStatement(sql);
    //     ) {
    //         statement.setInt(1, p.getCod());
    //         statement.setString(2, p.getNome());
    //         statement.setString(3, p.getEmail());
    //         statement.setString(4, p.getTelefone());

    //         statement.executeUpdate();

    //         System.out.println("O proprietario " + p.getCod() + " foi atualizado com sucesso.");
    //     } catch (SQLException e) {
    //         e.printStackTrace();
    //     }
    // }

    // //////////////////////////
    // ////////// DELETE
    // //////////////////////////
    // public void delete(Proprietario p) {
    //     String sql = "DELETE FROM proprietario WHERE cod = ?";

    //     try (
    //         Connection connection = Conexao.getConnection();
    //         PreparedStatement statement = connection.prepareStatement(sql);
    //     ) {
    //         statement.setInt(1, p.getCod());

    //         statement.execute();

    //         System.out.println("O proprietario " + p.getCod() + " foi excluido com sucesso.");
    //     } catch (SQLException e) {
    //         e.printStackTrace();
    //     }
    // }

    // //////////////////////////
    // ////////// EXIBE
    // //////////////////////////
    // public List<Proprietario> listarTodos() {
    //     String sql = "SELECT * FROM proprietario";
    //     List<Proprietario> proprietario = new ArrayList<>();

    //     try (
    //         Connection connection = Conexao.getConnection();
    //         Statement statement = connection.createStatement();
    //         ResultSet rs = statement.executeQuery(sql);
    //     ) {
    //         while (rs.next()) {
    //             proprietario.add(
    //                 new Proprietario(
    //                     rs.getInt("cod"),
    //                     rs.getString("nome"),
    //                     rs.getString("email"),
    //                     rs.getString("telefone")
    //                 )
    //             );
    //         }
    //     } catch (SQLException e) {
    //         e.printStackTrace();
    //         return null;
    //     }

    //     return proprietario;
    // }

}

