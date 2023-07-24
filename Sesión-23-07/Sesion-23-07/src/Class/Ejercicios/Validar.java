/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Ejercicios;

import Abstract.RunnableAbstact;
import java.util.Scanner;

/**
 *
 * @author Desarrollador
 */
public class Validar extends RunnableAbstact {

    private Double number;
    private String mensaje;


    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    public Double Capturar() {
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.println(this.getMensaje());
                //Moficicar el valor del atributo
                this.setMensaje(scanner.next());
                
                if (this.getNumber()<=0){
                    System.out.println("Dato no válido, solo números positivos.");
                }
            } catch (Exception e) {
                System.out.println("Dato no válido, no se admite caracteres alfanumericos.");
                this.setNumber(Double.parseDouble("0"));
            }

        } while (this.getNumber() <= 0);

        //Retornar el valor del atributo
        return this.getNumber();
    }
    }
