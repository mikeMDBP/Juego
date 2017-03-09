package juego.logica;

import java.awt.Image;

public abstract class Escudo implements Dibujable {
	protected int proteccion;
    protected Image imagen;

    public int getProteccion() {
        return proteccion;
    }

    public void setProteccion(int proteccion) {
        this.proteccion = proteccion;
    }

}
