package edu.capacitas.ventanas;

import javax.swing.*;

public class MiVentana extends JFrame {

    public MiVentana() {
        super("Titutlo de mi ventana desde el constructor");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public MiVentana(String tittle, int width, int heigth){
        setTitle(tittle);
        setSize(width, heigth);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);


    }
}
