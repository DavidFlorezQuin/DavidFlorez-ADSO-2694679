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
public class ExerciseFive extends ExerciseBase{

    @Override
    public Double logic() {
        if(this.getNumero()>200){
            return 1.0;
        }else{
            return 0.0;
        }
    }

    @Override
    public String message() {
        Double resultado = logic();
        
        if (resultado == 1.0){
            return "El numero es mayor a doscientos";
        }else {
            return "El numero es menor a doscientos";
        }

    }
    
}
