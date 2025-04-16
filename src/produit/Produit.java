package produit;

public abstract class Produit {
	
	private String nom;
	protected Unite unite;
	
	protected Produit(String nom, Unite unite) {
		this.nom = nom;
		this.unite = unite;
	}
	
	public String getNom() {
		return nom;
	}
	
	public abstract void decrireProduit();
	

}