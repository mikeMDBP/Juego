package juego.logica;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Humano extends Personaje {
	private final  Image imagen;
	public Humano() {
		imagen = new ImageIcon(getClass().getResource("/img/humano.png")).getImage();
		arma = new Rifle();
		escudo = new EscudoH();	
		
	}
	
	 public void dibujar(int x, int y, Graphics g) {
		 		g.drawImage(imagen,300, 150, null);
		   	     arma.dibujar(50, 50, g);
		   	     escudo.dibujar(350, 150, g);
	       
	       
	    }

}
