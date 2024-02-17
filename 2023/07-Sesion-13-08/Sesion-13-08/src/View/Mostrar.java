/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Entity.CalcularPrecio.CalculaPrecio;
import Entity.ConversionGrados.ConversionGrados;


/**
 *
 * @author ariel
 */
public class Mostrar {
    public static void main(String[] args) {
        CalculaPrecio cp = new CalculaPrecio();
        cp.CapturarInfo();
        cp.CalcularDescuento();
        cp.Resultado();
    }
}
