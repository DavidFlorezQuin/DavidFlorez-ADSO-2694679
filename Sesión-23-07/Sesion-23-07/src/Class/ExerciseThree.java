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
public class ExerciseThree extends ExerciseBase {

    @Override
    public Double logic() {
        this.setResultado(Math.abs(this.getNumero()));
        return this.getResultado();
    }

    @Override
    public String message() {
       return"Su numero absoluto es: "+this.getResultado();
    }
    
}
