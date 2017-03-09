package juego.logica;

import java.awt.Graphics;
import javax.swing.ImageIcon;

public class EscudoO extends Escudo {
	public EscudoO() {
		imagen = new ImageIcon(getClass().getResource("/img/escudorcos.png")).getImage();
	}

	 public void dibujar(int x, int y, Graphics g) {
	        g.drawImage(imagen, x+100, y, null);
	    }

}
