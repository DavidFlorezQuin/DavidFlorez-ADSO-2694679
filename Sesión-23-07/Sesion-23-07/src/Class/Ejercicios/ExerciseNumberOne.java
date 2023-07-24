/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Ejercicios;

import Abstract.RunnableAbstact;
/**
 *
 * @author Desarrollador
 */
public class ExerciseNumberOne extends RunnableAbstact {
    
    int Number = 10;

    @Override
    public void ComparateNumber(){
        
        System.out.println("ELEJISTE EL PRIMER EJERCICIO");
        System.out.println("=============================");
        System.out.println("Leer un real e imprimir si el nUmero es mayor a 5.");
        System.out.println("=============================");
         if (Number > 5){
             System.out.println("El numero es mayor a cinco");
         }
    }
}
