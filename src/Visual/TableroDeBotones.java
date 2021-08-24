package Visual;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Controlador.Controlador;


public class TableroDeBotones {
	private JFrame frame;
	public static BotonVisual[][] botones;
	
	public TableroDeBotones(JFrame frame, int cantidad) {
		this.frame = frame;
		botones = new BotonVisual[cantidad][cantidad];
	}
	
	public void llenarTablero() {
		
		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones[0].length; j++) {

				JButton jboton = new JButton();
				BotonVisual boton = new BotonVisual(jboton, i, j);
				
				establecerIconoBoton(boton);
				agregarEventoBoton(boton);
				
				boton.getJButon().setBorder(null);
				boton.getJButon().setBackground(null);
				boton.getJButon().setContentAreaFilled(false);
				
				frame.getContentPane().add(boton.getJButon());
				botones[i][j] = new BotonVisual(jboton, i, j);
				
				
			}
		}
	}

	private void establecerIconoBoton(BotonVisual boton) {
		//llama al controlador que verifica el estado del boton llamando al metodo Logico y le asigna la
		//imagen que le corresponde de acuerdo a su estado
		if(Controlador.getEstadoBoton(boton.getFila(), boton.getColumna())) {
			
			boton.getJButon().setIcon(new ImageIcon(TableroDeBotones.class.getResource("/imagenes/boton_rojo_encendido(100px).png")));
		}
		else {
			boton.getJButon().setIcon(new ImageIcon(TableroDeBotones.class.getResource("/imagenes/boton_rojo_apagado(95px).png")));
		}
		
	}
	
	private void establecerIconoBotones() {
		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones[0].length; j++) {
				establecerIconoBoton(botones[i][j]);
			}
		}
	}
	
	public void realizarJugada(BotonVisual boton, int fila, int columna) {
		//realiza una jugada en la matriz logica, actualizando el estado, llamando al controlador
		Controlador.actualizarJugadaMatriz(fila, columna);
		//establece la imagen correspondiente al nuevo estado del tablero
		establecerIconoBotones();
	}
	
	private void agregarEventoBoton(BotonVisual boton) {
		
		
		boton.getJButon().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				realizarJugada(boton, boton.getFila(), boton.getColumna());
				
				if(Controlador.hayGanador()) {
					//pantallita de ganador
					desactivarBotones();
					JOptionPane.showMessageDialog(frame, "Felicitaciones has ganado el juego!" 
					+ "\nMovimientos Totales: " + Controlador.getCantMov());
					return;
				}
				frame.setTitle("Ligths Out!   " + "   Movimientos: " + Controlador.getCantMov());
			}
		});	
	}
	
	private void desactivarBotones() {
		//Desactiva los botones una vez que se determina una partida ganada
		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones[0].length; j++) {
				botones[i][j].getJButon().setEnabled(false);
			}
		}
	}
	
}



