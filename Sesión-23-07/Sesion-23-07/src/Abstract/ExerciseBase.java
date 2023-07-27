/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

import Interface.Exercise;
import java.util.Scanner;

/**
 *
 * @author Desarrollador
 */
public abstract class ExerciseBase implements Exercise {

    private Double numero;
    private String mensaje;

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    private Double resultado;

    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }

    public String getMensaje() {
        return mensaje;
    }
    

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public Double capture() {
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.println(getMensaje());
                setNumero(Double.parseDouble(scanner.next()));
            } catch (NumberFormatException e) {
                System.out.println("Error: Dato no válido, no se admiten caracteres alfanuméricos.");
                setNumero(0.0);
            }

        } while (getNumero() == 0);

        return getNumero();

    }
    @Override
    public abstract Double logic();

    @Override
    public abstract String message();
}
