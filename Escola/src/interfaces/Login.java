
package interfaces;
import javax.swing.*;
import java.awt.event.*;


public class Login extends JFrame {
	private UsuarioDAO dao = new UsuarioDAO();

    public Login() {
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel lblUsuario = new JLabel("Usuário:");
        JTextField txtUsuario = new JTextField();
        JLabel lblSenha = new JLabel("Senha:");
        JPasswordField txtSenha = new JPasswordField();
        JButton btnLogin = new JButton("Login");
        JButton btnEsqueci = new JButton("Esqueci a senha");
        JButton btnPrimeiroAcesso = new JButton("Primeiro Acesso");

        setLayout(null);
        lblUsuario.setBounds(20, 20, 80, 25);
        txtUsuario.setBounds(100, 20, 150, 25);
        lblSenha.setBounds(20, 60, 80, 25);
        txtSenha.setBounds(100, 60, 150, 25);
        btnLogin.setBounds(20, 100, 100, 25);
        btnEsqueci.setBounds(130, 100, 140, 25);
        btnPrimeiroAcesso.setBounds(20, 130, 250, 25);

        add(lblUsuario); add(txtUsuario);
        add(lblSenha); add(txtSenha);
        add(btnLogin); add(btnEsqueci); add(btnPrimeiroAcesso);

        btnLogin.addActionListener(e -> {
            String usuario = txtUsuario.getText();
            String senha = new String(txtSenha.getPassword());

            String tipo = dao.autenticar(usuario, senha);

            if ("aluno".equals(tipo)) {
                dispose();
                new TelaAluno();
            } else if ("professor".equals(tipo)) {
                dispose();
                new TelaProfessor();
            } else {
                JOptionPane.showMessageDialog(this, "Login inválido");
            }
        });


        btnEsqueci.addActionListener(e -> new EsqueciSenha());
        btnPrimeiroAcesso.addActionListener(e -> new PrimeiroAcesso());

        setVisible(true);
    }
}
