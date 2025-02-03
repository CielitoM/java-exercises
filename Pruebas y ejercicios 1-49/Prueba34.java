
/*
Libreria swing y creacion de interfaz grafica
*/

import javax.swing.*; 

public class Prueba34 extends JFrame{ 
	
	public Prueba34(){
		setLayout(null);
		
	}	

	public static void main(String args[]){
		Prueba34 formulario1 = new Prueba34();
		formulario1.setBounds(0,0,400,550);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null); //siempre aparezca en el centro
		formulario1.setResizable(false); //restringir la modificacion del tamaño de la pantalla.
		
	}


}