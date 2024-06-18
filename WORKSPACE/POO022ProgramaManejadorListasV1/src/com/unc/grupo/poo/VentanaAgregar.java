package com.unc.grupo.poo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class VentanaAgregar extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField txtDatoGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaAgregar dialog = new VentanaAgregar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaAgregar() {
		setBounds(100, 100, 366, 249);
		getContentPane().setLayout(null);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(120, 141, 89, 23);
		getContentPane().add(btnAgregar);
		
		txtDatoGuardar = new JTextField();
		txtDatoGuardar.setBounds(102, 37, 187, 20);
		getContentPane().add(txtDatoGuardar);
		txtDatoGuardar.setColumns(10);
	}
}
