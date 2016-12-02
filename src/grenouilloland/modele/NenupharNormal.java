package grenouilloland.modele;

/**
 * Classe representant un Nenuphar Normal.
 *
 * @author Alban Morin
 */
public class NenupharNormal extends Nenuphar {

	/**
	 * Constructeur logique.
	 * 
	 * @param ligne	represente la ligne ou se situe le Nenuphar.
	 * @param colonne represente la colonne ou se situe le Nenuphar.
	 * @param etat	represente la taille du Nenuphar.
	 */
	public NenupharNormal(int ligne, int colonne, EtatNenuphar etat) {
		super(ligne, colonne, etat);
	}

	/**
	 * @return le nom du Nenuphar.
	 */
	@Override
	public String nom() {
		return "Nenuphar Normal";
	}

	/**
	 * @return la description de l'effet du Nenuphar.
	 */
	@Override
	public String description() {
		return "Nenuphar n'appliquant pas d'effet à la grenouille";
	}

	/**
	 * @return le type de Nenuphar
	 */
	@Override
	public TypeNenuphar type() {
		return TypeNenuphar.Normal;
	}

	/**
	 * Effet du Nenuphar sur la grenouille
	 */
	@Override
	public void effet(Grenouille g) { // le Nenuphar normal n'as pas d'effet sur la grenouille
	}

}
