package grenouilloland.presentateur;

import grenouilloland.modele.Modele;
import grenouilloland.modele.TypeNenuphar;
import grenouilloland.vue.Vue;

/**
 * Classe representant le presentateur de l'application.
 */
public class Presentateur {

	/**
	 * Constructeur logique.
	 *
	 * @param resolutionMin la valeur de {@link Presentateur#resolutionMin}.
	 * @param resolutionMax la valeur de {@link Presentateur#resolutionMax}.
	 * @param resolution la resolution initiale du modele.
	 * 
	 */
	public Presentateur(int resolutionMin, int resolutionMax, int resolution) {
		this.resolutionMin = resolutionMin;
		this.resolutionMax = resolutionMax;
		modele = new Modele(resolution);
		vue = new Vue(this);
		System.out.println(vue);
	}

	/**
	 * Cree un nouveau modele.
	 * @param resolution la resolution du nouveau modele.
	 */
	public void nouveauModele(int resolution) {
		modele = new Modele(resolution);
	}

	/**
	 * Cree un nouveau modele de même resolution.
	 */
	public void reinitialiser() {
		nouveauModele(lireResolution());
	}

    /**
     * Prepare et affiche la vue.
     */
	public void lancer() {
		
		// Calcul des dimensions de tous les composants de la vue.
		vue.pack();
		
		// Affichage de la vue.
		vue.setVisible(true);
	}

	public void vieillir() {
		//
	}

	public void suivante() {
		//
	}
	/**
	 * Interface pour la fonction {@link Modele#chemin()}
	 */
	public void chemin(){
		modele.chemin();
	}

	/**
	 * Fonction de déplacement de la grenouille
	 * 
	 * @param ligne la ligne du nénuphar cible.
	 * @param colonne la colonne du nénuphar cible.
	 */
	public void Sauter(int ligne, int colonne) {
		modele.Sauter(ligne, colonne);
	}

	/**
	 * Accesseur.
	 *
	 * @return la résolution du modele.
	 */
	public int lireResolution() {
		return modele.resolution();
	}

	/**
	 * Accesseur.
	 *
	 * @return le type de Nenuphar.
	 */
	public TypeNenuphar type(int ligne, int colonne) {
		return modele.nenupharAt(ligne, colonne).type();
	}
	
	/**
	 * Accesseur.
	 *
	 * @return true si la grenouille est malade, false sinon.
	 */
	public boolean IsGrenouilleMalade() {
		return modele.IsGrenouilleMalade();
	}

	/**
	 * Accesseur.
	 *
	 * @return la resolution minimum du jeu {@link Presentateur#resolutionMin}.
	 */
	public int lireResolutionMin() {
		return resolutionMin;
	}

	/**
	 * Accesseur.
	 *
	 * @return la resolution maximum du jeu {@link Presentateur#resolutionMax}.
	 */
	public int lireResolutionMax() {
		return resolutionMax;
	}

	/**
	 * Accesseur.
	 *
	 * @return le nombre de points de vie de la grenouille.
	 */
	public int lirePoints() {
		return modele.getVies();
	}

	/**
	 * Resolution minimum du modele.
	 */
	protected final int resolutionMin;

	/**
	 * Resolution maximum du modele.
	 */
	protected final int resolutionMax;

	/**
	 * Instance du modele.
	 */
	protected Modele modele;

	/**
	 * Instance de la vue.
	 */
	protected final Vue vue;

}
