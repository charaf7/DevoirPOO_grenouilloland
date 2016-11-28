package grenouilloland.modele;


public class Modele {
	
	public Modele(int resolution){
		this.resolution = resolution;
		mare = new Nenuphar[resolution][resolution]
				
				/**public Modele(int resolution, Etat defaut) {
	grille = new Cellule[resolution][resolution];
	for (int i = 0; i < resolution; i ++) {
	    for (int j = 0; j < resolution; j ++) {
		grille[i][j] = new Cellule(i, j, defaut);
	    }
	}*/
	}
	
	protected Grenouille grenouille;
	protected Nenuphar[][] mare;
	protected int resolution ;
   
}
