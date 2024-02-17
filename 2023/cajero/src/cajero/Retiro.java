/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero;

/**
 *
 * @author david
 */
import java.util.Date;


class Retiro {
    private Date fecha; 
    private double monto;

    public Retiro(double monto) {
        this.fecha = new Date(); 
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getMonto() {
        return monto;
    }
}


