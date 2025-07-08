package br.com.dio.warehouse.ui;

import javax.swing.*;
import java.awt.*;

public class SupplierForm {
    public static void showForm() {
        JFrame frame = new JFrame("Cadastro de Fornecedor");
        frame.setSize(400, 250);
        frame.setLayout(new GridLayout(4, 2));

        JTextField nameField = new JTextField();
        JTextField cnpjField = new JTextField();
        JTextField contactField = new JTextField();

        frame.add(new JLabel("Nome:"));
        frame.add(nameField);
        frame.add(new JLabel("CNPJ:"));
        frame.add(cnpjField);
        frame.add(new JLabel("Contato:"));
        frame.add(contactField);

        JButton submit = new JButton("Salvar");
        frame.add(submit);

        submit.addActionListener(e -> {
            System.out.println("Fornecedor salvo: " + nameField.getText());
            JOptionPane.showMessageDialog(frame, "Salvo com sucesso!");
        });

        frame.setVisible(true);
    }
}