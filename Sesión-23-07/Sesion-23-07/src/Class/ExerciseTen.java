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
    

        Double numero2 = this.capture(); // Segunda llamada al método capture()
    @Override
    public Double logic() {
        if (this.getNumero()>numero2){
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
