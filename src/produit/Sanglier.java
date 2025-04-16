package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;
	
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier", Unite.KILOGRAMME);
		this.poids = poids;
		this.chasseur = chasseur;
	}


	@Override
	public void decrireProduit() {
		System.out.println("sanglier de "+poids+""+unite+" chassé par "+chasseur.getNom());
		
	}

}