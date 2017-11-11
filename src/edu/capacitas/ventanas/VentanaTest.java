package edu.capacitas.ventanas;

import javax.swing.*;

public class VentanaTest {

    public static void main(String args[]) {


        /* venta de ejemplo instanciando la ventana Jframe
        JFrame ventana = new JFrame("Titulo de ventana");
        ventana.setSize(400,500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setVisible(true); */

        MiVentana miVentana = new MiVentana();
        miVentana.setVisible(true);

        MiVentana miVentanaDos = new MiVentana("prueba ventana dos", 700, 200);
        miVentanaDos.setVisible(true);
    }
}

