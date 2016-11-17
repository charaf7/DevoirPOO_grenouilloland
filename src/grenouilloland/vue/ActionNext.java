package grenouilloland.vue;

import java.awt.event.ActionEvent;

public class ActionNext extends ActionAbstraite {

	/**
     * Constructeur logique.
     *prend vue comme param
     */
	public ActionNext(Vue vue){
		super(null, null, null, vue);
	}
	
	@Override
    public void actionPerformed(ActionEvent e) {
		vue.suivanteV();
    }
	
}
