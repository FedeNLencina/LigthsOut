package Visual;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class TableroDeBotones {
	private JFrame frame;
	private BotonVisual[][] botones;
	
	public TableroDeBotones(JFrame frame, int cantidad) {
		this.frame = frame;
		botones = new BotonVisual[cantidad][cantidad];
	}
	
	public void llenarTablero() {
		
		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones[i].length; j++) {
				
				
				JButton jboton = new JButton();
				BotonVisual boton = new BotonVisual(jboton, i, j);
				
				this.frame.getContentPane().add(jboton);
				
				
//				if (botones.getBotones()[i][j].isState()) {
//					boton.setIcon(new ImageIcon(Ventana.class.getResource("/Imagenes/boton_rojo_encendido(50px).png")));	
//				}
//				else {
//					boton.setIcon(new ImageIcon(Ventana.class.getResource("/Imagenes/boton_rojo_apagado(50px).png")));
//				}	
				
			}
		}
	}
	
}
