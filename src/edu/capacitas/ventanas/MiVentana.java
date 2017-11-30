package edu.capacitas.ventanas;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiVentana extends JFrame {

    private JTextField textField;

    public MiVentana() {
        super("Titutlo de mi ventana desde el constructor");
        setSize(600, 200);
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
        FlowLayout flowLayout = new FlowLayout(FlowLayout.RIGHT);
        flowLayout.setHgap(50);
        flowLayout.setVgap(10);
        contentPane.setLayout(flowLayout);

        JLabel label = new JLabel("Nombre");
        textField = new JTextField(20);
        JButton button = new JButton("Saludar");
        button.addActionListener(new EventoSaludo2());

        contentPane.add(label);
        contentPane.add(textField);
        contentPane.add(button);
    }

    class EventoSaludo2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Hola " + textField.getText() + "!!");

        }
    }
}
