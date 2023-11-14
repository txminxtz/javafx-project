package com.example.javafxproject.veiculos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;

public class DAO_Veiculo {

    //////////////////////////
    ////////// CREATE
    //////////////////////////
    public Veiculo cadastrar(Veiculo v) {
        Veiculo veiculo = null;
        String sql = "INSERT INTO veiculo (placa, marca, modelo, cor, proprietario) VALUES (?, ?, ?, ?, ?)";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ) {
            statement.setString(1, v.getPlaca());
            statement.setString(2, v.getMarca());
            statement.setString(3, v.getModelo());
            statement.setString(4, v.getCor());
            statement.setInt(5, v.getProprietario());
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            System.out.println("O veiculo " + v.getPlaca() + " foi incluido com sucesso.");

            if (rs.next()) {
                veiculo = new Veiculo(v.getPlaca(), v.getMarca(), v.getModelo(), v.getCor(), v.getProprietario());
            }

            rs.close();

            return veiculo;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //////////////////////////
    ////////// READ
    //////////////////////////
    public Veiculo read(String placa) {
        Veiculo veiculo = null;
        String sql = "SELECT * FROM veiculo WHERE placa = ?";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setString(1, placa);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                veiculo = new Veiculo(rs.getString("placa"), rs.getString("marca"), rs.getString("modelo"), rs.getString("cor"),rs.getInt("proprietario"));
            }

            rs.close();

            return veiculo;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //////////////////////////
    ////////// UPDATE
    //////////////////////////
    public void update(Veiculo v) {
        String sql = "UPDATE veiculo SET marca = ?, modelo = ?, cor = ?, proprietario = ? WHERE placa = ?";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setString(1, v.getPlaca());
            statement.setString(2, v.getMarca());
            statement.setString(3, v.getModelo());
            statement.setString(4, v.getCor());
            statement.setInt(5, v.getProprietario());

            statement.executeUpdate();

            System.out.println("O veiculo " + v.getPlaca() + " foi atualizado com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //////////////////////////
    ////////// DELETE
    //////////////////////////
    public void delete(Veiculo v) {
        String sql = "DELETE FROM veiculo WHERE placa = ?";

        try (
            Connection connection = Conexao.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            statement.setString(1, v.getPlaca());

            statement.execute();

            System.out.println("O veiculo " + v.getPlaca() + " foi excluido com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //////////////////////////
    ////////// EXIBE
    //////////////////////////
    public List<Veiculo> listarTodos() {
        String sql = "SELECT * FROM veiculo";
        List<Veiculo> veiculo = new ArrayList<>();

        try (
            Connection connection = Conexao.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
        ) {
            while (rs.next()) {
                veiculo.add(
                    new Veiculo(
                        rs.getString("placa"),
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getString("cor"),
                        rs.getInt("proprietario")
                    )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

        return veiculo;
    }

}

