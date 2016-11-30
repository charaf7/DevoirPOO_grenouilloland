package grenouilloland.modele;
/**
 * 
 * @author Alban Morin
 *
 */
public class Grenouille {
	/**
	 * Constructeur de la classe Grenouille.
	 * @param vies repr�sente le nombre de vies de la grenouille au d�part
	 * @param malade repr�sente l'�tat de la grenouille au d�part
	 */
	public Grenouille(int vies, boolean malade){
		this.vies = vies;
		this.malade = malade;
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
	
	
private boolean malade;
private int vies;
}
