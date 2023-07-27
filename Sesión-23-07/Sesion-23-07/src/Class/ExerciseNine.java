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
public class ExerciseNine extends ExerciseBase implements Comparative{
        @Override
    public Double logic() {
        if (this.getNumero() > 200 && this.getNumero() < 300){
        return 1.0;
    }else
        return 0.0;
    }

    @Override
    public String message() {
        Double resultado = logic();
        
        if (resultado == 1.0){
            return "El numero está dentro del rango de 200 y 300, ademas "+TypeNumber();
        }else {
            return "El numero NO esta dentro del rango";
        }
    }

    @Override
    public String TypeNumber() {
            if (this.getNumero()%2==0){
        return "es un numero par";
    }else{
        return "es un numero impar";

            }
    }
}
