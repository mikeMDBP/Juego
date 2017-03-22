package juego.logica;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Elfo extends Personaje {
	private final  Image imagen;
	public Elfo() {
		imagen = new ImageIcon(getClass().getResource("/img/elfo.png")).getImage();
		arma = new Espada();
		escudo = new EscudoE();	
		
	}
	
	 public void dibujar(int x, int y, Graphics g) {
		 		g.drawImage(imagen,300, 100, null);
		   	     arma.dibujar(50, 100, g);
		   	     escudo.dibujar(550, 100, g);
	       
	       
	    }
}
