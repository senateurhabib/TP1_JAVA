package personnages;

public class Humain {
    private String nom;
    private String boissonFavorite;
    private int argent;

    public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
    }

    public void parler(String texte) {
        System.out.println("(" + nom + ") - " + texte);
    }

    public void direBonjour() {
        parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonFavorite + ".");
    }

    public void boire() {
        parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }

    public String getNom() {
        return nom;
    }

    public String getBoissonFavorite() {
        return boissonFavorite;
    }

    public int getArgent() {
        return argent;
    }

    public void gagnerArgent(int montant) {
        argent += montant;
    }

    public void perdreArgent(int montant) {
        argent -= montant;
    }
}
