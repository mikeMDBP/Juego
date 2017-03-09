package juego.logica;

import java.awt.Graphics;
import javax.swing.ImageIcon;

public class EscudoH extends Escudo {
	public EscudoH() {
		imagen = new ImageIcon(getClass().getResource("/img/escudo.png")).getImage();
	}

	 public void dibujar(int x, int y, Graphics g) {
	        g.drawImage(imagen, x+100, y, null);
	    }

}
