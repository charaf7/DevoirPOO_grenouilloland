package grenouilloland.modele;


public class Modele {
	
	public Modele(int resolution){
		this.resolution = resolution;
		mare = new Nenuphar [resolution][resolution];
		
		for (int i = 0; i < resolution; i ++) {
		    for (int j = 0; j < resolution; j ++) {
			mare[i][j] = new Eau(i,j,EtatNenuphar.Eau);
		    }
		}	
		
		mare[0][resolution-1] = new NenupharImmortel(0, resolution-1, EtatNenuphar.Grand);
		mare[resolution-1][0] = new NenupharImmortel(resolution-1, 0, EtatNenuphar.Grand);
		grenouille = new Grenouille(1,false);
	}
	
	protected Grenouille grenouille;
	protected Nenuphar[][] mare;
	protected int resolution ;
   
}
