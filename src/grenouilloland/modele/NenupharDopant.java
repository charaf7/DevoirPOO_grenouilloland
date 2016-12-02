package grenouilloland.modele;

/**
 * Classe representant un Nenuphar Dopant.
 *
 * @author Alban Morin
 */
public class NenupharDopant extends Nenuphar{

	/**
	 * Constructeur logique.
	 * 
	 * @param ligne	represente la ligne ou se situe le Nenuphar.
	 * @param colonne represente la colonne ou se situe le Nenuphar.
	 * @param etat	represente la taille du Nenuphar.
	 */
	public NenupharDopant(int ligne, int colonne, EtatNenuphar etat) {
		super(ligne, colonne, etat);
	}

	/**
	 * @return le nom du Nenuphar.
	 */
	@Override
	public String nom() {
		return "Nenuphar Dopant";
	}

	/**
	 * @return la description de l'effet du Nenuphar.
	 */
	@Override
	public String description() {
		return "Double les points de vies de la grenouille et la soigne si elle est malade.";
	}

	/**
	 * @return le type de Nenuphar
	 */
	@Override
	public TypeNenuphar type() {
		return TypeNenuphar.Dopant;
	}

	/**
	 * Effet du Nenuphar sur la grenouille
	 */
	@Override
	public void effet(Grenouille g) {
		if(g.getMalade()){			//si grenouille malade
			g.setMalade(false);		// genouille soignee
		}
		g.setVies(g.getVies()*2);	// Points de vie *2
	}

}
