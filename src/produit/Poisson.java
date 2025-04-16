package produit;

import personnages.Gaulois;

public class Poisson extends Produit {
	private String datePeche;
	
	
	public Poisson(String datePeche) {
		super("poisson", Unite.PIECE);
		this.datePeche = datePeche;
	}

	public void decrireProduit() {
		System.out.println("poisson pêché "+datePeche);	
	}

}