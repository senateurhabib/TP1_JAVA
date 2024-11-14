package personnages.principaux;

import personnages.Humain;

public class Yakuzas extends Humain {
    private String clan;
    private int reputation = 0;

    public Yakuzas(String nom, String boissonFavorite, int argent, String clan) {
        super(nom, boissonFavorite, argent);
        this.clan = clan;
    }

    @Override
    public void direBonjour() {
        super.direBonjour();
        parler("Mon clan est celui de " + clan + ".");
    }

    public void extorquer(Commercant commercant) {
        int argentExtorque = commercant.seFaireExtorquer();
        gagnerArgent(argentExtorque);
        reputation++;
        parler("J'ai extorqué " + argentExtorque + " sous à " + commercant.getNom() + ".");
    }

    public void gagner() {
        reputation++;
        parler("Victoire ! Ma réputation augmente !");
    }

    public int perdre() {
        int argentPerdu = getArgent();
        perdreArgent(argentPerdu);
        reputation--;
        parler("J'ai perdu mon duel et mes " + argentPerdu + " sous... snif.");
        return argentPerdu;
    }

    public int getReputation() {
        return reputation;
    }
}
