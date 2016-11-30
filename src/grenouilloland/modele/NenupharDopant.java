package grenouilloland.modele;

public class NenupharDopant extends Nenuphar{

	public NenupharDopant(int ligne, int colonne, EtatNenuphar etat) {
		super(ligne, colonne, etat);
	}

	@Override
	public String nom() {
		return "Nenuphar Dopant";
	}

	@Override
	public String description() {
		return "Double les points de vies de la grenouille et la soigne si elle est malade.";
	}

	@Override
	public TypeNenuphar type() {
		return TypeNenuphar.Dopant;
	}

	@Override
	public void effet(Grenouille g) {
		if(g.getMalade()){
			g.setMalade(false);
		}
		g.setVies(g.getVies()*2);
	}

}
