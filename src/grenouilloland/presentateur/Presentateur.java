package grenouilloland.presentateur;

import grenouilloland.modele.Modele;
import grenouilloland.modele.TypeNenuphar;
import grenouilloland.vue.Vue;

public class Presentateur {

	public Presentateur(){
		
	}
	
	public void nouveauModele(int resolution){
		modele = new Modele(resolution);
	}
	
	public void reinitialiser(){
		//
	}
	
	public void lancer(){
		//
	}
	
	public void changerEtat(int ligne, int colonne){
		//
	}
	
	public void suivante(){
		//
	}
	
	public int resolution() {
		return modele.resolution();
	}
	
	public TypeNenuphar type(int ligne, int colonne) {
		//return modele.type(ligne, colonne);
	}
	
	public boolean IsGrenouilleMalade(){
		return modele.IsGrenouilleMalade();
	}
	
	public int lireResolutionMin(){
		//
	}
	
	public int lireResolutionMax(){
		//
	}
	
	public int lirePoints(){
		return modele.getVies();
	}
	
	protected Modele modele;
}
