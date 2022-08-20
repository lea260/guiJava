package gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class ClienteListar extends JInternalFrame {
	private JTable table;

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

		setTitle("Lista Clientes");
		setBounds(50, 0, 800, 400);
		getContentPane().setLayout(null);

		String data[][] = { { "101", "Amit", "670000" }, { "102", "Jai", "780000" }, { "101", "Sachin", "700000" } };
		String column[] = { "ID", "NAME", "SALARY" };

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(73, 48, 600, 300);
		getContentPane().add(scrollPane);
		table = new JTable(data, column);
		scrollPane.setViewportView(table);

	}
}
