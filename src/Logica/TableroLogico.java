package Logica;

import java.util.Random;

public class TableroLogico {
	
	private static BotonLogico[][] tablero;
	
	public static void inicializarTableroLogico(int cantidad) {
		tablero = new BotonLogico[cantidad][cantidad];
		
		for (int i = 0; i < cantidad; i++) {
			for (int j = 0; j < cantidad; j++) {
				Random random = new Random();
				boolean valor = random.nextBoolean();
				
				tablero[i][j] = new BotonLogico(valor, i, j);
			}
		}
	}

	public BotonLogico[][] getBotones() {
		return tablero;
	}

	public void setTablero(BotonLogico[][] tablero) {
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
	
	public void cambiarEstado(int i, int j) {
		cambiarEstadoBoton(i, j);
		cambiarEstadoVecinos(i,j);
	}
	

}
