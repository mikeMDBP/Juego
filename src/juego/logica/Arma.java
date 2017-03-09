package juego.logica;

import java.awt.Image;

public abstract class Arma implements Dibujable {
	
	protected int destruccion;
    protected Image imagen;

    public int getDestruccion() {
        return destruccion;
    }

    public void setDestruccion(int destruccion) {
        this.destruccion = destruccion;
    }

}
