package com.unc.mayo.grupo;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Inicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana = new JFrame();
		JButton boton = new JButton();
		boton.setText("El BOTON");
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Le dio click al boton");
			}
		});
		ventana.setPreferredSize(new Dimension(300,300));
		ventana.setSize(new Dimension(300,300));
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		FlowLayout cualquierNombre = new FlowLayout();
		ventana.setLayout(cualquierNombre);
		ventana.getContentPane().add(boton);
	}

}
