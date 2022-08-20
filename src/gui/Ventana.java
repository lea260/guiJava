package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JDesktopPane dk;
	private JMenu mnCliente;
	private JMenuItem mnitClienteListar;
	private JMenuBar menuBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnCliente = new JMenu("Cliente");
		
		menuBar.add(mnCliente);
		
		JMenuItem mnitClientesListar = new JMenuItem("Listar");
		mnitClientesListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostarVentanaClientes();
			}

			
		});
		mnCliente.add(mnitClientesListar);

		mnitClienteListar = new JMenuItem("Listar");
		//mnitClienteListar.addActionListener(this);
		//mnCliente.add(mnitClienteListar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		dk = new JDesktopPane();
		dk.setBackground(SystemColor.activeCaption);
		contentPane.add(dk, BorderLayout.CENTER);
	}
	private void mostarVentanaClientes() {
		// TODO Auto-generated method stub
		ClienteListar ventana= new ClienteListar();
		ventana.setVisible(true);
		dk.add(ventana);
		
	}
}