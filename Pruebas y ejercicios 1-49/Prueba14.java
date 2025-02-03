/*
Demostrate dynamic initialization

*/

import java.util.Scanner;

public class Prueba14{
	public static void main(String args[]){

		
		double a = 3.0, b = 4.0;

		//c is dinamically initialized.
		
		double c = Math.sqrt(a*a + b*b);
		
		System.out.println("Hypotenuse is " + c);
	}
}