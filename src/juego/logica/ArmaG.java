package juego.logica;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class ArmaG extends Arma{
	public ArmaG() {
		imagen = new ImageIcon(getClass().getResource("/img/arma_gigante.png")).getImage();
	}

	 public void dibujar(int x, int y, Graphics g) {
	        g.drawImage(imagen, x, y, null);
	    }

}
