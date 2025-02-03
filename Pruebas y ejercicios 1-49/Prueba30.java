/*
Crear un vector de cinco posiciones, posteriormente guardar un numero en cada una de las posiciones del vector, y finalmente imprimir en pantalla cada una de las posiciones para verificar que se hayan guardado los numeros de manera correcta.
*/

public class Prueba30{
	public static void main(String args[]){
			int numeros[] = new int[5];

			numeros[0] = 5;
			numeros[1] = 220;
			numeros[2] = 8;
			numeros[3] = 458;
			numeros[4] = 22;
			
			System.out.print("[" + numeros[0] + "]");
			System.out.print("[" + numeros[1] + "]");			
			System.out.print("[" + numeros[2] + "]");
			System.out.print("[" + numeros[3] + "]");
			System.out.print("[" + numeros[4] + "]");

	}
}