package grenouilloland.vue;

import javax.swing.ImageIcon;
import java.net.URL;
import java.awt.event.ActionEvent;

/**
 * Cette classe represente l'action : quitter l'application.
 */

public class ActionQuit extends ActionAbstraite {

	/**
	 * Constructeur logique. prend vue comme param
	 */

	public ActionQuit(Vue vue) {

		super(texte, icone, aide, vue);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		quitTheGame();
	}

	/**
	 * Methode pour quitter l'application.
	 */
	protected void quitTheGame() {
		System.exit(0);
	}

	protected static final String texte = "Quitter";
	protected static final String aide = "Quitter l'application.";
	protected static final String cheminIcone = "icones/quitter.png";

	/**
	 * Icone de cette action.
	 */
	protected static final ImageIcon icone;
	static {
		ClassLoader loader = ActionQuit.class.getClassLoader();
		URL url = loader.getResource(cheminIcone);
		icone = new ImageIcon(url);
	}

}