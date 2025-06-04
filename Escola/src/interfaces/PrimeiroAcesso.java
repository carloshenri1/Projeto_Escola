package interfaces;

import javax.swing.*;

public class PrimeiroAcesso extends JFrame {
	private UsuarioDAO dao = new UsuarioDAO();

    public PrimeiroAcesso() {
        setTitle("Primeiro Acesso");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField();
        JLabel lblUsuario = new JLabel("Usuário:");
        JTextField txtUsuario = new JTextField();
        JLabel lblSenha = new JLabel("Senha:");
        JPasswordField txtSenha = new JPasswordField();
        JButton btnCriar = new JButton("Criar Conta");

        setLayout(null);
        lblNome.setBounds(20, 10, 80, 25);
        txtNome.setBounds(100, 10, 150, 25);
        lblUsuario.setBounds(20, 40, 80, 25);
        txtUsuario.setBounds(100, 40, 150, 25);
        lblSenha.setBounds(20, 70, 80, 25);
        txtSenha.setBounds(100, 70, 150, 25);
        btnCriar.setBounds(100, 110, 120, 25);

        add(lblNome); add(txtNome);
        add(lblUsuario); add(txtUsuario);
        add(lblSenha); add(txtSenha);
        add(btnCriar);

        btnCriar.addActionListener(e -> {
            String nome = txtNome.getText();
            String usuario = txtUsuario.getText();
            String senha = new String(txtSenha.getPassword());

            // Por padrão, novo usuário é aluno
            boolean sucesso = dao.criarUsuario(nome, usuario, senha, "aluno");

            if (sucesso) {
                JOptionPane.showMessageDialog(this, "Usuário criado com sucesso!");
                dispose();
            }
        });


        setVisible(true);
    }
}
