/*
Ejercicio 2, realizar la siguiente serie numerica usando las estructuras repetitivas
for, while y do-while
1, 99, 2, 98, 3, 97, 4, 96, 5, 95
*/


public class Prueba25{
	public static void main(String args[]){
			int i = 0;

		do{
			i++;
			int j = 100 - i;
			if(i == 5){ System.out.print(i + ", " + j);
			}else{System.out.print(i + ", " + j + ", ");}
			

		}while(i < 5);
	

	}
}