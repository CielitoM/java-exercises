
/*
Libreria swing y creacion de interfaz grafica, JButton
*/

import javax.swing.*;	//libreria que nos permite crear la interfaz grafica
import java.awt.event.*;//funcionalidades de los componentes.

public class Prueba35 extends JFrame implements ActionListener{ //extends: herencia, implements: debe estar atento a la escucha que se ejecute un evento.
	JButton boton1;

	public Prueba35(){
		setLayout(null); //Establecer metodo para que la ventana no se coloque donde quiera.

		//1. PROGRAMAR EL DISEÑO DEL BOTON
		boton1 = new JButton("Cerrar"); //Crear boton cerrar
		boton1.setBounds(300,250,100,30);	
		add(boton1);
		boton1.addActionListener(this); //el boton tendra una funcionalidad.
		
	}	
	
		//2. PROGRAMAR LA ACCION DEL BOTON. (EL EVENTO)
	public void actionPerformed(ActionEvent e){ //2. evento
		if(e.getSource() == boton1){
			System.exit(0);
		}
		
		
	}

	public static void main(String args[]){
		Prueba35 formulario1 = new Prueba35();
		formulario1.setBounds(0,0,450,350);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
		
	}


}