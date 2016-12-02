package grenouilloland.modele;
/**
 * 
 * @author Alban Morin
 *
 */
public class Grenouille {
	/**
	 * Constructeur de la classe Grenouille.
	 * @param ligne représente la ligne sur laquelle la grenouille se situe
	 * @param colonne représente la colonne sur laquelle la grenouille se situe
	 * @param nenupharActuel représentele nénuphar de départ de la grenouille
	 */
	public Grenouille(int ligne, int colonne,Nenuphar nenupharActuel){
		this.ligne = ligne;
		this.colonne = colonne;
		this.nenupharActuel = nenupharActuel;
	}
	
	public void setMalade(boolean malade){
		this.malade = malade;
		}
	
	public boolean getMalade(){
		return malade;
		}
	
	public void setVies(int vies){
		this.vies = vies;
		}
	
	public int getVies(){
		return vies;
		}
	
	public void saute(Nenuphar nenuphar){
		if(Math.abs(ligne-nenuphar.ligne)+ Math.abs(colonne-nenuphar.colonne)==1){
			this.ligne = nenuphar.ligne;
			this.colonne =nenuphar.colonne;
			nenupharActuel=nenuphar;
			nenupharActuel.effet(this);
		}
	}
	
	
private boolean malade = false;
private int vies = 1;
protected int ligne, colonne;
protected Nenuphar nenupharActuel;
}
