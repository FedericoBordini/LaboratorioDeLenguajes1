package edu.capacitas.ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoSaludo implements ActionListener {

    private JTextField jTextField;

    public EventoSaludo(JTextField jTextField) {
        this.jTextField = jTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Hola " + jTextField.getText() + "!!");
    }
}
