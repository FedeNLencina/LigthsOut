package Visual;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Graphics;

import Controlador.Controlador;



public class MainVisual {

	private JFrame frame;
	private TableroDeBotones botones;
	private Fondo fondo = new Fondo();

	public MainVisual(JFrame frame) {
		this.frame = frame;
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

	public void initialize() {
		
		// Inicializa los contenidos del frame
		frame = new JFrame();
		frame.setContentPane(fondo);
		this.frame.setBounds(350, 100, 650, 500);
		//coordenadas
		this.frame.getContentPane().setLayout(new GridLayout(4, 4, 0, 0));
		this.frame.getContentPane().setBackground(Color.darkGray);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setVisible(true);
		this.frame.setTitle("Ligths Out!   " + "   Movimientos: " + Controlador.getCantMov());
		this.frame.setIconImage(Toolkit.getDefaultToolkit().getImage(MainVisual.class.getResource("/imagenes/boton_rojo_encendido.png")));
		
		// Crea el tablero visual y lo llena de botones
		botones = new TableroDeBotones(frame, 4);
		botones.llenarTablero();

	}
	
	private class Fondo extends JPanel{
		private static final long serialVersionUID = 1L;
		private Image imagenImage;
		@Override
		public void paint(Graphics g) {
			imagenImage = new ImageIcon(getClass().getResource("/imagenes/fondo_metalico.jpg")).getImage();
			g.drawImage(imagenImage, 0, 0, getWidth(), getHeight(), this);
			//desctivamos fondo por defecto
			setOpaque(false);
			//dibuja los elementos sobre el fondo
			super.paint(g);
		}
	}
}
			


