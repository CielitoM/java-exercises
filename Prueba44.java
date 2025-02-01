/*

Interfaces gráficas, boton RGB
*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Prueba44 extends JFrame implements ActionListener{
	private JComboBox combo1, combo2, combo3;
	private JLabel label1, label2, label3;
	private JButton boton1;

	public Prueba44(){
		setLayout(null); //para evitar que la ventana se ponga donde quiera.
		
		label1 = new JLabel("Rojo");
		label1.setBounds(10,10,100,10);
		add(label1);


		combo1 = new JComboBox();
		combo1.setBounds(120,10,50,30);
			for(int i=0; i<=255; i++){
				combo1.addItem(String.valueOf(i));		
			}
		add(combo1);

		label2 = new JLabel("Verde");
		label2.setBounds(10,50,100,10);
		add(label2);


		combo2 = new JComboBox();
		combo2.setBounds(120,50,50,30);
			for(int i=0; i<=255; i++){
				combo2.addItem(String.valueOf(i));		
			}
		add(combo2);

		label3 = new JLabel("Azul");
		label3.setBounds(10,90,100,10);
		add(label3);


		combo3 = new JComboBox();
		combo3.setBounds(120,90,50,30);
			for(int i=0; i<=255; i++){
				combo3.addItem(String.valueOf(i));		
			}
		add(combo3);


		boton1 = new JButton("Fijar Color");
		boton1.setBounds(10,130,100,30);
		add(boton1);
		boton1.addActionListener(this);
	
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			String seleccion1 = combo1.getSelectedItem().toString();
			String seleccion2 = combo2.getSelectedItem().toString();
			String seleccion3 = combo3.getSelectedItem().toString();
		
			int rojo = Integer.parseInt(seleccion1);
			int verde = Integer.parseInt(seleccion2);
			int azul = Integer.parseInt(seleccion3);

			Color color1 = new Color(rojo, verde, azul);
			boton1.setBackground(color1);
		
		}
	}
	
	
	public static void main(String args[]){
		Prueba44 formulario1 = new Prueba44();
		formulario1.setBounds(0,0,190,220);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	
	}
}
