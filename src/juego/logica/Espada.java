package juego.logica;

import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Espada extends Arma{

	public Espada() {
		imagen = new ImageIcon(getClass().getResource("/img/espada.png")).getImage();
	}

	 public void dibujar(int x, int y, Graphics g) {
	        g.drawImage(imagen, x, y, null);
	    }
}
