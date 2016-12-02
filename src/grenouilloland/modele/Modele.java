package grenouilloland.modele;

public class Modele {

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

	public void chemin() {
		if (grenouille.ligne == 0) {
			for (int j = 0; j < resolution; j++) {
				mare[0][j] = remplaceNenuphar(mare[0][j]);
			}
		} else if (grenouille.colonne == resolution - 1) {
			for (int i = 0; i < resolution; i++) {
				mare[i][resolution - 1] = remplaceNenuphar(mare[i][resolution - 1]);
			}
		} else {
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

	public Nenuphar remplaceNenuphar(Nenuphar n) {
		if (n.type() == TypeNenuphar.Eau) {
			return RandomNenuphar(n.getLigne(), n.getColonne());
		}
		return n;
	}

	public Nenuphar RandomNenuphar(int ligne, int colonne) {

		switch ((int) (1 + (Math.random() * (5)))) {

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

	public void Sauter(int ligne, int colonne) {
		grenouille.saute(mare[ligne][colonne]);

	}

	public int resolution() {
		return resolution;
	}

	public int getVies() {
		return grenouille.getVies();
	}

	public boolean IsGrenouilleMalade() {
		return grenouille.getMalade();
	}

	public Nenuphar nenupharAt(int ligne, int colonne) {
		return mare[ligne][colonne];
	}

	public final int lireResolutionMin() {
		return 4;
	}

	public final int lireResolutionMax() {
		return 10;
	}

	protected Grenouille grenouille;
	protected Nenuphar[][] mare;
	protected int resolution = 4; // valeur de la résolution par defaut

}
