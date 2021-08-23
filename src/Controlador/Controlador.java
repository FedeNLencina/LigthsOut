package Controlador;

import Logica.TableroLogico;

public class Controlador {
	public Controlador() {
		
	}
	
	public void inicializarTableroLogico() {
		//crea una matriz logica de 4 x 4
		TableroLogico.inicializarTableroLogico(4);
	}
}
