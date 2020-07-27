package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                /**Configuracion de la ventana*/
                JFrame frame = new DecodificadorADN();
                frame.setSize(550,200);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
