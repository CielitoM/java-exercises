/*
Ejercicio 3, realizar la siguiente serie numerica usando las estructuras repetitivas
for, while y do-while
0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/


public class Prueba26{
	public static void main(String args[]){
			int temp1 = 0;
			int temp2 = 1;
			int resultado = 0;

		do{
			if(temp1<34){
				System.out.print(temp1 + ", ");
			}else{
				System.out.print(temp1);
			}
			resultado = temp1 + temp2;
			temp1 = temp2;
			temp2 = resultado;

		}while(temp1 < 35);
	

	}
}