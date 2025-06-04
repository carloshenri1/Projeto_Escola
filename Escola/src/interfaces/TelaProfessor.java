package interfaces;

import javax.swing.*;

public class TelaProfessor extends JFrame {
    public TelaProfessor() {
        setTitle("Área do Professor");
        setSize(350, 250);
        setLocationRelativeTo(null);

        JButton btnNota = new JButton("Adicionar Notas");
        JButton btnFalta = new JButton("Adicionar Faltas");
        JButton btnDisciplina = new JButton("Adicionar Disciplinas");

        setLayout(null);
        btnNota.setBounds(80, 20, 180, 30);
        btnFalta.setBounds(80, 70, 180, 30);
        btnDisciplina.setBounds(80, 120, 180, 30);

        add(btnNota); add(btnFalta); add(btnDisciplina);

        btnNota.addActionListener(e -> JOptionPane.showMessageDialog(this, "Nota adicionada com sucesso!"));
        btnFalta.addActionListener(e -> JOptionPane.showMessageDialog(this, "Falta registrada com sucesso!"));
        btnDisciplina.addActionListener(e -> JOptionPane.showMessageDialog(this, "Disciplina cadastrada com sucesso!"));

        setVisible(true);
    }
}
