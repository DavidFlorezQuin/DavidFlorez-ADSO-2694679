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
public class CelsiusKelvin {
    
    public void ConcelKel(){
    
    FunctionNumeric celkel = new FunctionNumeric();
    Integer celcius = celkel.InputNumericRangeInt("Quiero convertir Celsius a Kelvin solamente \n en enteros  y en un rango de 10 a 30", 10, 30);
    double resultado = celcius + 273.15;
        System.out.println("El resultado en Farentheit es "+resultado);

    }
    
    
}
