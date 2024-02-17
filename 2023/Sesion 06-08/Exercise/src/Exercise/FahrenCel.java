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
public class FahrenCel {
    
    public void ConverCel(){
    
    FunctionNumeric ConverCel = new FunctionNumeric();
    Integer Fahrenheit = ConverCel.InputNumericIntPositive("Quiero convertir Fahrenheit  a Celsius solo con numero entero positivo");
    double resultado = (Fahrenheit - 32)*5/9;
    System.out.println("El resultado en Celsius es "+resultado);

    }
    

}
