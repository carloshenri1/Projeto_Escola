package interfaces;

import javax.swing.*;

public class TelaAluno extends JFrame {
    public TelaAluno() {
        setTitle("Área do Aluno");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JButton btnNotas = new JButton("Ver Notas");
        JButton btnFaltas = new JButton("Ver Faltas");
        JButton btnDisciplinas = new JButton("Ver Disciplinas");

        setLayout(null);
        btnNotas.setBounds(70, 20, 150, 30);
        btnFaltas.setBounds(70, 60, 150, 30);
        btnDisciplinas.setBounds(70, 100, 150, 30);

        add(btnNotas); add(btnFaltas); add(btnDisciplinas);

        btnNotas.addActionListener(e ->
            JOptionPane.showMessageDialog(this, "Notas:\nMatemática: 8.5\nPortuguês: 9.0")
        );

        btnFaltas.addActionListener(e ->
            JOptionPane.showMessageDialog(this, "Faltas:\nMatemática: 2\nPortuguês: 0")
        );

        btnDisciplinas.addActionListener(e ->
            JOptionPane.showMessageDialog(this, "Disciplinas:\nMatemática\nPortuguês")
        );

        setVisible(true);
    }
}
