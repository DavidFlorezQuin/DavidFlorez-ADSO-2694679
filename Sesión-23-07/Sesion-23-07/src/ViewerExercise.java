
import Class.ExerciseOne;
import java.util.Scanner;

public class ViewerExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija el ejercicio que desea ejecutar (1, 2 o 3):");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                ExerciseOne obj = new ExerciseOne();
                obj.setMensaje("Digite un numero Real");
                obj.Capturar();
                String resultado = obj.logic(); // Almacenar el resultado del método logic()
                System.out.println(resultado); // Imprimir el resultado
                break;

            default:
                System.out.println("Opción inválida. Por favor, elija un número válido (1, 2 o 3).");
        }
    }
}
