
package Class;

import Interface.Exercise;
import java.util.Scanner;

public class ExerciseOne implements Exercise {

    private Double numero;
    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }

    public ExerciseOne() {
    }

    @Override

    public Double Capturar() {
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.println(this.getMensaje());
                this.setNumero(Double.parseDouble(scanner.next()));

            } catch (NumberFormatException e) {
                System.out.println("Error: Dato no válido, no se admite caracteres alfanumericos.");
                this.setNumero(Double.parseDouble("0"));
            }

        } while (this.getNumero() == 0);
        
        scanner.close(); // Cerrar el Scanner después de su uso

        //Retornar el valor del atributo
        return this.getNumero();
    }

    @Override
    public String logic() {

        if (this.getNumero() > 5) {
            return "El número es mayor a cinco";
        } else {
            return "El número no es mayor a cinco";
        }
    }

}
