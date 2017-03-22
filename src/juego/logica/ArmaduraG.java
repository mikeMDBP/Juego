package juego.logica;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class ArmaduraG extends Escudo {
	public ArmaduraG() {
		imagen = new ImageIcon(getClass().getResource("/img/armadura_gigante.png")).getImage();
	}

	 public void dibujar(int x, int y, Graphics g) {
	        g.drawImage(imagen, x, y, null);
	    }
}
