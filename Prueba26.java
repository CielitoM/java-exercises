/*
Ejercicio 3, realizar la siguiente serie numerica usando las estructuras repetitivas
for, while y do-while
0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/


public class Prueba26{
	public static void main(String args[]){
			int tem1 = 0;
			int temp2 = 1;
			int resultado = 0;

		do{
			resultado = temp1 + temp2;
			System.out.print(resultado + ", ");
			temp1 = temp2;
			temp2 = resultado;

		}while(resultado < 34);
	

	}
}