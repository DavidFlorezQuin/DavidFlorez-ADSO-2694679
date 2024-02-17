package cajero;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nombre;
    private String tipoCuenta;
    private String banco;
    private double saldo;
    private List<Retiro> historialRetiros;

    public Cliente(String nombre, String tipoCuenta, String banco, double saldoInicial) {
        this.nombre = nombre;
        this.tipoCuenta = tipoCuenta;
        this.banco = banco;
        this.saldo = saldoInicial;
        this.historialRetiros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public String getBanco() {
        return banco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void hacerRetiro(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            historialRetiros.add(new Retiro(monto));
            System.out.println("Retiro exitoso: " + monto + " realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public List<Retiro> getHistorialRetiros() {
        return historialRetiros;
    }
}
