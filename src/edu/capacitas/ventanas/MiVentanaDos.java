package edu.capacitas.ventanas;

import javax.swing.*;
import java.awt.*;

public class MiVentanaDos extends JFrame {

        public MiVentanaDos(){
            super("Ejemplo de Grid Layout");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Container content = getContentPane();

            GridLayout gridLayout = new GridLayout(4, 3);
            gridLayout.setHgap(5);
            gridLayout.setVgap(5);

            content.setLayout(gridLayout);

            for (int i = 1; i <= 9; i++ ) {
                content.add(new JButton(String.valueOf(i)));
            }
            content.add(new JButton("*"));
            content.add(new JButton("0"));
            content.add(new JButton("#"));

        }


}
