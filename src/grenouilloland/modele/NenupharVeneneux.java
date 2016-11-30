package grenouilloland.modele;

public class NenupharVeneneux extends Nenuphar {

	public NenupharVeneneux(int ligne, int colonne, EtatNenuphar etat) {
		super(ligne, colonne, etat);
	}

	@Override
	public String nom() {
		return "Nenuphar Veneneux";
	}

	@Override
	public String description() {
		return "Nenuphar qui divise par deux les points de vies de la grenouille "
				+ "et la rend malade. /n Si la grenouille est déja malade elle meurt.";
	}

	@Override
	public TypeNenuphar type() {
		return TypeNenuphar.Veneneux;
	}

	@Override
	public void effet(Grenouille g) {
		if (g.getMalade()){
			g.setVies(0);
		}
		else{
			g.setMalade(true);
			g.setVies(g.getVies()/2);
		}
		
	}

}
