package juego.logica;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Rifle extends Arma {

	public Rifle() {
		imagen = new ImageIcon(getClass().getResource("/img/rifle.png")).getImage();
	}

	 public void dibujar(int x, int y, Graphics g) {
	        g.drawImage(imagen, x + 100, y, null);
	    }

}
