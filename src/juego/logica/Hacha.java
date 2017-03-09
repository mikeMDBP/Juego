package juego.logica;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Hacha extends Arma{

	public Hacha() {
		imagen = new ImageIcon(getClass().getResource("/img/hacha.png")).getImage();
	}

	 public void dibujar(int x, int y, Graphics g) {
	        g.drawImage(imagen, x, y, null);
	    }
}
