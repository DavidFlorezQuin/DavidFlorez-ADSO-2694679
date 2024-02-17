/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity.CalcularPrecio;

import Utils.FunctionNumeric;
import Utils.FunctionString;

/**
 *
 * @author Ambiente 209-2
 */
public class CalculaPrecio {

    private Double promedio;
    private Double total;

    public Double getTotal() {
        return total;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    private Integer unidades;
    private Integer descuento;
    private Double precio;
    private Double curso;
    private Integer materiasReprobadas;
   

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

    public Double getCurso() {
        return curso;
    }

    public void setCurso(Double curso) {
        this.curso = curso;
    }

    public Integer getMateriasReprobadas() {
        return materiasReprobadas;
    }

    public void setMateriasReprobadas(Integer materiasReprobadas) {
        this.materiasReprobadas = materiasReprobadas;
    }

    public void CapturarInfo() {
        FunctionNumeric fn = new FunctionNumeric();
        this.setCurso(fn.InputDoubleNumericRangeScanner("Usted pertenece a: \n 1. Preparatoria \n 2.Profesional ", 1.0, 2.0));
        this.setPromedio(fn.InputDoubleNumericPositiveScanner("Digite su promedio"));
        Integer desapro = fn.InputIntegerNumericPositiveScanner("¿Tiene materia desaprobadas? \n1.Sí \n2.No");
        if (desapro == 2){
        this.setMateriasReprobadas(0);
        }else{
        this.setMateriasReprobadas(fn.InputIntegerNumericPositiveScanner("Ingrese la cantidad de materias desaprobadas"));
        }
    }

    public void CalcularDescuento() {

        //COLEGIO
        if (this.getCurso() == 1.0 )
        {

            if (this.getPromedio() >= 9.5)
            {
                this.setUnidades(55);
                this.setDescuento(25);
            } 
            else if (this.getPromedio() >= 9 && getPromedio() < 9.5)
            {
                this.setUnidades(50);
                this.setDescuento(10);
            } 
            else if (this.getPromedio() > 7 && this.getPromedio() < 9)
            {
                this.setUnidades(50);
                this.setDescuento(0);
            } 
        //MATERIAS PERDIDAS

            else if (this.getPromedio() >= 7)
            {
               if(this.getMateriasReprobadas()<3){
                this.setUnidades(45);
                this.setDescuento(0);
               }else{
                this.setUnidades(40);
                this.setDescuento(0);      
               }
            } 
            
            
        //PROFESIONAL
            else
            {
                if (this.getPromedio() >= 9.5)
                {
                    this.setUnidades(55);
                    this.setDescuento(20);
                } else if (this.getPromedio() >= 9.5 && getPromedio() < 9.5)
                {
                    this.setUnidades(55);
                    this.setDescuento(0);
                }

            }
        }

    }
   public void Resultado(){
       
       if (this.getCurso() == 1){
           this.setPrecio(180.0);
       }else{
           this.setPrecio(300.0);
       }
        if(this.getDescuento()==0){
            
            this.setTotal((this.getPrecio() *this.getUnidades()));
        }else{
       this.setTotal((this.getPrecio() *this.getUnidades())/this.getDescuento());

        }
       FunctionString fs = new FunctionString();
       fs.ShowScanner("Las materias a matricular son"+this.getUnidades()+"\nTiene un descuento de : "+this.getDescuento()+"\nEl total a pagar es :"+this.getTotal());
   }
}
