package grenouilloland.vue;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollBar;
import javax.swing.JToolBar;

import grenouilloland.presentateur.Presentateur;

public class Vue extends JFrame{
	

	/**
     * Constructeur logique.
     */
    public Vue(Presentateur presentateur) {

    	this.presentateur = presentateur;
    	
    	setTitle(titre);
    	actionQuit = new ActionQuit(this);
    	
    	//la barre qui contient le menu et d'outils.
    	menu();
      	   	
    	// Instanciation de la barre de defilement qui controle la resolution.
    	final Resolution resolution =new Resolution(JScrollBar.HORIZONTAL, this);
    	add(resolution, BorderLayout.SOUTH);
    	
    	// Instanciation de la mare et son implantation
    	mareGraphique = new MareGraphique(this);
    	add(mareGraphique, BorderLayout.CENTER);
    	
    	//points de vie
    	final ViePoints viePoints = new ViePoints(this);
    	add(viePoints,BorderLayout.WEST);
    	
    	//chronometre
    	Chronometre chrono = new Chronometre(this);
    	add(chrono,BorderLayout.SOUTH);

    	// Positionnement initial de la fenetre au milieu de l'ecran.
    	setLocationRelativeTo(null);
	
    }
    
    protected void menu() {

    	final JMenuBar barreMenus = new JMenuBar();
    	final JToolBar barreOutils = new JToolBar();
    	
    	final JMenu menu = new JMenu("Commandes");

    	final ActionStart actionStart = new ActionStart(this);
    	menu.add(actionStart);
	
    	final ActionNew actionNew = new ActionNew(this);
    	menu.add(actionNew);

    	final ActionAbout actionAbout = new ActionAbout(this);
    	//ajout des actions dans le menu
    	menu.add(actionAbout);
    	//separateur dans le menu.
    	menu.addSeparator();
    	menu.add(actionQuit);

    	//ajout des actions dans la barre d'outils
    	barreOutils.add(actionStart);
    	barreOutils.add(actionNew);
    	barreOutils.add(actionAbout);
    	barreOutils.addSeparator();
    	barreOutils.add(actionQuit);
    	barreMenus.add(menu);
    	// Implantation de la barre de menus sous le titre de la fenetre.
    	setJMenuBar(barreMenus);
    	// Implantation de la barre d'outils
    	add(barreOutils, BorderLayout.NORTH);

    }
    
    protected void nouveauModele(int resolution) {
    	
    	//nouvelle mare faite par le presentateur.
    	presentateur.nouveauModele(resolution);

    	// Suppression de l'ancienne mare.
    	remove(mareGraphique);

    	// Instanciation du la nouvelle mare graphique et son implantation 
    	mareGraphique = new MareGraphique(this);
    	add(mareGraphique, BorderLayout.CENTER);

    	//calcule et reaffichage 
    	validate();
    	repaint();

    }
    
    /**
     * reinitialiser pour commencer une autre partie.
     */
    protected void reinitialiserV() {

    	//reinitialiser les nenuphars au niveau du presentateur.
    	presentateur.reinitialiser();
    	// Mise a jour de la mare.
    	mareGraphique.mettreAJour();
    }
    
    /**
     * lancer la partie
     */
    protected void lancerV(){
    	presentateur.lancer();
    }
    
    /**
     * changer l'etat d'un nenuphar
     */
    protected void changerEtatV(NenupharGraphique nenuphar) {

    	final int ligne = nenuphar.lireLigne();
    	final int colonne = nenuphar.lireColonne();

    	// Requete au presentateur pour modifier l'etat du nenuphar.
    	presentateur.vieillir();

    	// Mise a jour de la cellule graphique.
    	nenuphar.mettreAJour();
    }
        
    /**
     * passer a l'etape suivante
     */
    protected void suivanteV() {
    	
    	// Requete au presentateur pour calculer la generation suivante.
    	presentateur.suivante();
    	// Mise a jour de la mare.
    	mareGraphique.mettreAJour();
    }
    
    public static String lireTitre() {
    	return titre;
    }
	
	public Presentateur lirePresentateur(){
		return presentateur;
	}
	
	protected static final String titre = "Grenouilloland";
	protected MareGraphique mareGraphique;
	protected final Presentateur presentateur;
	protected final ActionQuit actionQuit;
}
