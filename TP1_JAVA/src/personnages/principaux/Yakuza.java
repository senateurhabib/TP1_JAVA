package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFavorite, int quantiteArgent, String clan) {
		super(nom, boissonFavorite, quantiteArgent);
		this.clan = clan;

	}

	public void extorquer(Commercant commercant) {
		int argentVole = commercant.getquantiteArgent();
		commercant.seFaireExtorquer();
		gagner_argent(argentVole);
		reputation++;
		parler("J’ai piqué le fric de " + commercant.getNom() + " et j’ai maintenant " + reputation
				+ " points de réputation.");
	}
	 public int getReputation() {
	        return reputation;
	    }

	public void gagner() {
		reputation++;
	}
	
	

	public int perdre() {
		int argentPerdu = getquantiteArgent();
		perdre_argent(argentPerdu);
		reputation--;
		parler("J’ai perdu mon duel et mes " + argentPerdu + " sous, snif...");
		return argentPerdu;
	}
	
	 @Override
	    public void direbonjour() {
	        super.direbonjour();
	        parler("Mon clan est celui de " + clan + ".");
	    }

}
