
package suma;
import java.util.Scanner;

/**
 *
 * @author Cielito
 */
public class SumaMain {
    public static void main(String args[]){
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dame el primer valor: ");
        int valorUno = entrada.nextInt();
    
            
        System.out.println("Dame el segundo: ");
        int valorDos = entrada.nextInt();
        
        Suma valores = new Suma(valorUno, valorDos);
        valores.Imprimir();
    }
}
