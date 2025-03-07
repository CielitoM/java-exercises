/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import java.util.Scanner;

/**
 *
 * @author Cielito
 */
public abstract class Operaciones {
    protected int valor1, valor2, resultado, seleccion;
    Scanner entrada = new Scanner(System.in);
    
    public void seleccionar_Opcion(){
        System.out.println("Por favor, seleccione una opción: ");
        System.out.println("1. Consulta saldo.");
        System.out.println("2. Retir de efectivo.");
        System.out.println("3. Deposito de efectivo.");
        System.out.println("4. Salir.");
        seleccion = entrada.nextInt();
    }
    
    public abstract void consultar_Saldo();
    
    public abstract void retirar_Efectivo();
    
    public abstract void deposito_Efectivo();
    
    public void resultado(){
    
    }
    
}
