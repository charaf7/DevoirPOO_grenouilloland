package grenouilloland.modele;

/**
 * Classe representant une case d'eau.
 * 
 * @note considéré comme Nenuphar pour l'integrer au tableau qui represente la mare.
 *
 * @author Alban Morin
 */
public class Eau extends Nenuphar {

	/**
	 * Constructeur logique.
	 * 
	 * @param ligne	represente la ligne ou se situe le Nenuphar.
	 * @param colonne represente la colonne ou se situe le Nenuphar.
	 * @param etat	represente la taille du Nenuphar.
	 * 
	 * @note l'eau possede un etat particulier car cette case n'evolue pas avec le temps.
	 */
	public Eau(int ligne, int colonne, EtatNenuphar etat) {
		super(ligne, colonne, etat);
	}

	/**
	 * @return le nom du Nenuphar.
	 */
	@Override
	public String nom() {
		return "Eau";
	}

	/**
	 * @return la description de l'effet du Nenuphar.
	 */
	@Override
	public String description() {
		return "Case ou la grenouille meurt instantanée (dévorée par un des brochets)";
	}

	/**
	 * @return le type de Nenuphar.
	 */
	@Override
	public TypeNenuphar type() {
		return TypeNenuphar.Eau;
	}

	/**
	 * Effet du Nenuphar sur la grenouille.
	 */
	@Override
	public void effet(Grenouille g) {
		g.setVies(0);	// tue la grenouille.
		
	}

}
