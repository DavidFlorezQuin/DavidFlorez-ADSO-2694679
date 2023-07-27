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
    

    Double numero1 = this.getNumero(); 
    Double numero2 = this.getNumero(); 
    
    @Override
    public Double logic() {
        if (numero1 > numero2){
            return 1.0;
        }else {
            return 0.0;
        }
    }

    @Override
    public String message() {
        Double resultado = logic();
        if (resultado == 1.0){
            return "El primer numero es mayor al segundo";
        }else{
            return "El segundo numero numero es mayor al primero";

        }
    }
    
}
