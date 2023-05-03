package windows;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.io.*;
import okhttp3.*;

public class Main{
    public static void main(String[] args) throws IOException {
        String cadena;
        String[] opciones = {"Converso de Moneda", "Conversor de Temperatura"};
        String[] conversor_monedas = {"De soles a Dólar", "De Soles a Euro", "De Dolar a Soles", "De Euro a Soles"};

        Double[] valor_monedas = {3.686179, 0.907215};

        String[] conversor_temperatura = {"De Celcius a Farenguei"};


        Object valor = JOptionPane.showInputDialog(null, "Seleccione", "MENU", JOptionPane.QUESTION_MESSAGE, null, opciones, null);

            if (valor.equals(opciones[0])){
            System.out.println(valor);
            Object to_change = JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.QUESTION_MESSAGE, null, conversor_monedas, null);

            String to_value = "";
            double v = 0;
            switch (to_change.toString()){
                case "De soles a Dólar":
                    to_value = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");
                    v = Double.parseDouble(to_value) / valor_monedas[0];
                    JOptionPane.showConfirmDialog(null, Double.toString(v));

                case "De Soles a Euro":
                     to_value = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");
                     v = (Double.parseDouble(to_value) / valor_monedas[0]) * valor_monedas[1];
                    JOptionPane.showConfirmDialog(null, Double.toString(v));

                case "De Dolar a Soles":
                    to_value = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");
                    v = (Double.parseDouble(to_value) * valor_monedas[0]);
                    JOptionPane.showConfirmDialog(null, Double.toString(v));

                case "De Euro a Soles":
                    to_value = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");
                    v = (Double.parseDouble(to_value)/ valor_monedas[1] ) * valor_monedas[0];
                    JOptionPane.showConfirmDialog(null, Double.toString(v));
            }
            if ("yes".equalsIgnoreCase(to_value) && JOptionPane.YES_OPTION == 0) {
                System.exit(0);
            }

            Object import1 = JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir: ", "Monedas", JOptionPane.QUESTION_MESSAGE, null, conversor_monedas, null);

        }
        if (valor.equals(opciones[1])){
            System.out.println(valor);
            JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.QUESTION_MESSAGE, null, conversor_temperatura, null);
        }

        System.out.println(valor);
    }
}
