package clases;
import java.util.Scanner;

/**
 *
 * @author Cielito
 */
public class ConConstructor {
    
    public ConConstructor(){
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        
        System.out.println("¿Cual es tu nombre?");
        nombre = entrada.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
}
