/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.lab2.swing;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ADMIN
 */
public class Frame extends JFrame {

    //textos
    JTextField nombre = new JTextField(20);
    JTextField telefono = new JTextField(20);

    //botones
    JButton clear = new JButton("Clear");
    JButton aceptar = new JButton("Aceptar");

    //drop down
    String[] opciones = {"Masculino", "Femenino"};
    JComboBox generos = new JComboBox(opciones);

    public Frame() {
        // datos de la ventana
        super("Informacion de Usuario");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(); //creo el panel

        //TEXTO
        //creo los label
        JLabel nombrelbl = new JLabel("Nombre: ");
        JLabel telefonolbl = new JLabel("Telefono: ");

        //nombre a componentes (texto)        
        nombrelbl.setName("nombre");
        telefonolbl.setName("telefono");
        nombre.setName("nombre");
        telefono.setName("telefono");

        //agregar campo de texto y nombre que indique
        panel.add(nombrelbl);

        panel.add(nombre);

        panel.add(telefonolbl);

        panel.add(telefono);
        //FIN DE TEXTO

        //agregar drop down
        JLabel opcionesLabel = new JLabel("Genero: ");

        panel.add(opcionesLabel);

        panel.add(generos);

        //BOTONES
        //nombre a componentes (botones)
        clear.setName(
                "clear");
        aceptar.setName(
                "aceptar");

        //agrega los botones
        panel.add(clear);

        panel.add(aceptar);
        //FIN DE BOTONES

        //agregar panel
        add(panel);

        setVisible(
                true);

    }

    public static void main(String[] arguments) {
        Frame sf = new Frame();
    }
}
