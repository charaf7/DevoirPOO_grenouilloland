package grenouilloland.modele;

public class NenupharImmortel extends Nenuphar {
	
	
	public NenupharImmortel(int ligne, int colonne, EtatNenuphar etat) {
		super(ligne, colonne, etat);
	}

	@Override
	public String nom() {
		return "Nenuphar Immortel";
	}

	@Override
	public String description() {
		return "Points de D�part et d'Arriv�e de la Grenouille";
	}

	@Override
	public TypeNenuphar type() {
		return TypeNenuphar.Immortel;
	}

	@Override
	public void effet(Grenouille g) {
		// Le Nenuphar Immortel n'a pas d'effet sur la grenouille 

	}
	
	@Override
	public void viellir(){
				// Le Nenuphar Immortel ne viellit pas
	}

}
