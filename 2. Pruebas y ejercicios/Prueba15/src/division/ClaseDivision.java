package division;

import java.util.Scanner;

/**
 *
 * @author Cielito
 */
public class ClaseDivision {
    public static void main(String[] args){

        try{
            int valor1, valor2, resultado;
            Scanner entrada = new Scanner(System.in);
        
            //codigo que queremos que se ejecute de manera inicial
            
            System.out.print("Dame el primer valor: ");
            valor1 = entrada.nextInt();
        
            System.out.print("Dame el segundo valor: ");
            valor2 = entrada.nextInt();
        
        
            resultado = valor1/valor2;
        
            System.out.println("Division es igual a: " + resultado);
        } catch(Exception e){
            //Comportamiento del programa
            System.out.println("Error!!. " + e);
        } finally {
            System.out.println("Operacion concluida.");
        }
    
    }
    
}
