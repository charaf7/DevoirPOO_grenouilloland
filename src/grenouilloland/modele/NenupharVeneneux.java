package grenouilloland.modele;

/**
 * Classe representant un Nenuphar Veneneux.
 *
 * @author Alban Morin
 */
public class NenupharVeneneux extends Nenuphar {

	/**
	 * Constructeur logique.
	 * 
	 * @param ligne	represente la ligne ou se situe le Nenuphar.
	 * @param colonne represente la colonne ou se situe le Nenuphar.
	 * @param etat	represente la taille du Nenuphar.
	 */
	public NenupharVeneneux(int ligne, int colonne, EtatNenuphar etat) {
		super(ligne, colonne, etat);
	}

	/**
	 * @return le nom du Nenuphar.
	 */
	@Override
	public String nom() {
		return "Nenuphar Veneneux";
	}

	/**
	 * @return la description de l'effet du Nenuphar.
	 */
	@Override
	public String description() {
		return "Nenuphar qui divise par deux les points de vies de la grenouille "
				+ "et la rend malade. /n Si la grenouille est déja malade elle meurt.";
	}

	@Override
	public TypeNenuphar type() {
		return TypeNenuphar.Veneneux;
	}

	/**
	 * Effet du Nenuphar sur la grenouille
	 */
	@Override
	public void effet(Grenouille g) {
		if (g.getMalade()){		// Si grenouille malade
			g.setVies(0);		// mort par surinfection
		}
		else{
			g.setMalade(true);	//sinon grenouille malade
			g.setVies(g.getVies()/2);	// la grenouille perd la moitie de ses points de vie
		}
		
	}

}
