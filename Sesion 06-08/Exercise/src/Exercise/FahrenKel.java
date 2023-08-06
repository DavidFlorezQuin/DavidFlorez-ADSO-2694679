/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise;

/**
 *
 * @author Ambiente 209-2
 */
import Utils.FunctionNumeric;
import Utils.FunctionString;

/**
 *
 * @author Ambiente 209-2
 */
public class FahrenKel {
    
    public void ConverKel(){
    
    FunctionNumeric ConverCel = new FunctionNumeric();
    Integer Fahrenheit = ConverCel.InputNumericIntJOptionPane("convertir Farenheit a Kelvin con reales");
    double resultado = (Fahrenheit - 32) * 5/9 + 273.15;
    String mensaje = "El resultado en Celsius es "+resultado;
    
     FunctionString FunctionString = new FunctionString();
     FunctionString.ShowJOptionPane(mensaje);

    
    }
    
}

