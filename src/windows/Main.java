package windows;

import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hello world");

        // componente JFrame

        JFrame miJFrame = new JFrame("Ejemplo - Java Swing"); //BASE - CONTENEDOR NIVEL SUPERIOR
        miJFrame.setSize(500, 300);

        // componente JPanel

        JPanel miJPanel = new JPanel();// UBICACION DE ELEMENTOS, JPANEL, JSCROLLPAN, JTABBED PANE - CONTENEDOR NIVEL INTERMEDIO
        miJPanel.setBackground(Color.GREEN);
        miJPanel.setSize(300, 300);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.orange);
        panel2.setSize(10, 10);

        // usamos este diseño para centrar los componentes de JPanel

//        miJPanel.setLayout(new GridBagLayout());

        // ALMACENA OTROS ELEMENTOS, JBUTTON, JLABEL, JCOMBOBOX, JTEXTFIELD - CONTENEDOR ATOMICO

        // componente JTextField

        JLabel miJlabel = new JLabel();
        miJlabel.setText("Dime tu opinion acerca de Java Swing: ");

        // componete JTextArea

        JTextArea miJTextArea = new JTextArea(2, 20);

        // conecta los componentes JLabel y JTextField en JPanel

        miJPanel.add(miJlabel);
        miJPanel.add(miJTextArea);

        // conectar Jpanel a JFrame

        miJFrame.add(miJPanel);
//        miJFrame.add(panel2);

        // hacer visible JFrame

        miJFrame.setVisible(true);
    }
}
