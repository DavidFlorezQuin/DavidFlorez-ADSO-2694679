
package Class;

import Abstract.ExerciseBase;
import java.util.Scanner;

public class ExerciseOne extends ExerciseBase {

    @Override
    public Double logic() {

        if (this.getNumero() > 5) {
            return 1.0;
        } else 
            return 0.0;
        }

    @Override
    public String message() {
        Double resultado = logic();
        
        if(resultado == 1.0){
            return "El numero es mayor a cinco";
        }else{
            return "El numero es menor a cinco";
        }
    }
    }

