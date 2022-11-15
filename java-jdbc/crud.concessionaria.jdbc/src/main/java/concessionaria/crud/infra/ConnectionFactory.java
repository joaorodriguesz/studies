package concessionaria.crud.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private ConnectionFactory(){}

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/sistema_concessionaria","root", "root123");
        } catch (SQLException ex) {
            throw new RuntimeException("Erro na conexao do banco de dados :" + ex);
        }
    }
}