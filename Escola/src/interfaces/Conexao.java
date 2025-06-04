package interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/Escola";
    private static final String USUARIO = "root"; // Altere se necessário
    private static final String SENHA = "040772"; // Altere se necessário

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }
}
