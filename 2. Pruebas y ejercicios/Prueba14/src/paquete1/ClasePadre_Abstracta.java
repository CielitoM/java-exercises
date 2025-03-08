package paquete1;

import java.util.Scanner;

/**
 *
 * @author Cielito
 */
public class ClasePadre_Abstracta {
     protected int transacciones, retiro, deposito;
     private static int saldo;
     Scanner entrada = new Scanner(System.in);
     
     public void Operaciones(){
         int bandera = 0;
         int seleccion = 0;
     }
    
        public void seleccionar_Opcion(){
        System.out.println("Por favor, seleccione una opción: ");
        System.out.println("1. Consulta saldo.");
        System.out.println("2. Retir de efectivo.");
        System.out.println("3. Deposito de efectivo.");
        System.out.println("4. Salir.");
        seleccion = entrada.nextInt();
    }
    
    
    
}
