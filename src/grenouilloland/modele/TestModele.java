package grenouilloland.modele;

public class TestModele {
	
	public static void main(String Args[]){
		Modele modele = new Modele(4);
		System.out.println("Modele créé");
		
		System.out.println(modele.toString());
		
		System.out.println();
		System.out.println(modele.grenouille.ligne +" "+modele.grenouille.colonne);
		
		modele.chemin();
		System.out.println(modele.toString());
		
		/*modele.grenouille.ligne=0;
		
		modele.chemin();
		System.out.println(modele.toString());*/
		
		modele.grenouille.saute(modele.mare[3][1]);
		modele.grenouille.saute(modele.mare[3][2]);
		modele.grenouille.saute(modele.mare[3][3]);
		
		modele.chemin();
		System.out.println(modele.toString());

	
	}

}
