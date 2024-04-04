public class Main {
    public static void main(String[] args) {
        // Création d'objets de différents types de véhicules
        Voiture voiture = new Voiture("BMW", 50000, "Série 3", 2022);
        Moto moto = new Moto("Harley Davidson", 15000, "Sportster", 1200);
        Avion avion = new Avion("Airbus A320", 10000000, "Air France", 900);

        // Appel de la méthode emettreSon pour chaque véhicule
        voiture.emettreSon();
        moto.emettreSon();
        avion.emettreSon();

        // Affichage des informations pour chaque véhicule
        System.out.println("\nInformations sur la voiture :");
        voiture.afficherInformations();

        System.out.println("\nInformations sur la moto :");
        moto.afficherInformations();

        System.out.println("\nInformations sur l'avion :");
        avion.afficherInformations();
    }
}
