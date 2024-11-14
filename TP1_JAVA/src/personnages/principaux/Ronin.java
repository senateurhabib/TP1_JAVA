package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain {
    private int honneur = 1;

    public Ronin(String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent);
    }

    public void donner(int montant, Commercant commercant) {
        perdreArgent(montant);
        commercant.recevoir(montant);
        parler("Tiens, " + commercant.getNom() + ", voici " + montant + " sous.");
    }

    public void provoquer(Yakuzas yakuza) {
        if (honneur * 2 > yakuza.getReputation()) {
            int argentGagne = yakuza.perdre();
            gagnerArgent(argentGagne);
            honneur++;
            parler("Je t'ai vaincu, " + yakuza.getNom() + "!");
        } else {
            honneur--;
            parler("Je suis vaincu... Honneur en berne.");
            yakuza.gagner();
        }
    }
}
