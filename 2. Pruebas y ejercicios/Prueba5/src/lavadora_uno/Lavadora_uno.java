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
        //modificado para probar metodos getter y setter
        lavadora.setTipo(2);
        //Consultar el valor
        System.out.println("El tipo de ropa es: " + lavadora.getTipo());
        lavadora.CicloFinalizado();
     
    }
}

}
