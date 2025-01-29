
/*
Libreria swing y creacion de interfaz grafica, swing, Jlabel.
*/

import javax.swing.*;

public class Prueba38 extends JFrame{ 

	private JLabel label1;
	private JLabel label2;

	public 	Prueba38(){
		setLayout(null); //metodo que indica las coordenadas de la interfaz. Null para evitar que las coloque donde quiera.
		
		label1 = new JLabel("Interfaz grafica."); //1. Nuevo JLabel
		label1.setBounds(10,20,300,30);		  //2. Establecer coordenadas
		add(label1);			  	  //3. Agregar al contenedor de la ventana.
		label2 = new JLabel("Version 1.0");
		label2.setBounds(10,100,100,30);
		add(label2);
	}


	public static void main(String args[]){
		Prueba38 formulario1 = new Prueba38();
		formulario1.setBounds(0,0,300,200);
		formulario1.setResizable(false);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);
	
	
	}

}