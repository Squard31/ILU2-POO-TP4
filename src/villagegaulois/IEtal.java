package villagegaulois;

import personnages.Gaulois;
import produit.Produit;

public interface IEtal<P extends Produit> {

	Gaulois getVendeur();

	int contientProduit(String produit, int quantiteSouhaitee);

	int acheterProduit(int quantiteAcheter);

	/**
	 * 
	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
	 *         indiquant si l'�tal est occup� [1] : nom du vendeur [2] : produit
	 *         vendu [2] : quantit� de produit � vendre au d�but du march� [4] :
	 *         quantit� de produit vendu
	 */
	String etatEtal();

	void installerVendeur(Gaulois vendeur, P[] produit, int prix);
}