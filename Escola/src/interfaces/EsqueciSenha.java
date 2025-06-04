package interfaces;
import javax.swing.*;

public class EsqueciSenha extends JFrame {
    public EsqueciSenha() {
        setTitle("Recuperar Senha");
        setSize(300, 150);
        setLocationRelativeTo(null);

        JLabel lblEmail = new JLabel("Email:");
        JTextField txtEmail = new JTextField();
        JButton btnEnviar = new JButton("Enviar");

        setLayout(null);
        lblEmail.setBounds(20, 20, 80, 25);
        txtEmail.setBounds(100, 20, 150, 25);
        btnEnviar.setBounds(100, 60, 80, 25);

        add(lblEmail); add(txtEmail); add(btnEnviar);

        btnEnviar.addActionListener(e -> {
            String email = txtEmail.getText();
            JOptionPane.showMessageDialog(this, "Email enviado para " + email);
            dispose();
        });

        setVisible(true);
    }
}
