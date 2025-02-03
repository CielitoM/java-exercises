/*

Aplicacion de sistema vacacional
*/

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class SistemaVacacionalApp extends JFrame implements ChangeListener{

	//Elementos de la interfaz de bienvenida
	private JRadioButton radio1, radio2, radio3;
	private ButtonGroup bg;

	public SistemaVacacionalApp(){
		setLayout(null); //para evitar que la ventana se ponga donde quiera.

		//Establecer el icono de la ventana
		ImageIcon icono = new ImageIcon("bankIcon1.png");
		setIconImage(icono.getImage());

		bg = new ButtonGroup();

		radio1 = new JRadioButton("640*480");
		radio1.setBounds(10,20,100,30);
		radio1.addChangeListener(this);
		add(radio1);
		bg.add(radio1);

		radio2 = new JRadioButton("800*600");
		radio2.setBounds(10,70,100,30);
		radio2.addChangeListener(this);
		add(radio2);
		bg.add(radio2);

		radio3 = new JRadioButton("1024*768");
		radio3.setBounds(10,120,100,30);
		radio3.addChangeListener(this);
		add(radio3);
		bg.add(radio3);


	}

	public void stateChanged(ChangeEvent e){

		if(radio1.isSelected()){
			setSize(640,480);
		}
		if(radio2.isSelected()){
			setSize(800,600);
		}
		if(radio3.isSelected()){
			setSize(1024,768);
		}

	}
	
	
	public static void main(String args[]){
		SistemaVacacionalApp formulario1 = new SistemaVacacionalApp();
		formulario1.setBounds(0,0,350,230);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
	
	}
}