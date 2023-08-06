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
public class KelFahren {
           public void ConcelKel(){
    
    FunctionNumeric celkel = new FunctionNumeric();
    Double Kelvin = celkel.InputNumericRangeScanner("Quiero convertir de Kelvin a Farentheit en un rango de 3.6° a 8.9°", 3.6, 8.9);
    double resultado = (Kelvin - 273.15) * 9/5 + 32;
    System.out.println("El resultado en Celsius es "+resultado);

}
}
