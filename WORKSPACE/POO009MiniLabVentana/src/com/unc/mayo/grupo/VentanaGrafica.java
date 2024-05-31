package com.unc.mayo.grupo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaGrafica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaGrafica frame = new VentanaGrafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("El Boton");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "UN MENSAJE DE CLICKEO");
			}
		});
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		contentPane.add(chckbxNewCheckBox);
		
		JSpinner spinner = new JSpinner();
		contentPane.add(spinner);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"PRIMERA", "SEGUNDA", "TERCERA"}));
		contentPane.add(comboBox);
		
		JButton miBoton = new JButton();
		miBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		miBoton.setText("El boton por codigo");
		contentPane.add(miBoton);
	}

}
