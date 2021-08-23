package Main;

import java.awt.EventQueue;
import javax.swing.UIManager;
import Controlador.Controlador;
import Visual.Ventana;
import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e) 
		{}
		
		EventQueue.invokeLater(new Runnable() {
			
			//creamos lo visual
			JFrame frame = new JFrame();
			Ventana ventana = new Ventana(frame);
			
			//creamos el controlador
			Controlador controlador = new Controlador();
			
			public void run() {
				try {
					ventana.initialize();
					controlador.inicializarTableroLogico();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	
}
