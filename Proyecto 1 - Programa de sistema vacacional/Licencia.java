/*

Aplicacion de sistema vacacional. Ventana de licencia
*/

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

	//Elementos de la interfaz de bienvenida
	private JLabel label1;
	private JLabel imagenInicioSesion;
	private ImageIcon image1;
	private JButton boton1, boton2;
	private JTextArea textArea1;
	private JScrollPane scrollpane1;
	private JCheckBox check1;
	String nombre = "";


	public Licencia(){
		setLayout(null); //para evitar que la ventana se ponga donde quiera.
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//Establecer el icono de la ventana
		ImageIcon icono = new ImageIcon("bankIcon1.png");
		setIconImage(icono.getImage());

		//Recuperar el nombre de usuario de la clase bienvenida
		Bienvenida ventanaBienvenida = new Bienvenida();
		nombre = ventanaBienvenida.texto;
		

		//Establecer el label de la ventana
		label1 = new JLabel("TÉRMINOS Y CONDICIONES");
		label1.setBounds(290,5,400,100); //(eje x, eje y, ancho, largo)
		label1.setForeground(Color.BLACK);
		add(label1);

		//Establecer la imagen al pie de la pagina
		image1 = new ImageIcon(getClass().getResource("logoiniciosesion.jpg"));
		imagenInicioSesion = new JLabel(image1);
		imagenInicioSesion.setBounds(380,290,300,150);
		add(imagenInicioSesion);

		

		//Boton para Aceptar terminos y condiciones
		boton1 = new JButton("Continuar");
		boton1.setBounds(30,370,100,30);
		add(boton1);
		boton1.addActionListener(this);
		boton1.setEnabled(false);

		//Boton para NO aceptar terminos y condiciones
		boton2 = new JButton("No acepto");
		boton2.setBounds(140,370,100,30);
		add(boton2);
		boton2.setEnabled(true);
		boton2.addActionListener(this);

		//Establecer el area de terms and conditions
		textArea1 = new JTextArea();
		textArea1.setFont(new Font("Andale Mono",0,9));
		textArea1.setText("Términos y Condiciones de Uso del Software de Sistema Vacacional de Java Bank (Versión de Prueba)\n\n" +
    		"1. Aceptación de los Términos\n" +
    		"Al acceder y utilizar el software de sistema vacacional de Java Bank en su versión de prueba " +
    		"(en adelante, \"el Software\"), usted acepta cumplir con estos términos y condiciones. Si no está " +
    		"de acuerdo con alguno de los términos, no debe utilizar el Software.\n\n" +
    
    		"2. Uso Autorizado\n" +
    		"El Software se proporciona exclusivamente para pruebas y evaluación interna dentro de Java Bank. " +
    		"Queda estrictamente prohibido su uso con fines comerciales, lucrativos o cualquier otra finalidad " +
    		"ajena a las pruebas.\n\n" +

    		"3. Licencia de Uso\n" +
    		"Java Bank concede una licencia temporal, no exclusiva, intransferible y revocable para el uso del Software " +
    		"en un entorno de prueba. Esta licencia no otorga ningún derecho sobre el código fuente, modificaciones " +
    		"o distribución del Software.\n\n" +

    		"4. Restricciones\n" +
    		"- Realizar ingeniería inversa, descompilar o desensamblar el Software.\n" +
    		"- Modificar o alterar el Software sin autorización expresa de Java Bank.\n" +
   		"- Utilizar el Software en producción o con datos reales.\n" +
    		"- Distribuir, vender, sublicenciar o transferir el Software a terceros.");

		textArea1.setLineWrap(true);
		textArea1.setWrapStyleWord(true);

		scrollpane1 = new JScrollPane(textArea1);
		scrollpane1.setBounds(40,80,650,200);
		add(scrollpane1);

		//Establecer el checkBox de aceptar terms and conditions
		check1 = new JCheckBox("Yo, " + nombre + ", acepto.");
		check1.setBounds(30,330,350,30);
		check1.addChangeListener(this);
		add(check1);

		//Establecer el titulo
		setTitle("Licencia de uso");
		


	}

	public void stateChanged(ChangeEvent e){
		if(check1.isSelected() == true){
			boton1.setEnabled(true); 
			boton2.setEnabled(false);
		}
		if(check1.isSelected() == false){
			boton1.setEnabled(false); 
			boton2.setEnabled(true);
		}
			
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			PantallaPrincipal formulario1 = new PantallaPrincipal();
			formulario1.setBounds(0,0,800,700);
			formulario1.setVisible(true);
			formulario1.setResizable(false);
			formulario1.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if(e.getSource() == boton2){
			Bienvenida formulario1 = new Bienvenida();
			formulario1.setBounds(0,0,400,500);
			formulario1.setVisible(true);
			formulario1.setResizable(false);
			formulario1.setLocationRelativeTo(null);
			this.setVisible(false);
		}
	}



	
	public static void main(String args[]){
		Licencia formulario1 = new Licencia();
		formulario1.setBounds(0,0,750,500);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	
	}
}