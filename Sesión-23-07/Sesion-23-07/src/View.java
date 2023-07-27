
import Class.ExerciseEight;
import Class.ExerciseFive;
import Class.ExerciseFour;
import Class.ExerciseNine;
import Class.ExerciseOne;
import Class.ExerciseSeven;
import Class.ExerciseSix;
import Class.ExerciseTen;
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
            case 5:
                ExerciseFive obj4 = new ExerciseFive();
                obj4.setMensaje("Digite un numero Real");
                obj4.capture();
                obj4.logic();
                System.out.println(obj4.message());
                break;
            case 6:
                ExerciseSix obj5 = new ExerciseSix();
                obj5.setMensaje("Digite un numero Real");
                obj5.capture();
                obj5.logic();
                System.out.println(obj5.message());
                break;
            case 7:
                ExerciseSeven obj6 = new ExerciseSeven();
                obj6.setMensaje("Digite un numero Real");
                obj6.capture();
                obj6.logic();
                System.out.println(obj6.message());
                break;
            case 8:
                ExerciseEight obj7 = new ExerciseEight();
                obj7.setMensaje("Digite un numero Real");
                obj7.capture();
                obj7.logic();
                System.out.println(obj7.message());
                break;
            case 9:
                ExerciseNine obj8 = new ExerciseNine();
                obj8.setMensaje("Digite un numero Real");
                obj8.capture();
                obj8.logic();
                System.out.println(obj8.message());
                break;
            case 10:
                ExerciseTen obj9 = new ExerciseTen();
                obj9.setMensaje("Digite un numero Real");
                obj9.capture();
                obj9.capture();
                obj9.logic();
                System.out.println(obj9.message());
                break;

                
            default:
                System.out.println("Opción inválida. Por favor, elija un número válido (1, 2 o 3).");
        }
    }
}
