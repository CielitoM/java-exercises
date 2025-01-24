/*
Mini-simulador con if-else

*/

import java.util.Scanner;

public class Prueba19{
	public static void main(String args[]){

		//Parte de entrada de datos
		Scanner in = new Scanner(System.in);
		String nombre = "";
		int clave;
		int antiguedad;

		System.out.println("Bienvenido al sistema vacacional de Coca Cola Company.");
		System.out.println("¿Cuál es el nombre del trabajador?");
		nombre = in.nextLine();

		System.out.println("¿Cuántos años de servicio tiene el trabajador?");
		antiguedad = in.nextInt();

		System.out.println("¿Cuál es la clave de su departamento?");
		clave = in.nextInt();

		//Parte de gestion de datos
		if(clave == 1){
			if(antiguedad == 1){
				System.out.println(nombre + " tiene derecho a 6 dias.");
			
			}else if(antiguedad >=2 && antiguedad <=6){
				System.out.println(nombre + " tiene derecho a 14 dias.");
			
			}else if(antiguedad >= 7){
				System.out.println(nombre + " tiene derecho a 20 dias.");
				
			}else{
				System.out.println("Aun no tiene derecho a vacaciones.");
				
			}
		}
	

		if(clave == 2){
			if(antiguedad == 1){
				System.out.println(nombre + " tiene derecho a 7 dias.");
			
			}else if(antiguedad >=2 && antiguedad <=6){
				System.out.println(nombre + " tiene derecho a 15 dias.");
			
			}else if(antiguedad >= 7){
				System.out.println(nombre + " tiene derecho a 22 dias.");
				
			}else{
				System.out.println("Aun no tiene derecho a vacaciones.");
				
			}
	
		
		}


		if(clave == 3){
			if(antiguedad == 1){
				System.out.println(nombre + " tiene derecho a 10 dias.");
			
			}else if(antiguedad >=2 && antiguedad <=6){
				System.out.println(nombre + " tiene derecho a 20 dias.");
			
			}else if(antiguedad >= 7){
				System.out.println(nombre + " tiene derecho a 30 dias.");
				
			}else{
				System.out.println("Aun no tiene derecho a vacaciones.");
				
			}

		}
	}
}