package windows;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal {
    public static void main(String[] args) {
        System.out.println("Hola como estas");

        JFrame ventana = new JFrame("Menu");
        ventana.setSize(400, 300);
        ventana.setLocation(100, 400);
//        ventana.setLocationRelativeTo(null); //centrar ventana
        ventana.setResizable(false);//reminecionar
//        ventana.setMinimumSize(new Dimension(200,200));
//        ventana.getContentPane().setBackground(Color.BLUE);

        //panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);

        //Labels
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Seleccione una opción de conversión: ");
        etiqueta.setBounds(20, 20, 300, 40);
//        etiqueta.setLocation(0, 20);
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.GRAY);
        etiqueta.setForeground(Color.pink);
        panel.add(etiqueta);


        ventana.add(panel);

        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
