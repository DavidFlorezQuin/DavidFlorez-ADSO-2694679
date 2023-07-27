/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Abstract.ExerciseBase;

/**
 *
 * @author Desarrollador
 */
public class ExerciseTen extends ExerciseBase{

    @Override
    public Double logic() {
        Double num1 = this.getNumero(); // Ya hemos capturado el primer número
        Double num2 = this.capture(); // Capturamos el segundo número

        // Comparar los números
        if (num1 > num2) {
            return 1.0; // El primer número es mayor que el segundo
        } else if (num1 < num2) {
            return 0.0; // El primer número es menor que el segundo
        } else {
            return -1.0; // Los números son iguales
        }
    }

    @Override
    public String message() {
        double resultado = logic();
        if (resultado == 1.0) {
            return "El primer número es mayor";
        } else if (resultado == 0.0) {
            return "El segundo numero es el mayor.";
        } else {
            return "Los números son iguales.";
        }
    }
}

   
