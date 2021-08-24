package Visual;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.Color;
import Controlador.Controlador;


public class MainVisual {

	public JFrame frame;
	private TableroDeBotones botones;

	public MainVisual(JFrame frame) {
		this.frame = frame;
	}

	public void initialize() {
		
		// Inicializa los contenidos del frame
		this.frame.setBounds(350, 100, 650, 500);
		this.frame.getContentPane().setLayout(new GridLayout(4, 4, 0, 0));
		this.frame.getContentPane().setBackground(Color.darkGray);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setVisible(true);
		this.frame.setLocationRelativeTo(null);
		this.frame.setTitle("Ligths Out!   " + "   Movimientos: " + Controlador.getCantMov());
		this.frame.setIconImage(Toolkit.getDefaultToolkit().getImage(MainVisual.class.getResource("/imagenes/boton_rojo_encendido.png")));
		
		// Crea el tablero visual y lo llena de botones
		botones = new TableroDeBotones(frame, 4);
		botones.llenarTablero();

	}
}
			


