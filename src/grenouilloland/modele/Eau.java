package grenouilloland.modele;

public class Eau extends Nenuphar {

	public Eau(int ligne, int colonne, EtatNenuphar etat) {
		super(ligne, colonne, etat);
	}

	@Override
	public String nom() {
		return "Eau";
	}

	@Override
	public String description() {
		return "Case ou la grenouille meurt instantanée (dévorée par un des brochets)";
	}

	@Override
	public TypeNenuphar type() {
		return TypeNenuphar.Eau;
	}

	@Override
	public void effet(Grenouille g) {
		g.setVies(0);
		
	}

}
