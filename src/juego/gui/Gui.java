package juego.gui;

import javax.swing.JFrame;

import juego.gui.*;
import juego.logica.Elfo;
import juego.logica.Humano;
import juego.logica.Orco;

import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Gui extends JFrame {
	private static final long serialVersionUID = 1L;
	Lienzo lienzo = new Lienzo();
	public Gui() {
		
		lienzo.setBounds(0, 0, 800,500);
		initComponents();
		getContentPane().add(lienzo);
	}
	private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        JButton btnHumano = new JButton("Humano");
        btnHumano.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		lienzo.setPersonaje(new Humano());
        		lienzo.repaint();
        	}
        });
        
        JButton btnelfo = new JButton("elfo");
        btnelfo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		lienzo.setPersonaje(new Elfo());
        		lienzo.repaint();
        	}
        });
        
        JButton btnOrco = new JButton("orco");
        btnOrco.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		lienzo.setPersonaje(new Orco());
        		lienzo.repaint();
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnHumano)
        				.addComponent(btnelfo)
        				.addComponent(btnOrco))
        			.addContainerGap(611, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(36)
        			.addComponent(btnHumano)
        			.addGap(59)
        			.addComponent(btnelfo)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btnOrco)
        			.addContainerGap(430, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }
	
	public static void main(String[] args) {
		
		Gui c=new  Gui();
		c.setVisible(true);
		

	}
}
