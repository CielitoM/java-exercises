/**
 *
 * @author Cielito
 */

import java.util.Scanner;

public class LavadoraMain {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los kilos de ropa: ");
        int kilos = entrada.nextInt();
        
        System.out.println("Ingrese el tipo de ropa: ");
        int tipo = entrada.nextInt();
        
        Lavadora lavadora = new Lavadora(kilos, tipo);
     
    }
}
