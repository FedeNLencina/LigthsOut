package Visual;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.text.StyleConstants.ColorConstants;

import Logica.Tablero;
import Logica.Boton;
import java.awt.Color;




public class Ventana {

	JFrame frame;
	private Tablero tablero;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e) 
		{}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Ventana() {
		this.tablero = new Tablero(4,4);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(new GridLayout(4, 4, 8, 8));
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i = 0; i < tablero.getBotones().length ; i++) {
			for(int j = 0; j < tablero.getBotones()[i].length; j++) {
				JButton btnNewButton = new JButton("");
				
				
				if(tablero.getBotones()[i][j].isState()) {
					btnNewButton.setBorderPainted(false);
					btnNewButton.setBackground(Color.GREEN);
				}
				else {
					btnNewButton.setBorderPainted(false);
					btnNewButton.setBackground(Color.RED);
				}
				
				frame.getContentPane().add(btnNewButton);
			}
		}
		
		
		
		
		
	}
}












/*package Visual;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Ventana {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
//	public Ventana() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
//	private void initialize() {
//		frame = new JFrame();
//		frame.setBounds(100, 100, 450, 300);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}

//}
