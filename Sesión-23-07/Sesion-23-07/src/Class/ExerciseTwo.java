/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Abstract.ExerciseBase;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class ExerciseTwo extends ExerciseBase {



    @Override
    public Double logic() {
        this.setResultado(Math.pow(this.getNumero(), 2));
        
        if(this.getResultado()>5000){
            return 1.0;
        }else {
            return 0.0;
        }

    }

    @Override
    public String message() {
        Double Resultado = logic();
            if (Resultado == 1.0){
                return "Su cuadrado es "+this.getResultado()+" y es mayor a 5000";
            }else{
                return "Su cuadrado es "+this.getResultado()+" y no es mayor a 5000";
            }
    }

}
