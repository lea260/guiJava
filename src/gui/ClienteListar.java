package gui;

import java.awt.EventQueue;

import javax.swing.DefaultFocusManager;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import entidades.PersonaDto;
import modelo.Persona;

import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ClienteListar extends JInternalFrame {
	private JTable table;
	private DefaultTableModel dtm;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JButton btnDatos;
	private ArrayList<PersonaDto> lista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteListar frame = new ClienteListar();
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
	public ClienteListar() {
		setClosable(true);
		table = new JTable();

		dtm = new DefaultTableModel();
		setTitle("Lista Clientes");
		setBounds(50, 0, 800, 800);
		getContentPane().setLayout(null);

		dtm.addColumn("ID");
		dtm.addColumn("Nombre");
		dtm.addColumn("Salario");

		// String column[] = { "ID", "NAME", "SALARY" };

		scrollPane = new JScrollPane();
		scrollPane.setBounds(73, 48, 600, 219);
		getContentPane().add(scrollPane);
		table = new JTable();
		table.setModel(dtm);
		scrollPane.setViewportView(table);

		panel = new JPanel();
		panel.setBounds(73, 304, 600, 86);
		getContentPane().add(panel);

		btnDatos = new JButton("Eliminar Todo");

		panel.add(btnDatos);

		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		cargarDatos();
		btnDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarTodo();
			}

		});
	}

	private void cargarDatos() {
		// TODO Auto-generated method stub
		dtm.addRow(new String[] { "101", "Amit", "670000" });
		dtm.addRow(new String[] { "102", "Jai", "780000" });
		dtm.addRow(new String[] { "103", "Sachin", "700000" });
		dtm.addRow(new String[] { "104", "Sachin05", "77000" });

	}

	private void borrarTodo() {
		// TODO Auto-generated method stub
		int cant = table.getRowCount();
		for (int i = cant - 1; i >= 0; i--) {
			dtm.removeRow(i);
		}
	}

	private void cargarPersonas() {
		try {
			Persona persona = new Persona();
			/* carga la lista de personas del modelo */
			this.lista = persona.listar();
			/* usar el DefaultTableModel(dtm) parad cargar los datos */
			actualizarTabla();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void actualizarTabla() {
		// TODO Auto-generated method stub
		
		
	}

}
