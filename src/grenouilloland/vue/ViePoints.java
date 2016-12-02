package grenouilloland.vue;

import grenouilloland.presentateur.Presentateur;

import java.awt.BorderLayout;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.*;

/**
 * cette Classe represente les points de vie de la grenouille.
 * 
 * @author Charaf-Eddine
 *
 */

public class ViePoints extends JPanel{
	
	/**
	 * Constructeur logique
	 * 
	 * @param vue
	 */
	public ViePoints(Vue vue){
		this.vue=vue;
		//mettre l'icone du coeur sur un label
		JLabel coeurField = new JLabel();
		coeurField.setIcon(coeur);
		
		//placer un entier qui presente les points de vie
		JLabel points = new JLabel();
		points.setText( Integer.toString(vue.lirePresentateur().lirePoints()));
		
		add(coeurField);
		add(points);
	}

	/**
	 * Accesseur
	 * 
	 * @return
	 */
	public Vue lireVue() {
    	return vue;
    }
	
	/**
	 * Icone qui represente les points de vie.
	 */
	protected static final  ImageIcon coeur;
	static{
	ClassLoader loader = ViePoints.class.getClassLoader();
	URL url = loader.getResource("icones/coeur-96x91.png");
	coeur = new ImageIcon(url);
	}
	
	protected Vue vue;
}
