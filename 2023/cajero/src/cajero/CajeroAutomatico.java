package cajero;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;

public class CajeroAutomatico {
    private Map<String, Cliente> clientes;

    public CajeroAutomatico() {
        this.clientes = new HashMap<>();
    }

    public void registrarCliente(String nombre, String tipoCuenta, String banco, double saldoInicial) {
        Cliente nuevoCliente = new Cliente(nombre, tipoCuenta, banco, saldoInicial);
        clientes.put(nombre, nuevoCliente);
        System.out.println("Cliente registrado exitosamente.");
    }

    public void realizarRetiro(String nombreCliente, double monto) {
        Cliente cliente = clientes.get(nombreCliente);
        if (cliente != null) {
            cliente.hacerRetiro(monto);
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    public void mostrarClientes() {
        System.out.println("\nClientes registrados:");
        for (Cliente cliente : clientes.values()) {
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Tipo de cuenta: " + cliente.getTipoCuenta());
            System.out.println("Banco: " + cliente.getBanco());
            System.out.println("Saldo: " + cliente.getSaldo());
            System.out.println("--------------");
        }
    }

    public void mostrarHistorialRetiros(String nombreCliente) {
        Cliente cliente = clientes.get(nombreCliente);
        if (cliente != null) {
            List<Retiro> historialRetiros = cliente.getHistorialRetiros();
            System.out.println("\nHistorial de retiros para " + nombreCliente + ":");
            for (Retiro retiro : historialRetiros) {
                System.out.println("Fecha: " + retiro.getFecha() + " | Monto: " + retiro.getMonto());
            }
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    public static void main(String[] args) {
        CajeroAutomatico cajero = new CajeroAutomatico();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al cajero automático");

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Registrar nuevo cliente");
            System.out.println("2. Realizar retiro");
            System.out.println("3. Mostrar clientes");
            System.out.println("4. Mostrar historial de retiros");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();

            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Tipo de cuenta (crédito/débito): ");
                    String tipoCuenta = scanner.nextLine();
                    System.out.print("Banco: ");
                    String banco = scanner.nextLine();
                    System.out.print("Saldo inicial: ");
                    double saldoInicial = scanner.nextDouble();
                    cajero.registrarCliente(nombre, tipoCuenta, banco, saldoInicial);
                    break;
                case 2:
                    System.out.print("Nombre del cliente: ");
                    String nombreClienteRetiro = scanner.nextLine();
                    System.out.print("Monto a retirar: ");
                    double monto = scanner.nextDouble();
                    cajero.realizarRetiro(nombreClienteRetiro, monto);
                    break;
                case 3:
                    cajero.mostrarClientes();
                    break;
                case 4:
                    System.out.print("Nombre del cliente: ");
                    String nombreClienteHistorial = scanner.nextLine();
                    cajero.mostrarHistorialRetiros(nombreClienteHistorial);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
