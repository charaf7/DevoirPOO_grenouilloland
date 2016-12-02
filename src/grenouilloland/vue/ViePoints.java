package grenouilloland.vue;

import grenouilloland.presentateur.Presentateur;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.*;

/**
 * cette Classe represente les points de vie de la grenouille.
 *
 */

public class ViePoints extends JPanel{
	
	public ViePoints(Vue vue){
		this.vue=vue;
		//mettre l'icone du coeur sur un label
		JLabel coeurField = new JLabel();
		coeurField.setIcon(coeur);
		
		//placer un entier qui presente les points de vie
		JLabel points = new JLabel();
		points.setText( Integer.toString(vue.lirePresentateur().lirePoints()));
	}

	public Vue lireVue() {
    	return vue;
    }
	
	public  ImageIcon coeur;
	{
	ClassLoader loader = ViePoints.class.getClassLoader();
	URL url = loader.getResource("icones/coeur.png");
	coeur = new ImageIcon(url);
	}
	
	protected Vue vue;
}
