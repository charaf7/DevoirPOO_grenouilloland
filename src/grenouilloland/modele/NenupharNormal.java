package grenouilloland.modele;

public class NenupharNormal extends Nenuphar {

	
	public NenupharNormal(int ligne, int colonne, EtatNenuphar etat) {
		super(ligne, colonne, etat);
	}

	@Override
	public String nom() {
		return "Nenuphar Normal";
	}

	@Override
	public String description() {
		return "Nenuphar n'appliquant pas d'effet à la grenouille";
	}

	@Override
	public TypeNenuphar type() {
		return TypeNenuphar.Normal;
	}

	@Override
	public void effet(Grenouille g) {	}

}
