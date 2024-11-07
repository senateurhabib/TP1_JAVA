package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain{
	public Commercant(String nom, int quantiteArgent) {
		super(nom,"thé",quantiteArgent);
	}
	
public int seFaireExtorquer() {
	int n = getquantiteArgent();
	parler("J’ai tout perdu ! Le monde est trop injuste...");
	
	perdre_argent(n);
	return n;
	
}

public void recevoir(int argent) {
	gagner_argent(argent);
    parler("Je te remercie généreux donateur !");
    
}
}
