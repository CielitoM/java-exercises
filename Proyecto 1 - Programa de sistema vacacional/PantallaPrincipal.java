/*

Aplicacion de sistema vacacional. Ventana de bienvenida
*/

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class PantallaPrincipal extends JFrame implements ActionListener, ItemListener{

	//Elementos de la interfaz de la pantalla principal
	private JLabel label1, label2, label3, label4, label5, label6;
	private JLabel imagenInicioSesion;
	private ImageIcon image1;
	private JTextField textField1, textField2;
	private JButton boton1;
	private JComboBox combo1, combo2;


	public PantallaPrincipal(){
		setLayout(null); //para evitar que la ventana se ponga donde quiera.

		//Establecer el titulo
		setTitle("Sistema Vacacional");

		//Establecer el icono de la ventana
		ImageIcon icono = new ImageIcon("bankIcon1.png");
		setIconImage(icono.getImage());

		//Establecer el label de la ventana
		String usuario = new String();
		label1 = new JLabel("Bienvenido, "+ usuario);
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
		label2 = new JLabel("Introduzca el nombre: ");
		label2.setBounds(60,200,400,100);
		label2.setForeground(Color.WHITE);
		add(label2);

		textField1 = new JTextField();
		textField1.setBounds(60,260,270,20);
		textField1.setBackground(Color.WHITE);
		textField1.setForeground(new Color(0, 43, 80));
		add(textField1);



		//textfield y label para introducir el apellido
		label4 = new JLabel("Introducir el apellido: ");
		label4.setBounds(60,265,400,100);
		label4.setForeground(Color.WHITE);
		add(label4);

		textField2 = new JTextField();
		textField2.setBounds(60,325,270,20);
		textField2.setBackground(Color.WHITE);
		textField2.setForeground(new Color(0, 43, 80));
		add(textField2);
		

		//Establecer el label del pie de la pagina
		label3 = new JLabel("©2002 The SunBank International Company.");
		label3.setBounds(60,390,400,100); //(eje x, eje y, ancho, largo)
		label3.setForeground(Color.WHITE);		
		add(label3);
		
	
		//Boton para calcular la cantidad de vacaciones
		boton1 = new JButton("Calcular");
		boton1.setBounds(140,370,100,30);
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


		//Label indicador de seleccionar la cantidad de años de servicios

		label6 = new JLabel("Seleccionar los años de servicios: ");
		label6.setBounds(350,200,400,100);
		label6.setForeground(Color.WHITE);
		add(label6);


		//Agregar el ComboBox para seleccionar la cantidad de años de servicio
		
		combo1 = new JComboBox();
		combo1.setBounds(350,260,160,20);
		add(combo1);

		combo1.addItem("1 año de servicio");
		combo1.addItem("2 a 6 años de servicio");
		combo1.addItem("A partir de 7 años de servicio");
		combo1.addItemListener(this);



		//Label indicador de seleccionar departamento

		label5 = new JLabel("Seleccionar el departamento: ");
		label5.setBounds(350,265,400,100);
		label5.setForeground(Color.WHITE);
		add(label5);


		//Agregar el ComboBox para seleccionar el departamento

		combo2 = new JComboBox();
		combo2.setBounds(350,325,160,20);
		add(combo2);
		
		combo2.addItem("Atención al cliente");
		combo2.addItem("Logística");
		combo2.addItem("Gerentes");
		combo2.addItemListener(this);

	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){

			String usuario = textField1.getText();
			System.out.println("Se ha iniciado sesion correctamente: " + usuario);
		}
	}

	public void itemStateChanged(ItemEvent e){
		if(e.getSource() == combo1){
		String seleccion = combo1.getSelectedItem().toString();
		//System.out.println("Se ha seleccionado: " + seleccion);
		}
		if(e.getSource() == combo2){
		String seleccion = combo2.getSelectedItem().toString();
		//System.out.println("Se ha seleccionado: " + seleccion);
		
		}
	}



	
	public static void main(String args[]){
		PantallaPrincipal formulario1 = new PantallaPrincipal();
		formulario1.setBounds(0,0,900,700);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	
	}
}