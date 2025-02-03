/*
Realizar un programa que solicite desde teclado una cadena de caracteres, posteriormente el programa debe indicar a traves de un mensaje en pantalla, la cantidad de caracteres que posee dicha cadena. Finalmente el programa debe preguntar al usuario, ¿Que parte de la cadena desea obtener?
*/


import java.util.Scanner;

public class Prueba29{
	public static void main(String args[]){
			String cadena = "";
			int desde = 0, hasta = 0;
			String nueva_cadena = "";

			Scanner in = new Scanner(System.in);
			
			System.out.println("Ingrese una cadena. ");
			cadena = in.nextLine();
	
			int cantidad_caracteres = cadena.length();
			System.out.println("La cadena contiene "+ cantidad_caracteres + " cantidad de caracteres.");

			System.out.println("¿Que parte de la cadena desea obtener?.");
			System.out.println("Desde: ");
			desde = in.nextInt();
			System.out.println("Hasta: ");
			hasta = in.nextInt();
			

			nueva_cadena = cadena.substring(desde, hasta);

			System.out.println("La nueva cadena es: " + nueva_cadena);
			

	}
}