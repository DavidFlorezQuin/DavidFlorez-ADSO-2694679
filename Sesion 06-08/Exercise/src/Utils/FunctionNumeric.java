/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author Ambiente 209-2
 */
public class FunctionNumeric {

    public Double numero;
    public Integer intnumero;

    public Integer getIntnumero() {
        return intnumero;
    }

    public void setIntnumero(Integer intnumero) {
        this.intnumero = intnumero;
    }

    private Double getNumero() {
        return numero;
    }

    private void setNumero(Double numero) {
        this.numero = numero;
    }

    /*REALES*/

    public Double InputNumericScanner(String mensaje) {
        InputNumeric(mensaje, 1);
        return this.getNumero();
    }

    public Double InputNumericJOptionPane(String mensaje) {
        InputNumeric(mensaje, 2);
        return this.getNumero();
    }
    
    
    /*VALIDAR NUMERO*/
    
    private void InputNumeric(String mensaje, int tipo) {
        Boolean validar = false;
        FunctionString fs = new FunctionString();

        //Validar que se ingrese el dato correcto
        while (validar == false) {
            try {
                if(tipo==1){
                    this.setNumero(Double.parseDouble(fs.InputScanner(mensaje)));
                }else{
                    this.setNumero(Double.parseDouble(fs.InputJOptionPane(mensaje)));
                }
                validar = true;
            } catch (Exception e) {
                if (tipo==1) {
                    fs.ShowScanner("Ha ingresado un dato no válido. ");
                }else{
                    fs.ShowJOptionPane("Ha ingresado un dato no válido. ");
                }
            }
        }        
    }
    
    
    /*REALES RANGO*/

    
    public Double InputNumericRangeScanner(String mensaje, Double min, Double max) {
        do {            
            InputNumeric(mensaje,1);
        } while (this.getNumero() < min || this.getNumero() > max);
        
        return this.getNumero();
    }
    
    /*REALES POSITIVOS*/

    public Double InputNumericPositive(String mensaje){
        
        do{
            InputNumericScanner(mensaje);
        } while(this.getNumero()< 0);
        
        return this.getNumero();
    }
    
    /*REALES NEGATIVOS*/

    public Double InputNumericNegative(String mensaje){
        
        do{
            InputNumericScanner(mensaje);
        } while(this.getNumero()> 0);
        
        return this.getNumero();
    }
    
    
    /*ENTEROS VALIDAR*/

    private void InputNumericInt(String mensaje, int tipo) {
        Boolean validar = false;
        FunctionString fs = new FunctionString();

        //Validar que se ingrese el dato correcto
        while (validar == false) {
            try {
                if(tipo==1){
                    this.setIntnumero(Integer.parseInt(fs.InputScanner(mensaje)));
                }else{
                    this.setIntnumero(Integer.parseInt(fs.InputJOptionPane(mensaje)));
                }
                validar = true;
            } catch (Exception e) {
                if (tipo==1) {
                    fs.ShowScanner("Ha ingresado un dato no válido. ");
                }else{
                    fs.ShowJOptionPane("Ha ingresado un dato no válido. ");
                }
            }
        }        
    }
        /*ENTEROS*/
    
        public Integer InputNumericIntScanner(String mensaje) {
        InputNumericInt(mensaje, 1);
        return this.getIntnumero();
    }

    public Integer InputNumericIntJOptionPane(String mensaje) {
        InputNumericInt(mensaje, 2);
        return this.getIntnumero();
    }

    /*ENTEROS RANGO*/
        public Integer InputNumericRangeInt(String mensaje, int min, int max) {
        do {            
            InputNumericInt(mensaje,1);
        } while (this.getIntnumero() < min || this.getIntnumero() > max);
        
        return this.getIntnumero();
    }
    
    /*ENTEROS POSITIVOS*/
            
    public Integer InputNumericIntNegative(String mensaje){
        
        do{
            InputNumericInt(mensaje, 1);
        } while(this.getIntnumero()> 0);
        
        return this.getIntnumero();
    }
    
    /*ENTEROS NEGATIVOS*/
    public Integer InputNumericIntPositive(String mensaje){
        
        do{
            InputNumericInt(mensaje, 1);
        } while(this.getIntnumero()< 0);
        
        return this.getIntnumero();
    }
}