/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Abstract.ExerciseBase;
import Interface.Comparative;

/**
 *
 * @author Desarrollador
 */
public class ExerciseEight extends ExerciseBase implements Comparative {
        @Override
    public Double logic() {
        if (this.getNumero()%2 ==0){
            return 1.0;
        } else {
            return 0.0;
        }

    }
    @Override
    public String TypeNumber() {
        if (this.getNumero()>0){
            return "es numero positivo";
        }else{
            return "es un numero negativo";
        }
    }

    @Override
    public String message() {
        Double resultado = logic();
        if (resultado == 1.0){
            return "Este numero es par y "+TypeNumber();
        }
            return "Este numero es impar y "+TypeNumber();
    }
}
