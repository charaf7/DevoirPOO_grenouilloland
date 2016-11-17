package grenouilloland.vue;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.Action;

/**
 * Classe representant une action abstraite, pour simplifier et eviter la répétition les actions des menus et des outils
 */

abstract  class ActionAbstraite extends AbstractAction {

	protected Vue vue;
	
	/**
     * Constructeur logique.
    */
	 public ActionAbstraite(String nom, Icon icone,String bulleAide, Vue vue) {
		 	super(nom, icone);
		 	putValue(Action.SHORT_DESCRIPTION, bulleAide);
		 	this.vue = vue;
	 }
	 
	 /**
	  * Accesseur
	  */
	 public Vue lireVue() {
			return vue;
	 }
	 	 
}
