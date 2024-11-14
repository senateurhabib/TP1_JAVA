package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {

    public Commercant(String nom, int argent) {
        super(nom, "thé", argent); // Le commerçant boit toujours du thé
    }

    public int seFaireExtorquer() {
        int argentPerdu = getArgent();
        perdreArgent(argentPerdu);
        parler("J’ai tout perdu! Le monde est trop injuste...");
        return argentPerdu;
    }

    public void recevoir(int argent) {
        gagnerArgent(argent);
        parler("Merci pour votre générosité !");
    }
}
