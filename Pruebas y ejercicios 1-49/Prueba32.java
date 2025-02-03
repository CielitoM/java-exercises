/*
Crear un programa que cree una matriz dinamica.
*/

import java.util.Scanner;
public class Prueba32{
	public static void main(String args[]){
			
			
			int filas = 0, columnas = 0, contador = 1;
			Scanner in = new Scanner(System.in);
			
			System.out.println("¿Cuantas filas desea?");
			filas = in.nextInt();
			System.out.println("¿Cuantas columnas desea?");
			columnas = in.nextInt();			
			
			int numeros [][] = new int [filas][columnas];		

			for(int i = 0; i<filas; i++){
				for(int j=0;j<columnas;j++){
					numeros[i][j] = contador;
					contador++;
					System.out.print("[" + numeros[i][j] + "]");
					
				}
			
				System.out.println("");
			}

	}
}