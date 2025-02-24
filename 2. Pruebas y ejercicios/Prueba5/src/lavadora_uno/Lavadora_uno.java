/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lavadora_uno;

import java.util.Scanner;
import Libreria.Lavadora;

/**
 *
 * @author Cielito
 */
public class Lavadora_uno {
    /**
 *
 * @author Cielito
 */

public class LavadoraMain {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los kilos de ropa: ");
        int kilos = entrada.nextInt();
        
        System.out.println("Ingrese el tipo de ropa: 1 (ropa blanca), 2 (ropa color) ");
        int tipo = entrada.nextInt();
        
        Lavadora lavadora = new Lavadora(kilos, tipo);
        lavadora.CicloFinalizado();
     
    }
}

}
