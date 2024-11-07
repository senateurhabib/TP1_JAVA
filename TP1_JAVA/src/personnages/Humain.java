package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int quantiteArgent;
	
	public Humain(String nom , String boissonFavorite , int quantiteArgent ) {
		this.nom = nom;
		this.boissonFavorite  = boissonFavorite;
		this.quantiteArgent = quantiteArgent;
	}
	
	public void parler(String texte) {
		System.out.println("(<" +nom+ ")-"+texte);
	}
	
	public void direbonjour() {
		parler("Bonjour ! Je m’appelle" + nom+ "et j’aime boire du" + boissonFavorite);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de"+boissonFavorite+"! GLOUPS !");
	}
	public String getNom(){
		return nom;
	}
	public String getBoisson() {
		return boissonFavorite;
	}
	public int getquantiteArgent() {
		return quantiteArgent;
	}
	public void gagner_argent(int montant ) {
		quantiteArgent+=montant;
		
	}
	public void perdre_argent(int montant) {
		quantiteArgent-=montant;
		
	}
	
	

}
