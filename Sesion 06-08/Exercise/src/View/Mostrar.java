/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Exercise.CelsiusKelvin;
import Exercise.CelsiusFarent;
import Exercise.FahrenCel;
import Exercise.FahrenKel;
import Exercise.KelCel;
import Exercise.KelFahren;
import javax.swing.JOptionPane;

/**
 *
 * @author Ambiente 209-2
 */
public class Mostrar {

    public static void main(String[] args) {

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                "Seleccione la conversión a realizar:\n"
                + "1. Celsius a Kelvin\n"
                + "2. Fahrenheit a Celsius\n"
                + "3. Fahrenheit a Kelvin\n"
                + "4. Kelvin a Celsius\n"
                + "5. Kelvin a Fahrenheit\n"
                + "0. Salir"));

        switch (opcion)
        {
            case 1:

                CelsiusFarent CelsiusFarent = new CelsiusFarent();
                CelsiusFarent.convertir();
                break;
            case 2:
                CelsiusKelvin celsius = new CelsiusKelvin();
                celsius.ConcelKel();
                break;
            case 3:

                FahrenCel FahrenCel = new FahrenCel();
                FahrenCel.ConverCel();
                break;
            case 4:

                FahrenKel FahrenKel = new FahrenKel();
                FahrenKel.ConverKel();
                break;
            case 5:

                KelCel KelCel = new KelCel();
                KelCel.ConcelKel();
                break;
            case 6:
                KelFahren KelFahren = new KelFahren();
                KelFahren.ConcelKel();
                break;

        }

    }}
