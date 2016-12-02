package grenouilloland.vue;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import grenouilloland.presentateur.Presentateur;

public class GrenouilleGraphique extends JLabel{

	public GrenouilleGraphique(MareGraphique mareGraphique,int ligne,int colonne){
		this.mareGraphique = mareGraphique;
		this.ligne = ligne;
		this.colonne = colonne;
		this.setIcon(grenouille);
		mettreAJour();
	}
	
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
	
	
	public  ImageIcon grenouille;
	{
	ClassLoader loader = ViePoints.class.getClassLoader();
	URL url = loader.getResource("icones/grenouille.gif");
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
