package classes;

import enums.TypeVUS;
import enums.TypeVehicules;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choix = 0;
        int nbreLocations = 0;
        // Tableau des locations.
        Location[] listeLocation = new Location[5];

        // 4 listes de 4 voitures chacun.
        //Ajout des Véhicules
        // Commentaire des lignes dans le try (le même schéma est reproduit pour tout les types de voitures).
        // 1ère ligne: Création d'une instance File (built-in Java) avec le fichier fileOfVehicules.txt en spécifiant le chemin d'accès (path).
        // 2ème ligne: Lecture de l'instance avec un Scanner qui ouvre le fichier.
        // 3ème ligne: Exécuter les lignes tant que le fichier n'est pas à la fin (à une ligne suivante non nulle).
        // 4ème ligne: La ligne courante est lue et stockée dans une variable data.
        // 5ème ligne: Un tableau split est crée et rempli avec tout les éléments de la ligne courante(data) séparés par une virgule avec une limite de 8 éléments.
        // 6ème ligne: Creation et ajout d'une voiture(Vehicules) dans la liste de véhicules(listeVehicule).
        // 7ème ligne: Fermeture du fichier ouvert par le scanner a la ligne 2.
        ArrayList<Vehicules> listeVehicule = new ArrayList<>();
        try {
            File monFichier = new File("src/files/fileOfVehicules.txt");
            Scanner lecture = new Scanner(monFichier);
            while (lecture.hasNextLine()) {
                String data = lecture.nextLine();
                String[] split = data.split(",",8);
                listeVehicule.add(new Vehicules(split[0], split[1], split[2], Integer.parseInt(split[3]), Integer.parseInt(split[4]),
                        Boolean.parseBoolean(split[5]), TypeVehicules.valueOf(split[6].toUpperCase()), Boolean.parseBoolean(split[7])));
            }
            lecture.close();
        } catch (FileNotFoundException e) {
            System.out.println("Une erreur est survenue: " + e);
            e.printStackTrace();
        }

        //Ajout des VUS
        ArrayList<VUS> listeVUS = new ArrayList<>();
        try {
            File monFichier = new File("src/files/fileOfVUS.txt");
            Scanner lecture = new Scanner(monFichier);
            while (lecture.hasNextLine()) {
                String data = lecture.nextLine();
                String[] split = data.split(",",8);
                listeVUS.add(new VUS(split[0], split[1], split[2], Integer.parseInt(split[3]), Integer.parseInt(split[4]),
                        Boolean.parseBoolean(split[5]), TypeVUS.valueOf(split[6].toUpperCase()), Boolean.parseBoolean(split[7])));
            }
            lecture.close();
        } catch (FileNotFoundException e) {
            System.out.println("Une erreur est survenue: " + e);
            e.printStackTrace();
        }

        //Ajout des Camions
        ArrayList<Camions> listeCamion = new ArrayList<>();
        try {
            File monFichier = new File("src/files/fileOfCamions.txt");
            Scanner lecture = new Scanner(monFichier);
            while (lecture.hasNextLine()) {
                String data = lecture.nextLine();
                String[] split = data.split(",",8);
                listeCamion.add(new Camions(split[0], split[1], split[2], Integer.parseInt(split[3]), Integer.parseInt(split[4]),
                        Boolean.parseBoolean(split[5]), Integer.parseInt(split[6]), Integer.parseInt(split[7])));
            }
            lecture.close();
        } catch (FileNotFoundException e) {
            System.out.println("Une erreur est survenue: " + e);
            e.printStackTrace();
        }

        //Ajout des fourgonnettes
        ArrayList<Fourgonnettes> listeFourgonnette = new ArrayList<>();
        try {
            File monFichier = new File("src/files/fileOfFourgonnettes.txt");
            Scanner lecture = new Scanner(monFichier);
            while (lecture.hasNextLine()) {
                String data = lecture.nextLine();
                String[] split = data.split(",",7);
                listeFourgonnette.add(new Fourgonnettes(split[0], split[1], split[2], Integer.parseInt(split[3]), Integer.parseInt(split[4]),
                        Boolean.parseBoolean(split[5]), Integer.parseInt(split[6])));
            }
            lecture.close();
        } catch (FileNotFoundException e) {
            System.out.println("Une erreur est survenue: " + e);
            e.printStackTrace();
        }

        // Liste des clients.
        ArrayList<Client> listeClient = new ArrayList<>();
        listeClient.add(new Client("Touman", "Koffi", "16 Rue AFG, Lomé-TOGO", "4738", "1234000"));
        listeClient.add(new Client("Lafleur", "Jean", "96 Arr Paris-Françe", "8922", "0123423"));
        listeClient.add(new Client("Coulybali", "Souley", "23 Rue Medina, Dakar-Sénégal", "3490", "1456800"));
        listeClient.add(new Client("Mouani", "Fiin", "108 Av Khôm, Zooland-Youpi", "3490", "1245550"));
        listeClient.add(new Client("Soumey", "Faam", "42 Arr Pitch, Soum-Seum", "3490", "5840234"));

        // Liste des commercials
        ArrayList<Commercial> listeCommercial = new ArrayList<>();
        listeCommercial.add(new Commercial("Babana", "DeSBeach", "50 Rue Forest, G4X 2G2", "3453", "0001234", "5342", "A.K.A Corp", "Touman"));
        listeCommercial.add(new Commercial("John", "Doe", "102 Mich Av NC", "2093", "0012340", "3421", "Me Corp", "Koulou"));
        listeCommercial.add(new Commercial("Toutouni", "Kolo", "23 Foe Rue FC", "2193", "0013340", "4545", "You Corp", "Kpatou"));
        listeCommercial.add(new Commercial("Jane", "Doe", "934 Coom St DB", "2293", "0012440", "5676", "Their Corp", "Fomi"));
        listeCommercial.add(new Commercial("Naams", "Face", "756 Noa Av NB", "2393", "0011340", "2348", "Fair Corp", "Tsouli"));

        while (choix != 7) {
            System.out.println("Menu de l'agence de location\n\n");
            System.out.println("1. Afficher les voitures\n");
            System.out.println("2. Afficher les clients\n");
            System.out.println("3. Afficher les locations\n");
            System.out.println("4. Ajouter une location\n");
            System.out.println("5. Ajouter un client\n");
            System.out.println("6. Retour de location\n");
            System.out.println("7. Quitter\n");
            System.out.print("Entrez votre choix: ");
            choix = sc.nextInt();

            if (choix == 1) {
                System.out.println("La liste de quel type de voiture voulez vous voir ?");
                System.out.println("1.Véhicule\n2.classes.VUS\n3.Camion\n4.Fourgonnette");
                System.out.print("Entrez votre choix: ");
                int choixTypeVoiture = sc.nextInt();
                if (choixTypeVoiture == 1) {
                    for (Vehicules vehicule : listeVehicule) {
                        System.out.println(vehicule);
                    }
                } else if (choixTypeVoiture == 2) {
                    for (VUS vus : listeVUS) {
                        System.out.println(vus);
                    }
                } else if (choixTypeVoiture == 3) {
                    for (Camions camions : listeCamion) {
                        System.out.println(camions);
                    }
                } else if (choixTypeVoiture == 4) {
                    for (Fourgonnettes fourgonnettes : listeFourgonnette) {
                        System.out.println(fourgonnettes);
                    }
                }
            } else if (choix == 2) {
                System.out.println("La liste de quel type de client voulez vous voir ?");
                System.out.println("1.Client régulier\n2.Client commercial");
                System.out.print("Entrez votre choix: ");
                int choixTypeClient = sc.nextInt();
                if (choixTypeClient == 1) {
                    for (Client client : listeClient) {
                        System.out.println(client);
                    }
                } else if (choixTypeClient == 2) {
                    for (Commercial commercial : listeCommercial) {
                        System.out.println(commercial);
                    }
                }
            } else if (choix == 3) {
                System.out.println("Affichage du tableau des locations");
                for (Location location : listeLocation) {
                    System.out.println(location);
                }
            } else if (choix == 4) {
                System.out.println("La liste de quel type de voiture voulez vous louer ?");
                System.out.println("1.Véhicule\n2.VUS\n3.Camion\n4.Fourgonnette");
                System.out.print("Entrez votre choix: ");
                int choixTypeVoiture = sc.nextInt();
                Voiture laVoiture = new Voiture();
                if (choixTypeVoiture == 1) {
                    System.out.println("Voici la liste des véhicules disponible");
                    for (Vehicules vehicule : listeVehicule) {
                        if (vehicule.getDisponibilite()){
                            System.out.println(vehicule);
                        }
                    }
                    System.out.print("Choisissez le numéro du véhicule: ");
                    laVoiture = listeVehicule.get(sc.nextInt());
                } else if (choixTypeVoiture == 2) {
                    System.out.println("Voici la liste des VUS disponible");
                    for (VUS vus : listeVUS) {
                        if (vus.getDisponibilite()) {
                            System.out.println(vus);
                        }
                    }
                    System.out.print("Choisissez le numéro du VUS: ");
                    laVoiture = listeVUS.get(sc.nextInt());
                } else if (choixTypeVoiture == 3) {
                    System.out.println("Voici la liste des camions disponible");
                    for (Camions camions : listeCamion) {
                        if (camions.getDisponibilite()) {
                            System.out.println(camions);
                        }
                    }
                    System.out.print("Choisissez le numéro du camion: ");
                    laVoiture = listeCamion.get(sc.nextInt());
                } else if (choixTypeVoiture == 4) {
                    System.out.println("Voici la liste des fourgonnettes disponible");
                    for (Fourgonnettes fourgonnettes : listeFourgonnette) {
                        if (fourgonnettes.getDisponibilite()) {
                            System.out.println(fourgonnettes);
                        }
                    }
                    System.out.print("Choisissez le numéro de la fourgonnette: ");
                    laVoiture = listeFourgonnette.get(sc.nextInt());
                }

                System.out.println("La liste de quel type de client auxquels voulez vous louer la voiture ?");
                System.out.println("1.Client régulier\n2.Client commercial");
                System.out.print("Entrez votre choix: ");
                int choixTypeClient = sc.nextInt();
                Client leClient = new Client();
                if (choixTypeClient == 1) {
                    System.out.println("Voici la liste des clients réguliers");
                    for (Client client : listeClient) {
                        System.out.println(client);
                    }
                    System.out.print("Choisissez le numéro du cleint: ");
                    leClient = listeClient.get(sc.nextInt());
                } else if (choixTypeClient == 2) {
                    System.out.println("Voici la liste des commercials");
                    for (Commercial commercial : listeCommercial) {
                        System.out.println(commercial);
                    }
                    System.out.print("Choisissez le numéro du commercial: ");
                    leClient = listeCommercial.get(sc.nextInt());
                }
                ajouterLocation(sc, nbreLocations, listeLocation, laVoiture, leClient);
                System.out.println("La location a été ajoutée !");
                nbreLocations ++;
            } else if (choix == 5) {
                System.out.println("Quel type de client voulez vous ajouter ?");
                System.out.println("1.Client régulier\n2.Client commercial");
                System.out.print("Entrez votre choix: ");
                int choixTypeClient = sc.nextInt();
                if (choixTypeClient == 1) {
                    System.out.println("Entrez les informations du client");
                    Client leClient = setClientS(sc);
                    listeClient.add(leClient);
                    System.out.println("Le client a été ajouté !");
                } else if (choixTypeClient == 2) {
                    Commercial leCommercial = setCommercial(sc);
                    listeCommercial.add(leCommercial);
                    System.out.println("Le commercial a été ajouté !");
                }
            } else if (choix == 6) {
                System.out.println("Affichage du tableau des locations");
                for (Location location : listeLocation) {
                    System.out.println(location);
                }
                System.out.print("Choisissez le numéro de la location que vous voulez rendre: ");
                int locationARendre = sc.nextInt();
                listeLocation[locationARendre].getVoiture().setDisponibilite(true);
                System.out.println("La voiture a été rendu !");
            }
        }

        // Écriture de la liste de location dans un fichier rentalList.txt (liste de locations)
        try(
                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("src/files/rentalList.txt",false)))) {
            for(Location location : listeLocation) {
                out.println(location);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Fonction pour ajouter un client régulier
    static Client setClientS(Scanner sc) {
        System.out.print("Entrez le nom: ");
        // Ceci est pour corriger l'exécution du sc.nextLine().
        sc.nextLine();
        String nom = sc.nextLine();
        System.out.print("Entrez le prénom: ");
        String prenom = sc.nextLine();
        System.out.print("Entrez l'adresse: ");
        String adresse = sc.nextLine();
        System.out.print("Entrez le numéro de permis: ");
        String numeroPermis = sc.nextLine();
        System.out.print("Entrez le telephone: ");
        String telephone = sc.nextLine();
        return new Client(nom, prenom, adresse, numeroPermis, telephone);
    }

    // Fonction pour ajouter un commercial
    static Commercial setCommercial(Scanner sc) {
        Client leClient = setClientS(sc);
        System.out.print("Entrez le numéro de compte: ");
        String numeroCompte = sc.nextLine();
        System.out.print("Entrez le nom de la compagnie: ");
        String nomCompagnie = sc.nextLine();
        System.out.print("Entrez le nom du responsable: ");
        String nomResponsable = sc.nextLine();
        return new Commercial(leClient.getNom(), leClient.getPrenom(), leClient.getAdresse(),
                leClient.getNumeroPermisDeConduire(), leClient.getTelephone(), numeroCompte, nomCompagnie,
                nomResponsable);
    }

    // Fonction qui ajoute une location.
    static void ajouterLocation(Scanner sc, int nbreLocations, Location[] listeLocation, Voiture laVoiture, Client leClient) {
        System.out.print("Entrez la date de la location (DD-MM-YYYY): ");
        // Ceci est pour corriger l'exécution du sc.nextLine().
        sc.nextLine();
        String laDate = sc.nextLine();
        System.out.print("Entrez la durée de la location (En jours): ");
        int dureeLocation = sc.nextInt();
        listeLocation[nbreLocations] = new Location(laVoiture, leClient , laDate, dureeLocation);
        listeLocation[nbreLocations].getVoiture().changerDisponibilite();
    }
}