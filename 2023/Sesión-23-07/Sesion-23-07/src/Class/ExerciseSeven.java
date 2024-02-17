/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Interface.Comparative;
import Abstract.ExerciseBase;

/**
 *
 * @author david
 */
public class ExerciseSeven extends ExerciseBase {

    @Override
    public Double logic() {
        
        if (this.getNumero()%2 == 0){
            return 1.0;
        } else {
            return 0.0;
        }
    }


    @Override
    public String message() {
        Double resultado = logic();
        if (resultado == 1.0){
            return "Este numero es par";
        }
            return "Este numero es impar";
    }
    
}
