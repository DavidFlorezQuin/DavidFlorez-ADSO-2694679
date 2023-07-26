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
public class ExerciseSix extends ExerciseBase{

    @Override
    public Double logic() {
        if (this.getNumero() > 50 || this.getNumero() < 100){
        return 1.0;
    }else
        return 0.0;
    }

    @Override
    public String message() {
        Double resultado = logic();
        
        if (resultado == 1.0){
            return "El numero está dentro del rango de 50 y 100";
        }else {
            return "El numero NO esta dentro del rango";
        }
    }
    
}
