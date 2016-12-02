package grenouilloland.modele;
/**
 * Represente la Grenouille.
 * 
 * @author Alban Morin
 */
public class Grenouille {
	/**
	 * Constructeur de la classe Grenouille.
	 * @param ligne repr�sente la ligne sur laquelle la grenouille se situe.
	 * @param colonne repr�sente la colonne sur laquelle la grenouille se situe.
	 * @param nenupharActuel repr�sente le n�nuphar de d�part de la grenouille.
	 */
	public Grenouille(int ligne, int colonne,Nenuphar nenupharActuel){
		this.ligne = ligne;
		this.colonne = colonne;
		this.nenupharActuel = nenupharActuel;
	}
	
	/**
	 * Modifieur.
	 * @param malade true si la grenouille tombe malade, false si elle est soignee.
	 */
	public void setMalade(boolean malade){
		this.malade = malade;
		}
	/**
	 * Accesseur.
	 * @return true si la grenouille est malade, false sinon.
	 */
	public boolean getMalade(){
		return malade;
		}
	/**
	 * Modifieur.
	 * @param vies le nombre de point de vie a attribuer a la grenouille.
	 */
	public void setVies(int vies){
		this.vies = vies;
		}
	/**
	 * Accesseur.
	 * @return le nombre de points de vie de la grenouille.
	 */
	public int getVies(){
		return vies;
		}
	
	
	/**
	 * Deplace la grenouille si le Nenuphar est adjacent a la grenouille et que celle ci est en vie.
	 * Active l'effet du Nenuphar apr�s deplacement.
	 * @param nenuphar est le Nenuphar cible.
	 */
	public void saute(Nenuphar nenuphar){
		if(Math.abs(ligne-nenuphar.ligne)+ Math.abs(colonne-nenuphar.colonne)==1 && vies>0){ //test adjacence et points de vies.
			this.ligne = nenuphar.ligne;
			this.colonne =nenuphar.colonne;
			nenupharActuel=nenuphar; 		//change de Nenuphar.
			nenupharActuel.effet(this);		//applique l'effet du Nenuphar.
		}
	}
	
	
private boolean malade = false;		// true si malade, false sinon.
private int vies = 1;				// points de vie (initialis�s a 1).
protected int ligne, colonne;		// coordonnees de la grenouille.
protected Nenuphar nenupharActuel;	// le Nenuphar sur lequel la grenouille se trouve.
}
