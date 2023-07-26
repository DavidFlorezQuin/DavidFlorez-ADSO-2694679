
import Class.ExerciseFour;
import Class.ExerciseOne;
import Class.ExerciseThree;
import Class.ExerciseTwo;
import java.util.Scanner;

public class View {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elija el ejercicio que desea ejecutar (1, 2 o 3):");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                ExerciseOne obj = new ExerciseOne();
                obj.setMensaje("Digite un numero Real");
                obj.capture();
                obj.logic();
                System.out.println(obj.message()); // Imprimir el resultado
                break;
            case 2:
                ExerciseTwo obj1 = new ExerciseTwo();
                obj1.setMensaje("Digite un numero Real");
                obj1.capture();
                obj1.logic();
                System.out.println(obj1.message()); // Imprimir el resultado
                break;
            case 3:
                ExerciseThree obj2 = new ExerciseThree();
                obj2.setMensaje("Digite un numero Real");
                obj2.capture();
                obj2.logic();
                System.out.println(obj2.message());
                break;
            case 4:
                ExerciseFour obj3 = new ExerciseFour();
                obj3.setMensaje("Digite un numero Real");
                obj3.capture();
                obj3.logic();
                System.out.println(obj3.message());
                break;

                
            default:
                System.out.println("Opción inválida. Por favor, elija un número válido (1, 2 o 3).");
        }
    }
}
