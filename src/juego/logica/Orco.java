package juego.logica;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Orco extends Personaje{
	private final  Image imagen;
	public Orco() {
		imagen = new ImageIcon(getClass().getResource("/img/orco.jpg.png")).getImage();
		arma = new Hacha();
		escudo = new EscudoO();	
		
	}
	
	 public void dibujar(int x, int y, Graphics g) {
		 		g.drawImage(imagen,310, 100, null);
		   	     arma.dibujar(100, 150, g);
		   	     escudo.dibujar(380, 110, g);
	       
	       
	    }
}
