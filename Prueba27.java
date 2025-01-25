/*
Realizar un programa que compare dos nombres para verificar que son iguales, mostrando un mensaje en pantalla al final que diga: los nombres son iguales/los nombres son diferentes. Nota: los nombres deben introducirlos el usuario desde teclado.
*/


import java.util.Scanner;

public class Prueba27{
	public static void main(String args[]){
			String nombre_uno = "";
			String nombre_dos = "";

			Scanner in = new Scanner(System.in);
			
			System.out.println("Ingrese el primer nombre. ");
			nombre_uno = in.nextLine();

			System.out.println("Ingrese el segundo nombre. ");
			nombre_dos = in.nextLine();

			if(nombre_uno.equals(nombre_dos)){
				System.out.println("Los nombres son iguales");
			}else{
				System.out.println("Los nombres son diferentes");
			}
			
			

	}
}