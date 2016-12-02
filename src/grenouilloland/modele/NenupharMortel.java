package grenouilloland.modele;

/**
 * Classe representant un Nenuphar Mortel.
 *
 * @author Alban Morin
 */
public class NenupharMortel extends Nenuphar{
	
	/**
	 * Constructeur logique.
	 * 
	 * @param ligne	represente la ligne ou se situe le Nenuphar.
	 * @param colonne represente la colonne ou se situe le Nenuphar.
	 * @param etat	represente la taille du Nenuphar.
	 */
	public NenupharMortel(int ligne, int colonne, EtatNenuphar etat) {
		super(ligne, colonne, etat);
	}

	/**
	 * @return le nom du Nenuphar.
	 */
	@Override
	public String nom() {
		return "Nenuphar Mortel";
	}

	/**
	 * @return la description de l'effet du Nenuphar.
	 */
	@Override
	public String description() {
		return "Tue instantanement la grenouille";
	}

	/**
	 * @return le type de Nenuphar
	 */
	@Override
	public TypeNenuphar type() {
		return TypeNenuphar.Mortel;
	}

	/**
	 * Effet du Nenuphar sur la grenouille
	 */
	@Override
	public void effet(Grenouille g) {
		g.setVies(0);	// tue la grenouille
	}

}
