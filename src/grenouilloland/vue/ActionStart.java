package grenouilloland.vue;

import javax.swing.ImageIcon;
import java.net.URL;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Charaf-Eddine
 *
 *Cette classe represente l'action de lancer une partie.
 */

public class ActionStart extends ActionAbstraite {

	/**
	 * Constructeur logique.
	 * @param vue
	 */

	public ActionStart(Vue vue) {
		super(texte, icone, aide, vue);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vue.lancerV();
	}

	protected static final String texte = "Démarrer";
	protected static final String cheminIcone = "icones/lancer.png";
	protected static final String aide = "Lancer la partie.";

	/**
	 * Icone de cette action.
	 */
	protected static final ImageIcon icone;

	static {
		ClassLoader loader = ActionStart.class.getClassLoader();
		URL url = loader.getResource(cheminIcone);
		icone = new ImageIcon(url);
	}

}
