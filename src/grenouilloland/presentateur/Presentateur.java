package grenouilloland.presentateur;

import grenouilloland.modele.Modele;
import grenouilloland.modele.TypeNenuphar;
import grenouilloland.vue.Vue;

public class Presentateur {

	public Presentateur(int resolutionMin, int resolutionMax, int resolution){
		this.resolutionMin = resolutionMin;
		this.resolutionMax = resolutionMax;
		modele=new Modele(resolution);
		vue = new Vue(this);
		System.out.println(vue);
	}
	
	public void nouveauModele(int resolution){
		modele = new Modele(resolution);
	}
	
	public void reinitialiser(){
		//
	}
	
	public void lancer(){
		
		vue.pack();
		vue.setVisible(true);
	}
	
	public void vieillir(){
		//
	}
	
	public void suivante(){
		//
	}
	
	public void Sauter(int ligne, int colonne) {
		modele.Sauter(ligne, colonne);
	}
	
	public int lireResolution() {
		return modele.resolution();
	}
	
	public TypeNenuphar type(int ligne, int colonne) {
		return modele.nenupharAt(ligne, colonne).type();
	}
	
	public boolean IsGrenouilleMalade(){
		return modele.IsGrenouilleMalade();
	}
	
	public int lireResolutionMin(){
		return resolutionMin;
	}
	
	public int lireResolutionMax(){
		return resolutionMax;
	}
	
	public int lirePoints(){
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
