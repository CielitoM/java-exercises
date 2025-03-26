package clases;

/**
 *
 * @author Cielito
 */
public class ClasePrincipal {
        public static void main(String[] args){
            int matriz_uno [][] = new int [3][3];
            int matriz_dos [][] = new int [3][3];
            int matriz_resultante [][] = new int [3][3];
            
            //Llenando la primera matriz 
            for (int i = 0; i< matriz_uno.length; i++){
                for (int j = 0; j< matriz_uno.length; j++){
                    matriz_uno[i][j] =(int) (Math.random() * 5);
                }
            }
            
            
            //Llenando la segunda matriz 
            for (int i = 0; i< matriz_dos.length; i++){
                for (int j = 0; j< matriz_dos.length; j++){
                    matriz_dos[i][j] =(int) (Math.random() * 5);
                }
            }
            
            //Suma o resta de matrices
            for (int i = 0; i< matriz_uno.length; i++){
                for (int j = 0; j< matriz_uno.length; j++){
                    matriz_resultante[i][j] = matriz_uno[i][j] + matriz_dos[i][j];
                }
            }
            
            //Imprimiendo las matrices
            for(int i = 0; i < matriz_uno.length; i++){
                
               //Matriz 1
               for (int j = 0; j< matriz_uno.length; j++){
                    System.out.print(" [ " + matriz_uno[i][j] + " ] ");
               }
               
               if (i == 1){
                    System.out.print("   +   ");
               }else{
                    System.out.print("       ");
               }
               
               //Matriz dos
               for (int j = 0; j< matriz_dos.length; j++){
                    System.out.print(" [ " + matriz_dos[i][j] + " ] ");
               }
               
               if (i == 1){
                    System.out.print("   =   ");
               }else{
                    System.out.print("       ");
               }
               
                //Matriz resultante
               for (int j = 0; j< matriz_resultante.length; j++){
                    System.out.print(" [ " + matriz_resultante[i][j] + " ] ");
               }
               
               
               System.out.println(" ");
        }       
    }
 }
    

