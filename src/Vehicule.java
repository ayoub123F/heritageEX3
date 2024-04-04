public class Vehicule {
    private String nom;
    private double prix;

    // Constructeur avec paramètres
    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    // Méthode emettreSon
    public void emettreSon() {
        System.out.println("Le véhicule émet un son inconnu.");
    }

    // Méthode afficherInformations
    public void afficherInformations() {
        System.out.println("Nom du véhicule : " + nom);
        System.out.println("Prix du véhicule : " + prix);
    }
}
