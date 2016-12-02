package grenouilloland.modele;

/**
 * La classe mere (abstraite) de toutes les classes de Nenuphars.
 * @author Alban Morin
 *
 */
public abstract class Nenuphar implements NenupharAbstrait{
	
	/**
	 * Constructeur Logique.
	* @param ligne	represente la ligne ou se situe le Nenuphar.
	 * @param colonne represente la colonne ou se situe le Nenuphar.
	 * @param etat	represente la taille du Nenuphar.
	 */
	public Nenuphar (int ligne, int colonne, EtatNenuphar etat){
		this.ligne = ligne;
		this.colonne = colonne;
		this.etat = etat;
	}
	/**
	 * Accesseur.
	 * @return la ligne ou se situe le Nenuphar.
	 */
	public int getLigne(){
		return ligne;
	}
	
	/**
	 * Accesseur.
	 * @return la colonne ou se situe le Nenuphar.
	 */
	public int getColonne(){
		return colonne;
	}
	/**
	 * Modifieur.
	 * @param etat la nouvelle taille du Nenuphar.
	 */
	public void setEtat(EtatNenuphar etat){
		this.etat = etat;
	}
	
	/**
	 * Accesseur.
	 * @return la taille du Nenuphar.
	 */
	public EtatNenuphar getEtat(){
		return etat;
	}
	/**
	 * Fonction qui fait vieillir le Nenuphar et reduit sa taille.
	 */
	public void viellir(){
		if (etat.ordinal()>0 ){
			etat = etats[etat.ordinal()-1];
		}
	}
	
	protected EtatNenuphar etat;		//Une valeur de l'enum representant la taille du Nenuphar.
	private final EtatNenuphar[] etats = EtatNenuphar.values();	//Une liste des valeurs de l'enum representant la taille du Nenuphar.
	protected int ligne, colonne;								// les coordonnees d'un Nenuphar.

}
