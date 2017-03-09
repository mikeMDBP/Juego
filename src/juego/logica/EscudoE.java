package juego.logica;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class EscudoE extends Escudo {

	public EscudoE() {
        imagen = new ImageIcon(getClass().getResource("/img/escudoelfos.png")).getImage();
        
    }
    
    
    public void dibujar(int x, int y, Graphics g) {
        g.drawImage(imagen, 500, y, null);
    }
}
