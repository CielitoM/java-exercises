/*
Demostrate the lifetime of a variable

*/


public class Prueba16{
	public static void main(String args[]){

		
		int x; 
			
		for(x=0; x<3; x++){
			int y = -1; // y is initialized each time block is entered
			System.out.println("y is: "+ y); //this always prints -1
			y = 100;
			System.out.println("y is now: " + y);
		}

	}
}