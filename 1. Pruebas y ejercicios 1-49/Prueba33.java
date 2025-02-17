
/*
Libreria swing y creacion de interfaz grafica
*/

import javax.swing.*; //libreria para crear interfaces graficas. Importar elementos para eso.
public class Prueba33 extends JFrame{ //herencia de la clase que nos permite crear la Interfaz grafica.
	private JLabel label1; //crear un elemento llamado label1, es una etiqueta.

		public Prueba33(){ //constructor. Establecer el diseño de la etiqueta dentro del constructor.
	
			setLayout(null); //metodo que nos permite indicar al programa que se van a indicar con coordenadas
			//donde se van a colocar los elementos de la interfaz. Se coloca null para evitar que el metodo
			//los coloque donde quiera.
	
			label1 = new JLabel("Maria Melgarejo"); //Inicializar el objeto.
			label1.setBounds(10,20,200,300); //coordenadas donde se quiere que se coloque.
			//(eje x, eje y, ancho, largo)
			add(label1); //se indica al programa que todo eso se agrega a la etiqueta label1.
		}
			
		public static void main(String args[]){
			
			Prueba33 formulario1 = new Prueba33(); //nuevo objeto del tipo Prueba33.
			formulario1.setBounds(0,0,400,300); //centro de la pantalla.
			formulario1.setVisible(true); //para que se vea la interfaz o se encuentre oculta.
			formulario1.setLocationRelativeTo(null); //al momento de ejecutar, que se centre en la pantalla	

		}

}