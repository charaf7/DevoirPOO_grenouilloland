package grenouilloland.vue;

import javax.swing.JProgressBar;

/**
 * cette Classe represente une barre du progression pour afficher la duree d'une partie.
 *
 */

public class Chronometre extends JProgressBar{
	
	public Chronometre(Vue vue){
		this.vue=vue;
	}
	
	protected Vue vue;
}
