package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.Persona;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarCliente extends JInternalFrame {
	private JTextField textEdad;
	private JTextField textNombre;
	private JButton btnagregar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarCliente frame = new AgregarCliente();
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
	public AgregarCliente() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		setTitle("Agregar Cliente");
		setBounds(50, 0, 850, 400);
		setClosable(true);
		getContentPane().setLayout(null);

		textEdad = new JTextField();
		textEdad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textEdad.setBounds(280, 78, 188, 20);
		getContentPane().add(textEdad);
		textEdad.setColumns(10);

		textNombre = new JTextField();
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textNombre.setBounds(280, 136, 188, 20);
		getContentPane().add(textNombre);
		textNombre.setColumns(10);

		btnagregar = new JButton("Agregar");
		btnagregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crearCliente();
			}
		});
		btnagregar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnagregar.setBounds(54, 245, 141, 23);
		getContentPane().add(btnagregar);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEdad.setBounds(34, 81, 149, 14);
		getContentPane().add(lblEdad);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(34, 139, 125, 14);
		getContentPane().add(lblNombre);

	}

	private void crearCliente() {
		// TODO Auto-generated method stub

		try {
			String nombre = textNombre.getText();
			String edadString = textEdad.getText();
			int edad = Integer.parseInt(edadString);
			Persona persona = new Persona(edad, nombre);
			JOptionPane.showMessageDialog(null, "Hello World");
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "la edad no puede ser negativa");
		}

	}
}
