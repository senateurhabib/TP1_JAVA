package personnages.principaux;

import personnages.Humain;

public class Ronins extends Humain {
    private int honneur = 1;

    public Ronins(String nom, int quantiteArgent, String boissonFavorite) {
        super(nom, boissonFavorite, quantiteArgent);
    }

    public void donner(int montant, Commercant commercant) {
    	perdre_argent(montant);
        commercant.recevoir(montant);
        parler("Tiens " + commercant.getNom() + ", voilà " + montant + " sous.");
    }

    
    public void provoquer(Yakuza yakuza) {
        if (2 * honneur > yakuza.getReputation()) { // On compare l'honneur du Ronin à la réputation du Yakuza
            int argentGagne = yakuza.perdre(); // Le Yakuza perd et le Ronin prend son argent
            gagner_argent(argentGagne);
            honneur++;
            parler("Je t’ai eu, petit yakuza !");
        } else {
            honneur--;
            parler("J’ai perdu face à " + yakuza.getNom() + "...");
            yakuza.gagner(); // Le Yakuza gagne en réputation
        }
    }

    
    }

