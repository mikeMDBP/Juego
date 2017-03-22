package juego.logica;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class EscudoG extends Escudo {
	public EscudoG() {
        imagen = new ImageIcon(getClass().getResource("/img/escudo_gigante.png")).getImage();
        
    }
    
    
    public void dibujar(int x, int y, Graphics g) {
        g.drawImage(imagen, 500, y, null);
    }
}
