package interfaces;

import java.sql.*;

import javax.swing.JOptionPane;

public class UsuarioDAO {
    public String autenticar(String usuario, String senha) {
        String tipo = null;
        try (Connection conn = Conexao.conectar()) {
            String sql = "SELECT tipo FROM usuarios WHERE usuario = ? AND senha = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                tipo = rs.getString("tipo");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tipo;
    }

    public boolean criarUsuario(String nome, String usuario, String senha, String tipo) {
        try (Connection conn = Conexao.conectar()) {
            String sql = "INSERT INTO usuarios (nome, usuario, senha, tipo) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, usuario);
            stmt.setString(3, senha);
            stmt.setString(4, tipo);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar usuário: " + e.getMessage());
            return false;
        }
    }
}
