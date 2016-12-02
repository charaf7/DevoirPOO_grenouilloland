package grenouilloland.modele;

/**
 * Classe representant un Nenuphar Immortel.
 *
 * @author Alban Morin
 */
public class NenupharImmortel extends Nenuphar {
	
	/**
	 * Constructeur logique.
	 * 
	 * @param ligne	represente la ligne ou se situe le Nenuphar.
	 * @param colonne represente la colonne ou se situe le Nenuphar.
	 * @param etat	represente la taille du Nenuphar.
	 */
	public NenupharImmortel(int ligne, int colonne, EtatNenuphar etat) {
		super(ligne, colonne, etat);
	}

	/**
	 * @return le nom du Nenuphar.
	 */
	@Override
	public String nom() {
		return "Nenuphar Immortel";
	}

	/**
	 * @return la description de l'effet du Nenuphar.
	 */
	@Override
	public String description() {
		return "Points de Départ et d'Arrivée de la Grenouille";
	}

	/**
	 * @return le type de Nenuphar
	 */
	@Override
	public TypeNenuphar type() {
		return TypeNenuphar.Immortel;
	}

	/**
	 * Effet du Nenuphar sur la grenouille
	 */
	@Override
	public void effet(Grenouille g) {
		// Le Nenuphar Immortel n'a pas d'effet sur la grenouille 
	}
	
	/**
	 * Modification du vieillisement du Nenuphar
	 */
	@Override
	public void viellir(){
				// Le Nenuphar Immortel ne viellit pas
	}

}
