package juego.gui;

import javax.swing.JFrame;

import juego.gui.*;
import juego.logica.Elfo;
import juego.logica.Gigante;
import juego.logica.Humano;
import juego.logica.Orco;

import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;


public class Gui extends JFrame {
	private static final long serialVersionUID = 1L;
	Lienzo lienzo = new Lienzo();
	public Gui() {
		
		lienzo.setBounds(0, 0, 800,600);
		initComponents();
		getContentPane().add(lienzo);
	}
	private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        JButton btnhumano = new JButton("humano");
        btnhumano.addActionListener(new ActionListener() {
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
        
        JButton btnGigante = new JButton("gigante");
        btnGigante.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		lienzo.setPersonaje(new Gigante());
        		lienzo.repaint();
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(btnhumano, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnelfo, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnOrco, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnGigante))
        			.addContainerGap(691, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(36)
        			.addComponent(btnhumano, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(btnelfo, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(btnOrco, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(btnGigante)
        			.addContainerGap(309, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }
	
	public static void main(String[] args) {
		
		Gui c=new  Gui();
		c.setVisible(true);
		

	}
}
