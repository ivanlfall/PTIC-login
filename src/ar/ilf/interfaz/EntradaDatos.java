package ar.ilf.interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EntradaDatos extends JPanel {
	
	private JButton aceptar, limpiar;
	private JLabel userL, passL;
	private JTextField user, pass;
	private JTextArea informacion;
	
	public EntradaDatos() {
		
		user = new JTextField(10);
		user.setBounds(new Rectangle(100, 20));
		pass = new JTextField(10);
		userL = new JLabel("Usuario");
		passL = new JLabel("Contraseña");
		aceptar = new JButton("Aceptar");
		limpiar = new JButton("Limpiar");
		informacion = new JTextArea(5,10);
		
		setLayout(new FlowLayout());
		
		JPanel datosUsuario = new JPanel();
		datosUsuario.setLayout(new GridLayout());
		datosUsuario.add(userL);
		datosUsuario.add(user);
		
		JPanel datosPass = new JPanel();
		datosPass.setLayout(new GridLayout());
		datosPass.add(passL);
		datosPass.add(pass);
		
		JPanel botonGroup = new JPanel();
		botonGroup.setLayout(new GridLayout());
		botonGroup.add(aceptar);
		botonGroup.add(limpiar);
		
		Box entrada = Box.createVerticalBox();
		entrada.add(datosUsuario);
		entrada.add(datosPass);
		
		JPanel paletaEntrada = new JPanel();
		paletaEntrada.setLayout(new FlowLayout());
		//paletaEntrada.add(datosUsuario, BorderLayout.NORTH);
		paletaEntrada.add(entrada);
		paletaEntrada.add(botonGroup);
		
		
//		Box paletaFinal = Box.createVerticalBox();
//		paletaFinal.add(datosUsuario);
//		paletaFinal.add(datosPass);
//		paletaFinal.add(botonGroup);
//		paletaFinal.add(informacion);
		add(paletaEntrada);
		//add(botonGroup, BorderLayout.CENTER);
		add(informacion);
	}
	
}
