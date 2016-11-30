package grenouilloland.modele;

public class NenupharMortel extends Nenuphar{

	public NenupharMortel(int ligne, int colonne, EtatNenuphar etat) {
		super(ligne, colonne, etat);
	}

	@Override
	public String nom() {
		return "Nenuphar Mortel";
	}

	@Override
	public String description() {
		return "Tue instantanement la grenouille";
	}

	@Override
	public TypeNenuphar type() {
		return TypeNenuphar.Mortel;
	}

	@Override
	public void effet(Grenouille g) {
		g.setVies(0);
	}

}
