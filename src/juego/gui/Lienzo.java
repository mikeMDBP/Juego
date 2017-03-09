package juego.gui;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Menu;
import java.util.Scanner;

import javax.swing.JButton;

import juego.logica.Elfo;
import juego.logica.Humano;
import juego.logica.Orco;
import juego.logica.Personaje;

public class Lienzo extends Canvas {
	JButton btnhumano = new JButton("HUMANO");
	Personaje personaje;

	public void setPersonaje(Personaje p){
		this.personaje = p;
	}
    public Lienzo() {
    	//personaje = new Elfo();
       
        
    }
    

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        if(personaje != null)
        	personaje.dibujar(0, 0, g);
    }

}
