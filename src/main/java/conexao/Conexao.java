package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection getConnection() {
        
        //String url = "jdbc:mysql://localhost/db_estacionamento?user=estudante1&password=estudante&useSSL=true";
     
        String url = "jdbc:mysql://localhost:3306/db_estacionamento?user=root&password=bts4";
        
        try {
            return (Connection) DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}