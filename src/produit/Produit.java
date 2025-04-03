package produit;

public abstract class Produit implements IProduit {
	String nom;
	Unite unite;
	
	Produit(String nom,Unite unite) {
		this.nom = nom;
		this.unite = unite;
	}
	
	@Override
	public String getNom() {
		return nom;
	}
}
