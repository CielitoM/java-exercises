/*

Aplicacion de sistema vacacional. Ventana de bienvenida
*/

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Bienvenida extends JFrame implements ActionListener{

	//Elementos de la interfaz de bienvenida
	private JLabel label1, label2, label3;
	private JLabel imagenInicioSesion;
	private ImageIcon image1;
	private JTextField textField1;
	private JButton boton1;
	public static String texto = "";


	public Bienvenida(){
		setLayout(null); //para evitar que la ventana se ponga donde quiera.
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//Establecer el icono de la ventana
		ImageIcon icono = new ImageIcon("bankIcon1.png");
		setIconImage(icono.getImage());

		//Establecer el label de la ventana
		label1 = new JLabel("Bienvenido al Sistema Vacacional de SunBank");
		label1.setBounds(60,160,400,100); //(eje x, eje y, ancho, largo)
		label1.setForeground(Color.WHITE);
		add(label1);

		//Establecer la imagen de inicio de sesion
		image1 = new ImageIcon(getClass().getResource("logoiniciosesion.jpg"));
		imagenInicioSesion = new JLabel(image1);
		imagenInicioSesion.setBounds(45,30,300,150);
		add(imagenInicioSesion);

		//Establecer el color de fondo
		Color color1 = new Color(0, 43, 80);
		getContentPane().setBackground(color1);

		//textfield y label para introducir el nombre
		label2 = new JLabel("Introduzca su nombre:");
		label2.setBounds(60,200,400,100);
		label2.setForeground(Color.WHITE);
		add(label2);

		textField1 = new JTextField();
		textField1.setBounds(60,260,270,20);
		textField1.setBackground(Color.WHITE);
		textField1.setForeground(new Color(0, 43, 80));
		add(textField1);
		
		

		//Boton para pasar a la siguiente interfaz
		boton1 = new JButton("Ingresar");
		boton1.setBounds(140,300,100,30);
		add(boton1);
		boton1.addActionListener(this);
		boton1.setEnabled(false);

		//Establecer el trigger para que se active el boton con el user input
		textField1.addKeyListener((new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e){
				JTextField textField = (JTextField) e.getSource();
				String text = textField.getText();
				if(!textField.getText().isEmpty())
					boton1.setEnabled(true);
				
				else
	
					boton1.setEnabled(false);	
				}
	
		}));

		//Establecer el titulo
		setTitle("Iniciar sesion");

		//Establecer el label del pie de la pagina
		label3 = new JLabel("©2002 The SunBank International Company.");
		label3.setBounds(60,390,400,100); //(eje x, eje y, ancho, largo)
		label3.setForeground(Color.WHITE);		
		add(label3);
		


	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			texto = textField1.getText().trim();
			
				Licencia formulario1 = new Licencia();
				formulario1.setBounds(0,0,750,500);
				formulario1.setVisible(true);
				formulario1.setResizable(false);
				formulario1.setLocationRelativeTo(null);
				this.setVisible(false);
		}
	}



	
	public static void main(String args[]){
		Bienvenida formulario1 = new Bienvenida();
		formulario1.setBounds(0,0,400,500);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	
	}
}