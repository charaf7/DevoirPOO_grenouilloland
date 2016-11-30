package grenouilloland.modele;

public abstract class Nenuphar implements NenupharAbstrait{
	
	protected EtatNenuphar etat;
	private final EtatNenuphar[] etats = EtatNenuphar.values();
	protected int ligne, colonne;
	
	public Nenuphar (int ligne, int colonne, EtatNenuphar etat){
		this.ligne = ligne;
		this.colonne = colonne;
		this.etat = etat;
	}
	
	public int getLigne(){
		return ligne;
	}
	
	public int getColonne(){
		return colonne;
	}
	
	public void setEtat(EtatNenuphar etat){
		this.etat = etat;
	}
	
	public EtatNenuphar getEtat(){
		return etat;
	}
	
	public void viellir(){
		if (etat.ordinal()>0 ){
			etat = etats[etat.ordinal()-1];
		}
	}

}
