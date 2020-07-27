package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecodificadorADN extends JFrame{
    private JPanel panel1;
    private JTextField txtSecuenciaA;
    private JTextField txtSecuenciaB;
    private JTextField txtResultado;
    private JButton buttonIdentificar;
    private JLabel labelSecuenciaA;
    private JLabel labelSecuenciaB;
    private JLabel labelResultado;
    private JButton buttonLimpiar;

    private JMenuBar menuBar;
    private JMenu archivo;
    private JMenuItem salir;
    private JMenuItem memoria;

    public DecodificadorADN(){
        super("DECODIFICADOR ADN BIOTEC");

/** Agregados a la pestaña de la Ventana*/
        setContentPane(panel1);
        menuBar = new JMenuBar();
        archivo = new JMenu ("ARCHIVO");
        memoria = new JMenuItem("MEMORIA");
        salir = new JMenuItem("SALIR");


        menuBar.add(archivo);
        archivo.add(memoria);
        archivo.add(salir);


        setJMenuBar(menuBar);
        buttonIdentificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               /** Declaracion de lo contenido en las cajas de texto*/
                String SecuenciaA =txtSecuenciaA.getText();
                String SecuenciaB = txtSecuenciaB.getText();
                String Resultado = txtResultado.getText();

/**Llamado de los atributos de la clase donde se encuntra la logica*/
                MetodosdeClaseDecodificador llamado = new MetodosdeClaseDecodificador();
                String resultado = llamado.obtenerResultado(SecuenciaA, SecuenciaB, Resultado);
                txtResultado.setText(resultado);
            }
        });
        /** Accion del boton Limpiar*/
        buttonLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
txtSecuenciaA.setText(null);
txtSecuenciaB.setText(null);
txtResultado.setText(null);
            }
        });
    }

}
