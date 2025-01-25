/*
Realizar un programa que contenga un vector cuya longitud sea proporcionado por el usuario, posteriormente, solicitar al usuario los numeros necesarios para llenar todas las posiciones del vector, es decir, si el usuario solicitó un arreglo de 10 posicione, entonces el programa deberá de solicitarle al usuario 10 números, y finalmente se debe imprimir el arreglo en pantalla de la siguiente manera:
*/

import java.util.Scanner;
public class Prueba31{
	public static void main(String args[]){
			
			Scanner in = new Scanner(System.in);
			System.out.println("Ingrese la longitud del vector. ");
			int longitud = in.nextInt();
			int numeros[] = new int[longitud];

			for(int i=0; i<numeros.length; i++){
				System.out.println("Ingrese el valor #"+ (i+1));
				numeros[i] = in.nextInt();
				
				
			}

			for(int i=0; i<numeros.length; i++){
				System.out.print("["+ numeros[i] + "]");
					
			}

	}
}