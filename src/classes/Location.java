package classes;

import java.util.Scanner;

public class Location {
    private Voiture voiture;
    private Client client;
    private String dateDeDebut;
    private int duree;

    // Constructeur vide.
    public Location() {};

    // Constructeur avec paramètres.
    public Location(Voiture laVoiture, Client leClient, String dateDebut, int duree) {
        setVoiture(laVoiture);
        setClient(leClient);
        setDateDeDebut(dateDebut);
        setDuree(duree);
    }
    Scanner sc = new Scanner(System.in);

    // Méthode pour afficher le coût total de la location
    public int afficherCout() {
        return this.duree * this.voiture.getCoutJournalier();
    }

    // Getters...
    public Voiture getVoiture() {
        return voiture;
    }

    public Client getClient() {
        return client;
    }

    public String getDateDeDebut() {
        return dateDeDebut;
    }

    public int getDuree() {
        return duree;
    }

    // Setter...
    public void setVoiture(Voiture voiture) {this.voiture = voiture;}

    public void setClient(Client client) {this.client = client;}

    public void setDateDeDebut(String dateDeDebut) {
        this.dateDeDebut = dateDeDebut;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    // toString
    @Override
    public String toString() {
        return "Les infos de la location\n" +
                this.voiture + "\n" +
                this.client + "\n" +
                "Date de location: " + this.dateDeDebut + "\n" +
                "Coût total de la location: " + this.afficherCout();
    }

    // Autres méthodes pour setVoiture()
//    public void setVoiture() {
//        System.out.println("Veuiller sélectionner le numéro correspondant au type de voiture");
//        System.out.println("1.classes.Voiture simple\n2.Véhicule\n3.classes.VUS\n4.Camion\n5.Fourgonnette");
//        System.out.print("Entrez votre choix: ");
//        int choix = sc.nextInt();
//        switch (choix) {
//            case 1: this.voiture = setVoitureS();
//                break;
//            case 2: this.voiture = setVehicule();
//                break;
//            case 3: this.voiture = setVUS();
//                break;
//            case 4: this.voiture = setCamion();
//                break;
//            case 5: this.voiture = setFourgonnette();
//                break;
//        }
//
//    }
//
//    public void setClient() {
//        System.out.println("Veuiller sélectionner le numéro correspondant au type de client");
//        System.out.println("1.classes.Client régulier\n2.classes.Commercial");
//        System.out.print("Entrez votre choix: ");
//        int choix = sc.nextInt();
//        switch (choix) {
//            case 1: this.client = setClientS();
//                break;
//            case 2: this.client = setCommercial();
//                break;
//        }
//    }
//    // classes.Voiture simple
//    private classes.Voiture setVoitureS() {
//        System.out.println("Entrez les informations de la voiture");
//        System.out.print("Entrez la marque: ");
//        // Ceci est pour corriger l'exécution du sc.nextLine().
//        sc.nextLine();
//        String marque = sc.nextLine();
//        System.out.print("Entrez le modèle: ");
//        String modele = sc.nextLine();
//        System.out.print("Entrez l'année de fabrication: ");
//        String annee = sc.nextLine();
//        System.out.print("Entrez le coût journalier: ");
//        int cout = sc.nextInt();
//        System.out.print("Entrez le nombre de passagers: ");
//        int nbPass = sc.nextInt();
//        System.out.print("La voiture est automatique ? 1.Oui / 2.Non: ");
//        int choix = sc.nextInt();
//        boolean automatique;
//        automatique = choix == 1;
//        return new classes.Voiture(marque, modele, annee, cout, nbPass, automatique);
//    }
//    // Véhicule
//    private classes.Vehicules setVehicule() {
//        classes.Voiture laVoiture = setVoitureS();
//        TypeVehicules[] listeType = TypeVehicules.values();
//        System.out.println("Entrez le type de véhicule: ");
//        for (TypeVehicules s :  listeType) {
//            System.out.println("Type: " + s.name() + " - Choix: " + s.ordinal());
//        }
//        int numTypeVehicule = sc.nextInt();
//        String nomTypeVoiture = listeType[numTypeVehicule].name();
//        System.out.print("La véhicule est à essence ? 1.Oui / 2.Non: ");
//        int choix = sc.nextInt();
//        boolean essence;
//        essence = choix == 1;
//        return new classes.Vehicules(laVoiture.getMarque(), laVoiture.getModele(),  laVoiture.getAnneeDeFabrication(),
//                laVoiture.getCoutJournalier(), laVoiture.getNombrePassagers(), laVoiture.getAutomatique(), TypeVehicules.valueOf(nomTypeVoiture.toUpperCase()), essence);
//    }
//    // classes.VUS
//    private classes.VUS setVUS() {
//        classes.Voiture laVoiture = setVoitureS();
//        TypeVUS[] listeType = TypeVUS.values();
//        System.out.println("Entrez le type de classes.VUS: ");
//        for (TypeVUS s :  listeType) {
//            System.out.println("Type: " + s.name() + " - Choix: " + s.ordinal());
//        }
//        int numTypeVUS = sc.nextInt();
//        String nomTypeVUS = listeType[numTypeVUS].name();
//        System.out.print("Le classes.VUS à une transmission intégrale ? 1.Oui / 2.Non: ");
//        int choix = sc.nextInt();
//        boolean transmission = false;
//        transmission = choix == 1;
//        return new classes.VUS(laVoiture.getMarque(), laVoiture.getModele(),  laVoiture.getAnneeDeFabrication(),
//                laVoiture.getCoutJournalier(), laVoiture.getNombrePassagers(), laVoiture.getAutomatique(), TypeVUS.valueOf(nomTypeVUS.toUpperCase()), transmission);
//    }
//    // Camion
//    private classes.Camions setCamion() {
//        classes.Voiture laVoiture = setVoitureS();
//        System.out.println("Choisissez le numéro correspondant à la taille");
//        System.out.println("1.Petit\n2.Normal\n3.Gros");
//        System.out.print("Entrez votre choix: ");
//        int laTaille = sc.nextInt();
//        System.out.print("Entrez le nombre de roues motrices: ");
//        int uneRouesMotrices = sc.nextInt();
//        return new classes.Camions(laVoiture.getMarque(), laVoiture.getModele(),  laVoiture.getAnneeDeFabrication(),
//                laVoiture.getCoutJournalier(), laVoiture.getNombrePassagers(), laVoiture.getAutomatique(), laTaille, uneRouesMotrices);
//    }
//    // Fourgonnette
//    private classes.Fourgonnettes setFourgonnette() {
//        classes.Voiture laVoiture = setVoitureS();
//        System.out.println("Choisissez le numéro correspondant au type");
//        System.out.println("1.Passagers\n2.Utilitaire");
//        System.out.print("Entrez votre choix: ");
//        int leType = sc.nextInt();
//        return new classes.Fourgonnettes(laVoiture.getMarque(), laVoiture.getModele(),  laVoiture.getAnneeDeFabrication(),
//                laVoiture.getCoutJournalier(), laVoiture.getNombrePassagers(), laVoiture.getAutomatique(), leType);
//    }
//
//    // Autres méthode pour setClient()
//    // classes.Client régulier
//    private classes.Client setClientS() {
//        System.out.println("Entrez les informations du client");
//        System.out.print("Entrez le nom: ");
//        // Ceci est pour corriger l'exécution du sc.nextLine().
//        sc.nextLine();
//        String nom = sc.nextLine();
//        System.out.print("Entrez le prénom: ");
//        String prenom = sc.nextLine();
//        System.out.print("Entrez l'adresse: ");
//        String adresse = sc.nextLine();
//        System.out.print("Entrez le numéro de permis: ");
//        String numeroPermis = sc.nextLine();
//        System.out.print("Entrez le telephone: ");
//        String telephone = sc.nextLine();
//        return new classes.Client(nom, prenom, adresse, numeroPermis, telephone);
//    }
//    // classes.Commercial
//    private classes.Commercial setCommercial() {
//        classes.Client leClient = setClientS();
//        System.out.print("Entrez le numéro de compte: ");
//        String numeroCompte = sc.nextLine();
//        System.out.print("Entrez le nom de la compagnie: ");
//        String nomCompagnie = sc.nextLine();
//        System.out.print("Entrez le nom du responsable: ");
//        String nomResponsable = sc.nextLine();
//        return new classes.Commercial(leClient.getNom(), leClient.getPrenom(), leClient.getAdresse(),
//                leClient.getNumeroPermisDeConduire(), leClient.getTelephone(), numeroCompte, nomCompagnie,
//                nomResponsable);
//    }
}
