package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	int poids;
	Gaulois chasseur;
	
	public Sanglier(int poids, Gaulois chasseur) {
		super("sanglier",Unite.KILOGRAMME);
		this.poids = poids;
		this.chasseur = chasseur;
	}

	@Override
	public String decrireProduit() {
		return this.getNom() + " de " + poids + " kg chassé par " + chasseur.getNom();
	}

	@Override
	public int calculerPrix(int prix) {
		return prix * poids/1000;
	}
}
