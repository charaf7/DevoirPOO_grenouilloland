package grenouilloland.modele;

/**
 * Le modele de l'application.
 * @author Alban Morin
 *
 */
public class Modele {

	/**
	 * Constructeur logique
	 * 
	 * Cree la mare, la remplie d'eau et pose les Nenuphars Immortels et la grenouille.
	 * @param resolution la resolution de la mare.
	 */
	public Modele(int resolution) {
		this.resolution = resolution;
		mare = new Nenuphar[resolution][resolution];

		for (int i = 0; i < resolution; i++) {
			for (int j = 0; j < resolution; j++) {
				mare[i][j] = new Eau(i, j, EtatNenuphar.Eau);
			}
		}
		mare[0][resolution - 1] = new NenupharImmortel(0, resolution - 1, EtatNenuphar.Grand);
		mare[resolution - 1][0] = new NenupharImmortel(resolution - 1, 0, EtatNenuphar.Grand);
		grenouille = new Grenouille(resolution - 1, 0, mare[resolution - 1][0]);
	}
	/**
	 * Cree un chemin pour la grenouille jusqu'au Nenuphar Immortel d'arrivee, de sorte a dessiner un rectangle ou une ligne entre la grenouille et ce Nenuphar
	 */
	public void chemin() {
		if (grenouille.ligne == 0) {	//cas de la grenouille et du Nenuphar Immortel alignes Horizontalement.
			for (int j = 0; j < resolution; j++) {
				mare[0][j] = remplaceNenuphar(mare[0][j]);
			}
		} else if (grenouille.colonne == resolution - 1) {//cas de la grenouille et du Nenuphar Immortel alignes Verticalement.
			for (int i = 0; i < resolution; i++) {
				mare[i][resolution - 1] = remplaceNenuphar(mare[i][resolution - 1]);
			}
		} else { // cas sans alignement (dessin du rectangle.
			for (int i = 0; i < resolution; i++) {
				mare[i][grenouille.colonne] = remplaceNenuphar(mare[i][grenouille.colonne]);
				mare[i][resolution - 1] = remplaceNenuphar(mare[i][resolution - 1]);
			}

			for (int j = 0; j < resolution; j++) {
				mare[grenouille.ligne][j] = remplaceNenuphar(mare[grenouille.ligne][j]);
				mare[0][j] = remplaceNenuphar(mare[0][j]);
			}
		}
	}
/**
 * Remplace le Nenuphar en parametre par un Nenuphar aléatoire si le parametre est de l'eau.
 * @param n	le Nenuphar a tester.
 * @return
 */
	public Nenuphar remplaceNenuphar(Nenuphar n) {
		if (n.type() == TypeNenuphar.Eau) {
			return RandomNenuphar(n.getLigne(), n.getColonne());
		}
		return n;
	}
	
	/**
	 * Cree aléatoirement un Nenuphar autre que de l'eau ou un Immortel.
	 * @param ligne ligne du nouveau Nenuphar.
	 * @param colonne colonne du nouveau Nenuphar.
	 * @return	le nouveau Nenuphar.
	 */
	public Nenuphar RandomNenuphar(int ligne, int colonne) {

		switch ((int) (1 + (Math.random() * (5)))) {	// random parmi les 5 types de Nenuphar.

		case 1:
			return new NenupharNormal(ligne, colonne, EtatNenuphar.Grand);
		case 2:
			return new NenupharDopant(ligne, colonne, EtatNenuphar.Grand);
		case 3:
			return new NenupharMortel(ligne, colonne, EtatNenuphar.Grand);
		case 4:
			return new NenupharVeneneux(ligne, colonne, EtatNenuphar.Grand);
		case 5:
			return new NenupharNutritif(ligne, colonne, EtatNenuphar.Grand);
		default:
			return new NenupharNormal(ligne, colonne, EtatNenuphar.Grand);

		}
	}
	/**
	 * Renvoi la mare en chaine de caracteres sous forme de liste de Nenuphars.
	 */
	@Override
	public String toString() {
		String Smare = new String();

		for (int i = 0; i < resolution; i++) {
			for (int j = 0; j < resolution; j++) {
				Smare += mare[i][j].nom() + " ";
			}
			Smare += "\n";
		}
		return Smare;

	}
	
	/**
	 * Transmet l'appel à {@link Grenouille#saute(Nenuphar)}.
	 * @param ligne la ligne du Nenuphar.
	 * @param colonne la colonne du Nenuphar.
	 */
	public void Sauter(int ligne, int colonne) {
		grenouille.saute(mare[ligne][colonne]);

	}
	/**
	 * Accesseur.
	 * @return la valeur de la resolution du modele.
	 */
	public int resolution() {
		return resolution;
	}
	
	/**
	 * Accesseur.
	 * @return le nombre de vies de la grenouille.
	 */
	public int getVies() {
		return grenouille.getVies();
	}
	/**
	 * Accesseur.
	 * @return true si la grenouille est malade, false sinon.
	 */
	public boolean IsGrenouilleMalade() {
		return grenouille.getMalade();
	}
	
	/**
	 * Retourne le Nenuphar situé aux coordonnees.
	 * @param ligne la ligne du Nenuphar.
	 * @param colonne la colonne du Nenuphar.
	 * @return le Nenuphar situé aux coordonnees.
	 */
	public Nenuphar nenupharAt(int ligne, int colonne) {
		return mare[ligne][colonne];
	}
	
	/**
	 * Accesseur.
	 * @return la constante de resolution min.
	 */
	public final int lireResolutionMin() {
		return 4;
	}

	/**
	 * Accesseur.
	 * @return la constante de resolution max.
	 */
	public final int lireResolutionMax() {
		return 10;
	}
	
	protected Grenouille grenouille; // la grenouille.
	protected Nenuphar[][] mare;	// un tableau de Nenuphars representant la mare.
	protected int resolution = 4; // valeur de la résolution par defaut

}
