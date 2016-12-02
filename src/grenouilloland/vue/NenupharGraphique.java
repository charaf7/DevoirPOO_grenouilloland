package grenouilloland.vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.HashMap;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import grenouilloland.modele.TypeNenuphar;
import grenouilloland.presentateur.Presentateur;

public class NenupharGraphique extends JButton implements ActionListener {

	/**
     * Constructeur logique.
     */
	public NenupharGraphique(MareGraphique mareGraphique,TypeNenuphar type,int ligne,int colonne){
		this.mareGraphique=mareGraphique;
		this.ligne=ligne;
		this.colonne=colonne;
		this.type = type;
		
		//mise a jour de l'etat du nenuphar depuis celui du modele
		mettreAJour();
		addActionListener(this);	
	}
	
	@Override
    public void actionPerformed(ActionEvent evt) {
		mareGraphique.lireVue().lirePresentateur().Sauter(ligne,colonne);
		//mareGraphique.lireVue().changerEtatV(this);
    }
	
	protected void mettreAJour() {
		
		final Vue vue = mareGraphique.lireVue();
		final Presentateur presentateur = vue.lirePresentateur();
		final TypeNenuphar type = presentateur.type(ligne, colonne);

		// Mise a jour
		setIcon(types.get(type));
	}
	
	/**   
     * differentes types du nenuphar
     */
    protected static final HashMap< TypeNenuphar, ImageIcon > types;
    static {
	types = new HashMap< TypeNenuphar, ImageIcon >();
	
	final  ImageIcon eauIcone;
	ClassLoader loader = NenupharGraphique.class.getClassLoader();
	URL url = loader.getResource("icones/mosaique.jpg");
	eauIcone = new ImageIcon(url);
	types.put(TypeNenuphar.Eau,eauIcone);
	
	final  ImageIcon normalIcone;
	ClassLoader loader1 = NenupharGraphique.class.getClassLoader();
	URL url1 = loader1.getResource("icones/grand-nenuphare-vert-96x96.png");
	normalIcone = new ImageIcon(url1);
	types.put(TypeNenuphar.Normal,normalIcone);
   
    
    final  ImageIcon immortelIcone;
	ClassLoader loader2 = NenupharGraphique.class.getClassLoader();
	URL url2 = loader2.getResource("icones/grand-nenuphare-vert-96x96.png");
	immortelIcone = new ImageIcon(url2);
	types.put(TypeNenuphar.Immortel,immortelIcone);
	
	final  ImageIcon veneneuxIcone;
	ClassLoader loader3 = NenupharGraphique.class.getClassLoader();
	URL url3 = loader3.getResource("icones/grand-nenuphare-jaune-96x96.png");
	veneneuxIcone = new ImageIcon(url3);
	types.put(TypeNenuphar.Veneneux,veneneuxIcone);
	
	final  ImageIcon nutritifIcone;
	ClassLoader loader4 = NenupharGraphique.class.getClassLoader();
	URL url4 = loader4.getResource("icones/grand-nenuphare-rose-96x96.png");
	nutritifIcone = new ImageIcon(url4);
	types.put(TypeNenuphar.Nutritif,nutritifIcone);
	
	final  ImageIcon dopantIcone;
	ClassLoader loader5 = NenupharGraphique.class.getClassLoader();
	URL url5 = loader5.getResource("icones/grand-nenuphare-rose-96x96.png");
	dopantIcone = new ImageIcon(url5);
	types.put(TypeNenuphar.Dopant,dopantIcone);
	
	final  ImageIcon mortelIcone;
	ClassLoader loader6 = NenupharGraphique.class.getClassLoader();
	URL url6 = loader6.getResource("icones/grand-nenuphare-rose-96x96.png");
	mortelIcone = new ImageIcon(url6);
	types.put(TypeNenuphar.Mortel,mortelIcone);
	
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
	
	public TypeNenuphar lireTypeNenuphar(){
		return type;
	}
	protected final MareGraphique mareGraphique;
	protected final int ligne;
	protected final int colonne;
	protected TypeNenuphar type;
}
