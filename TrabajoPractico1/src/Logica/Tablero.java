package Logica;

import java.util.Random;

public class Tablero {
	
	private Boton[][] tablero;
	
	public Tablero(int filas, int columnas) {
		this.tablero = new Boton[filas][columnas];
		
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				Random random = new Random();
				boolean valor = random.nextBoolean();
				
				this.tablero[i][j] = new Boton(valor);
			}
		}
	}

	public Boton[][] getBotones() {
		return tablero;
	}

	public void setTablero(Boton[][] tablero) {
		this.tablero = tablero;
	}
	
//	public static void main(String[] args) {
//		Tablero tabla = new Tablero(4,4);
//		
//		for (int i = 0; i < tabla.getBotones().length; i++) {
//			for (int j = 0; j < tabla.getBotones()[i].length; j++) {
//				System.out.println(tabla.getBotones()[i][j].isState());
//			}
//			
//		} 
//	
//	}
}
