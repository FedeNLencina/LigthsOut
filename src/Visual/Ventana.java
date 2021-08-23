package Visual;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UIManager;
import Logica.TableroLogico;
import Logica.BotonLogico;
import java.awt.Color;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;






public class Ventana {

	public JFrame frame;
	private TableroDeBotones botones;
	
	
	public Ventana(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(new GridLayout(4, 4, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		botones = new TableroDeBotones(frame, 4);
		botones.llenarTablero();

	}
}
			


