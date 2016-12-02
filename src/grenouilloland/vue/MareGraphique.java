package grenouilloland.vue;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import grenouilloland.modele.TypeNenuphar;
import grenouilloland.presentateur.Presentateur;

public class MareGraphique extends JPanel {

	/**
	 * Constructeur logique.
	 */
	public MareGraphique(Vue vue) {

		this.vue = vue;
		final Presentateur presentateur = vue.lirePresentateur();
		final int resolution = presentateur.lireResolution();

		// Creation des nenuphars.
		nenuphars = new NenupharGraphique[resolution][resolution];
		for (int i = 0; i < resolution; i++) {
			for (int j = 0; j < resolution; j++) {
				nenuphars[i][j] = new NenupharGraphique(this, TypeNenuphar.Eau, i, j);
			}
		}
		nenupharsImmortel1 = new NenupharGraphique(this, TypeNenuphar.Immortel, resolution - 1, 0);
		nenupharsImmortel2 = new NenupharGraphique(this, TypeNenuphar.Immortel, 0, resolution - 1);

		// creation de la grenouille et la mettre dans la position initiale.
		grenouille = new GrenouilleGraphique(this, resolution, 1);

	}

	/**
	 * Mettre a jour toutes les nenuphars du modele.
	 */
	protected void mettreAJour() {
		for (int i = 0; i < nenuphars.length; i++) {
			for (int j = 0; j < nenuphars.length; j++) {
				nenuphars[i][j].mettreAJour();
			}
		}
	}

	/**
	 * Affichage du fond d'ecran eau par defaut.
	 */
	protected void afficherEau(Graphics gc) {
		final Dimension dimension = getSize();
		final int largeur = eauPic.getWidth(null);
		final int hauteur = eauPic.getHeight(null);
		int ligne = 0;
		int colonne = 0;
		while (ligne < dimension.height) {
			while (colonne < dimension.width) {
				gc.drawImage(eauPic, colonne, ligne, null);
				colonne += largeur;
			}
			colonne = 0;
			ligne += hauteur;
		}
	}

	@Override
	protected void paintComponent(Graphics gc) {
		super.paintComponent(gc);
		afficherEau(gc);
	}

	/**
	 * Chemin du fond d'ecran 'eau'.
	 */
	protected static final String eauPicLink = "icones/mosaique.jpg";

	/**
	 * le fond d'ecran.
	 */
	protected static final Image eauPic;
	static {
		ClassLoader loader = MareGraphique.class.getClassLoader();
		java.net.URL url = loader.getResource(eauPicLink);
		eauPic = (new ImageIcon(url)).getImage();
	}

	public Vue lireVue() {
		return vue;
	}

	protected final Vue vue;
	protected final NenupharGraphique[][] nenuphars;
	protected final GrenouilleGraphique grenouille;

	private NenupharGraphique nenupharsImmortel1;
	private NenupharGraphique nenupharsImmortel2;

}
