package edu.capacitas.ventanas;


import javax.swing.*;
import java.awt.*;

public class MiVentana extends JFrame {

    public MiVentana() {
        super("Titutlo de mi ventana desde el constructor");
        setSize(400, 500);
        initComponent();

    }



    public MiVentana(String tittle, int width, int heigth){
        setTitle(tittle);
        setSize(width, heigth);
        initComponent();
    }

    private void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        JLabel label = new JLabel("Nombre");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Saludar");

        contentPane.add(label);
        contentPane.add(textField);
        contentPane.add(button);
    }
}
