/*
Realizar un programa que simule un inicio de sesion solicitando el nombre de usuario y contraseña, para posteriormente compararlos y mostrar un mensaje en pantalla que diga: inicio de sesion correcto / nombre de usuario o password incorrectos.
*/


import java.util.Scanner;

public class Prueba28{
	public static void main(String args[]){
			String nombre_usuario = "";
			String password = "";
			String new_nombre_usuario = "";
			String new_password = "";

			Scanner in = new Scanner(System.in);
			
			System.out.println("Ingrese el nombre de usuario. ");
			nombre_usuario = in.nextLine();

			System.out.println("Ingrese la contraseña. ");
			password = in.nextLine();

			System.out.println("Se han guardado sus datos. Intente iniciar sesion. ");


			System.out.println("Ingrese el nombre de usuario. ");
			new_nombre_usuario = in.nextLine();

			System.out.println("Ingrese la contraseña. ");
			new_password = in.nextLine();


			if(nombre_usuario.equals(new_nombre_usuario) && password.equals(new_password)){
				System.out.println("Inicio de sesion correcto.");
			}else{
				System.out.println("Usuario o password incorrectos.");
			}
			
			

	}
}