package villagegaulois;

import personnages.Gaulois;
import produit.IProduit;

public interface IEtal<P extends IProduit> {
	Gaulois getVendeur();
	int contientProduit(String produit, int quantiteSouhaitee);
	int acheterProduit(int quantiteSouhaitee);
	String etatEtal();
}
