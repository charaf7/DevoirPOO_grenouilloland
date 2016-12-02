package grenouilloland.vue;

import javax.swing.JScrollBar;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

/**
 * cette Classe represente une barre de defilement qui controle la resolution du jeu.
 *
 */
class Resolution extends JScrollBar implements AdjustmentListener {

    /**
     * Constructeur logique.
     */
    public Resolution(int orientation, Vue vue) {

	// Invocation du constructeur de la classe de base.
    	super(orientation,vue.lirePresentateur().lireResolutionMin(),
	      1,
	      vue.lirePresentateur().lireResolutionMin(),
	      vue.lirePresentateur().lireResolutionMax() +1);

	// L'instance est son propre listener.
    	this.vue = vue;
    	addAdjustmentListener(this);
    }

    public Vue lireVue() {
    	return vue;
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent evt) {
    	vue.nouveauModele(getValue());
    }
   
    protected Vue vue;
    

}
