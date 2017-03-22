package juego.logica;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Gigante extends Personaje{
	private final  Image imagen;
	public Gigante() {
		imagen = new ImageIcon(getClass().getResource("/img/cuerpo_gigante.png")).getImage();
		arma = new ArmaG();
		escudo = new EscudoG();	
		
	}
	
	 public void dibujar(int x, int y, Graphics g) {
		 		g.drawImage(imagen,300, 100, null);
		 		arma.dibujar(100, 50, g);
		   	    escudo.dibujar(350, 150, g);
	       
	       
	    }
}
