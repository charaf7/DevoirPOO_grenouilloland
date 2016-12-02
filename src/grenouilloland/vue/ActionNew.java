package grenouilloland.vue;

import javax.swing.ImageIcon;
import java.net.URL;
import java.awt.event.ActionEvent;

/**
 * @author Charaf-Eddine
 * 
 *Cette classe represente l'action de préparer une nouvelle partie.
 */

public class ActionNew extends ActionAbstraite{

	/**
	 * Constructeur logique
	 * @param vue
	 */
	
	public ActionNew(Vue vue){
		super(texte,icone,aide,vue);
	}
	
	@Override
    public void actionPerformed(ActionEvent e) {
	vue.reinitialiserV();
    }
	
	protected static final String texte = "Nouveau";
    protected static final String cheminIcone ="icones/nouveau.png";
    protected static final String aide = "Lancer une nouvelle partie.";

    /**
     * Icone de cette action.
     */
    protected static final ImageIcon icone;
    static {
	ClassLoader loader = ActionNew.class.getClassLoader();
	URL url = loader.getResource(cheminIcone);
	icone = new ImageIcon(url);
    }

   	
}
