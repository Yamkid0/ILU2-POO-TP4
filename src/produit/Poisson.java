package produit;

public class Poisson extends Produit {
	String datePeche;
	
	public Poisson(String datePeche) {
		super("poisson",Unite.PIECE);
		this.datePeche = datePeche;
	}
	
	@Override
	public String decrireProduit() {
		return this.getNom() + " p�ch�s " + datePeche;
	}

	@Override
	public int calculerPrix(int prix) {
		return prix;
	}

}
