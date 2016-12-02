package grenouilloland.vue;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import grenouilloland.presentateur.Presentateur;

/**
 * 
 * @author Charaf-Eddine
 * 
 * cette classe reprensente une grenouille 
 */
public class GrenouilleGraphique extends JLabel{
	
	/**
	 * Constructeur logique
	 * @param mareGraphique
	 * @param ligne
	 * @param colonne
	 */

	public GrenouilleGraphique(MareGraphique mareGraphique,int ligne,int colonne){
		this.mareGraphique = mareGraphique;
		this.ligne = ligne;
		this.colonne = colonne;
		this.setIcon(grenouille);
		mettreAJour();
	}
	
	/**
	 * Mettre a jour l'etat de la grenouille
	 */
	public void mettreAJour(){
		final Vue vue = mareGraphique.lireVue();
		final Presentateur presentateur = vue.lirePresentateur();
		final boolean malade = presentateur.IsGrenouilleMalade();
		
		if(malade){
			setIcon(sickGrenouille);
		}
		else{
			setIcon(grenouille);
		}
	}
	
	/**
	 * Icone de cette action.
	 */
	public  ImageIcon grenouille;
	{
	ClassLoader loader = ViePoints.class.getClassLoader();
	URL url = loader.getResource("icones/grenouille-verte-96x57.png");
	grenouille = new ImageIcon(url);
	}
	
	public  ImageIcon sickGrenouille;
	{
	ClassLoader loader = ViePoints.class.getClassLoader();
	URL url = loader.getResource("icones/grenouille-rouge-96x57.png");
	sickGrenouille = new ImageIcon(url);
	}
	
	public int lireLigne() {
		return ligne;
	}

	public int lireColonne() {
		return colonne;
	}
	
	public MareGraphique lireMareGraphique() {
		return mareGraphique;
	}
	
	protected final int ligne,colonne;
	protected MareGraphique mareGraphique;
	protected Presentateur presentateur;
}
