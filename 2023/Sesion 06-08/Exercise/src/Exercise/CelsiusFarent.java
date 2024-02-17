/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise;

import Utils.FunctionNumeric;

/**
 *
 * @author Ambiente 209-2
 */
public class CelsiusFarent {

    public void convertir() {
        FunctionNumeric cel = new FunctionNumeric();

        Double celcius = cel.InputNumericNegative("Quiero convertir numeros celcius a Farentheit solamente negativos");
        
        double resultado = (celcius*9/5)+ 32;
        
        System.out.println("El resultado en Farentheit es "+resultado);
        
    }
}
