package grenouilloland.vue;

import javax.swing.BorderFactory;
import javax.swing.JScrollBar;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

/**
 * 
 * @author Charaf-Eddine
 *
 *cette Classe represente une barre de defilement qui controle la resolution du jeu.
 */
class Resolution extends JScrollBar implements AdjustmentListener {

    /**
     * Constructeur logique.
     * 
     * @param orientation
     * @param vue
     */
    public Resolution(int orientation, Vue vue) {

    	
	// Invocation du constructeur de la classe de base.
    	super(orientation,vue.lirePresentateur().lireResolution(),
	      1,
	      vue.lirePresentateur().lireResolutionMin(),
	      vue.lirePresentateur().lireResolutionMax() +1);
    	value = vue.lirePresentateur().lireResolution();
    	

	// L'instance est son propre listener.
    	this.vue = vue;
    	
    	setBorder(BorderFactory.createTitledBorder("Resolution"));	
    	addAdjustmentListener(this);
    }
    /**
     * Accesseur
     * 
     * @return vue
     */
    public Vue lireVue() {
    	return vue;
    }

    /**
     * Cree un nouveau modele uniquement si la valeur de resolution a ete changee
     */
    @Override
    public void adjustmentValueChanged(AdjustmentEvent evt) {
    	if(value!= getValue()){
    		value = getValue();
    	vue.nouveauModele(value);
    	}
    }
   
    protected int value;
    protected Vue vue;
    

}
