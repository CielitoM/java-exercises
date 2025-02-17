/*

Botón para Aceptar términos y condiciones (JButton - JCheckBox)
*/

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Prueba48 extends JFrame implements ItemListener, ActionListener{
	private JCheckBox check1;
	private JLabel label1;
	private JButton boton1;

	public Prueba48(){
		setLayout(null); //para evitar que la ventana se ponga donde quiera.

		label1 = new JLabel("Aceptar terminos y condiciones");
		label1.setBounds(10,10,400,30);
		add(label1);

		check1 = new JCheckBox("Acepto");
		check1.setBounds(10,50,100,30);
		check1.addChangeListener(this);
		add(check1);

		boton1 = new JButton("Continuar");
		boton1.setBounds(10,100,100,30);
		add(boton1);
		boton1.addActionListener(this);
		boton1.setEnabled(false);

		

	
	}

	public void stateChanged(ChangeEvent e){
		String cadena = "";

		if(check1.isSelected() == true){
			boton1.setEnabled(true);
		}else{
			boton1.setEnabled(false);
		}

	}


	public void actionPerformed(ActionEvent e){

		if(e.getSource() == boton1){
			System.exit(0);
		}

	}

	
	
	public static void main(String args[]){
		Prueba48 formulario1 = new Prueba48();
		formulario1.setBounds(0,0,350,200);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	
	}
}
