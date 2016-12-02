package grenouilloland.modele;

/**
 * Classe representant un Nenuphar Nutritif.
 *
 * @author Alban Morin
 */
public class NenupharNutritif extends Nenuphar{

	/**
	 * Constructeur logique.
	 * 
	 * @param ligne	represente la ligne ou se situe le Nenuphar.
	 * @param colonne represente la colonne ou se situe le Nenuphar.
	 * @param etat	represente la taille du Nenuphar.
	 */
	public NenupharNutritif(int ligne, int colonne, EtatNenuphar etat) {
		super(ligne, colonne, etat);
	}

	/**
	 * @return le nom du Nenuphar.
	 */
	@Override
	public String nom() {
		return "Nenuphar Nutritif";
	}

	/**
	 * @return la description de l'effet du Nenuphar.
	 */
	@Override
	public String description() {
		return "Guérit la grenouille si elle est malade et lui donne un Point de Vie supplementaire";
	}

	/**
	 * @return le type de Nenuphar
	 */
	@Override
	public TypeNenuphar type() {
		return TypeNenuphar.Nutritif;
	}

	/**
	 * Effet du Nenuphar sur la grenouille
	 */
	@Override
	public void effet(Grenouille g) {
		if(g.getMalade()){		//Si grenouille malade
			g.setMalade(false);	// grenouille soignée
		}
		g.setVies(g.getVies()+1);	// Ajout d'un point de vie
	}

}
