package grenouilloland.vue;

import javax.swing.ImageIcon;
import java.awt.event.InputEvent;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.Action;

/**
 * Cette classe represente l'action : presenter l'application, les auteurs et sa version.
 */

public class ActionAbout extends ActionAbstraite{
	
	/**
     * Constructeur logique.
     *prend vue comme param
     */
    public ActionAbout(Vue vue) {
    	super(texte,icone,aide,vue);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
	JOptionPane.showMessageDialog(vue,
				   		message,
				      (String)getValue(Action.NAME),
				      JOptionPane.INFORMATION_MESSAGE,
				      (ImageIcon)getValue(Action.SMALL_ICON));
    }

    
    protected static final String texte = "A propos ...";
    protected static final String aide = "Version et auteurs.";
    protected static final String cheminIcone = "ressources/images/a-propos.png";

    //Icone
    protected static final ImageIcon icone;
    static {
	ClassLoader loader = ActionAbout.class.getClassLoader();
	URL url = loader.getResource(cheminIcone);
	icone = new ImageIcon(url);
    }

    protected final String message = "Devoir POO\n" +
	"jeu grenouilloland\n\n" +
	"Alban Morin - Manel Rekik - Charaf-Eddine Skiker";

}

