/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Class.Ejercicios.ExerciseNumberOne;
import java.util.Scanner;

/**
 *
 * @author Desarrollador
 */
public class ViewerExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija el ejercicio que desea ejecutar (1, 2 o 3):");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                ExerciseNumberOne obj = new ExerciseNumberOne();
                obj.ComparateNumber();
                break;

            default:
                System.out.println("Opción inválida. Por favor, elija un número válido (1, 2 o 3).");
        }
    }
}
