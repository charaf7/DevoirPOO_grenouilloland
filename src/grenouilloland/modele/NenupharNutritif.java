package grenouilloland.modele;

public class NenupharNutritif extends Nenuphar{

	public NenupharNutritif(int ligne, int colonne, EtatNenuphar etat) {
		super(ligne, colonne, etat);
	}

	@Override
	public String nom() {
		return "Nenuphar Nutritif";
	}

	@Override
	public String description() {
		return "Guérit la grenouille si elle est malade et lui donne un Point de Vie supplementaire";
	}

	@Override
	public TypeNenuphar type() {
		return TypeNenuphar.Nutritif;
	}

	@Override
	public void effet(Grenouille g) {
		if(g.getMalade()){
			g.setMalade(false);
		}
		
		g.setVies(g.getVies()+1);
	}

}
