package prueba1;
import java.util.Scanner;

/**
 *
 * @author Cielito
 */
public class Prueba1 {
    
    public static void main(String[] args) {
        
        //Cadena de texto a invertir
        
        String cadena;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cadena: ");
        cadena = entrada.nextLine();
        
        System.out.println("\n");
        
        System.out.println("La cadena de texto sin invertir es: \n"+ cadena);
        char[] arreglo = cadena.toCharArray();
        
        
        System.out.println("La cadena de texto invertida es:");
        //Cadena de texto invertida
        for(int i = cadena.length()-1 ; i>=0;i--){
            System.out.print(arreglo[i]);
            
     
        }
           System.out.println("\n");
    }
    
}
