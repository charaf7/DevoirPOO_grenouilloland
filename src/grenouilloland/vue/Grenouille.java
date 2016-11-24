package grenouilloland.vue;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import grenouilloland.modele.EtatGrenouille;
import grenouilloland.presentateur.Presentateur;

public class Grenouille extends JLabel{

	public Grenouille(MareGraphique mareGraphique,int ligne,int colonne){
		this.mareGraphique = mareGraphique;
		this.ligne = ligne;
		this.colonne = colonne;
		this.setIcon(grenouille);
		mettreAJour();
	}
	
	public void mettreAJour(){
		final Vue vue = mareGraphique.lireVue();
		final Presentateur presentateur = vue.lirePresentateur();
		final EtatGrenouille etat = presentateur.etatGrenouille();
		
		if(etat==EtatGrenouille.Sick){
			setIcon(sickGrenouille);
		}
		if(etat==EtatGrenouille.Sound){
			setIcon(grenouille);
		}
	}
	
	
	public  ImageIcon grenouille;
	{
	ClassLoader loader = ViePoints.class.getClassLoader();
	URL url = loader.getResource("ressources/images/grenouille.png");
	grenouille = new ImageIcon(url);
	}
	
	public  ImageIcon sickGrenouille;
	{
	ClassLoader loader = ViePoints.class.getClassLoader();
	URL url = loader.getResource("ressources/images/grenouille-rouge-96x57.png");
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
