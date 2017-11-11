package edu.capacitas.ventanas;


import javax.swing.*;
import java.awt.*;

public class MiVentana3 extends JFrame {

    public MiVentana3(){
        super("Ejemplo de JPanel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400, 200 );


        // panel de fecha
        JPanel panelFecha = new JPanel(new FlowLayout());
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));


        //panel de datos
        JPanel panelDatos = new JPanel(new GridLayout(3, 2, 0, 5));
        panelDatos.add(new JLabel("nombre:"));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("DNI:"));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("fecha de nacimiento:"));
        panelDatos.add(panelFecha);


        //panel de botones
        JPanel panelBotones = new JPanel(new FlowLayout());
        panelBotones.add(new JButton("cancelar"));
        panelBotones.add(new JButton("aceptar"));


        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(panelDatos, BorderLayout.CENTER);
        container.add(panelDatos, BorderLayout.SOUTH);


    }

}


