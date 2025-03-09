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
         do{
            do{
               System.out.println("Por favor, seleccione una opción: ");
               System.out.println("    1. Consulta saldo.");
               System.out.println("    2. Retir de efectivo.");
               System.out.println("    3. Deposito de efectivo.");
               System.out.println("    4. Salir.");
               seleccion = entrada.nextInt();

               if(seleccion >= 1 && seleccion <=4){
                   bandera = 1;   
               }else{
                   System.out.println("-------------------------------------------------");
                   System.out.println("Opcion no disponible, vuelva a intentar por favor");
                   System.out.println("-------------------------------------------------");
                   }  
               }while(bandera == 0);
            
         if(seleccion == 1){
         
         }else if(seleccion == 2){
         
         }else if(seleccion == 3){
         
         }else if(seleccion == 4){
             System.out.println("-----------------------");
             System.out.println("Gracias, vuelva pronto!");
             System.out.println("-----------------------");
         } 
           
         }while(bandera !=2);
     }
}
