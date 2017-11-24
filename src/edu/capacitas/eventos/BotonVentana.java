package edu.capacitas.eventos;


import javax.swing.*;
import java.awt.*;

public class BotonVentana extends JFrame {

    public BotonVentana(String title) {
        super(title);
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());
        JButton boton = new JButton("pulsame");
        boton.addActionListener(new EventoBotonPulsado());
        getContentPane().add(boton);



    }
}
