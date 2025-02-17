import java.util.Scanner;

public class Prueba6{
	public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		String nombre = "";
		int num_uno = 0;
		int num_dos = 0;
		int resultado = 0;
		
		System.out.println("Ingrese su nombre ");
		nombre = in.nextLine();
			
		System.out.println("Ingrese el primer valor ");
		num_uno = in.nextInt();

		System.out.println("Ingrese el segundo valor ");
		num_dos = in.nextInt();


		resultado = num_uno + num_dos;

		System.out.println("Nombre: " + nombre + " el resultado de la suma es: " + resultado);
			
	}
}