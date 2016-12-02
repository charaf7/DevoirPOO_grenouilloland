package grenouilloland.vue;

import java.awt.event.ActionEvent;
/**
 * 
 * @author Charaf-Eddine
 *Cette classe permet de passer à la generation suivante qd on deplace la grenouille
 */

public class ActionNext extends ActionAbstraite {

	/**
	 * Constructeur logique
	 * @param vue
	 */
	public ActionNext(Vue vue){
		super(null, null, null, vue);
	}
	
	@Override
    public void actionPerformed(ActionEvent e) {
		vue.suivanteV();
    }
	
}
