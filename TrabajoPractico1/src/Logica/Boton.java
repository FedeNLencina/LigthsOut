package Logica;

public class Boton {
	
	
	private boolean state;
	
	public Boton(boolean estado) {
		this.state = estado;
	}
	
	public void setState(boolean estado) {
		this.state = estado;
	}

	public boolean isState() {
		return state;
	}
}

	
