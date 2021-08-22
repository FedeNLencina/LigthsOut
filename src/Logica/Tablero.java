package Logica;

import java.util.HashSet;
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
	
	public void cambiarEstadoBoton(int i ,int j) {
		if (tablero[i][j].isState()) {
			tablero[i][j].setState(false);
		}else {
			tablero[i][j].setState(true);;
		}
	}
	
	public boolean existeBoton(int i,int j) {
		if ((i<0 || i >=tablero.length) || (j<0 || j >=tablero.length)) {
				return false;
		}
		return true;
	}
	
	public void cambiarEstadoVecinos(int i,int j) {
		if(existeBoton(i-1, j)) 
			cambiarEstadoBoton(i-1, j);
		if(existeBoton(i+1, j)) 
			cambiarEstadoBoton(i+1, j);
		if(existeBoton(i, j-1)) 
			cambiarEstadoBoton(i, j-1);
		if(existeBoton(i, j+1)) 
			cambiarEstadoBoton(i, j+1);
	}
	

}
