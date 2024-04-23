package classes;

public class Voiture {
    private String marque;
    private String modele;
    private String anneeDeFabrication;
    private Boolean disponibilite = true;
    private int coutJournalier;
    private int nombrePassagers;
    private boolean isAutomatique;

    // Constructeur vide.
    public Voiture() {};

    // Constructeur avec paramétres.
    public Voiture(String marque, String modele, String annee, int coutJournalier, int nombrePassagers, boolean isAutomatique) {
        setMarque(marque);
        setModele(modele);
        setAnneeDeFabrication(annee);
        setCoutJournalier(coutJournalier);
        setNombrePassagers(nombrePassagers);
        setAutomatique(isAutomatique);
    }

    // Méthode pour vérifier la disponibilité de la voiture.
    public String estDisponible() {
        if (this.disponibilite) {
            return "Oui";
        }
        else {
            return "Non";
        }
    }

    // Méthode pour changer la disponibilité de la voiture.
    public void changerDisponibilite() {
        this.disponibilite = false;
    }

    // Getter...
    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getAnneeDeFabrication() {
        return anneeDeFabrication;
    }

    public Boolean getDisponibilite() {
        return disponibilite;
    }

    public int getCoutJournalier() {
        return coutJournalier;
    }

    public int getNombrePassagers() {return nombrePassagers;}
    public boolean getAutomatique() {
        return this.isAutomatique;
    }
    public String isAutomatique() {
        if(this.isAutomatique) {
            return "oui";
        }
        else  {
            return "non";
        }
    }

    // Setters...
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setAnneeDeFabrication(String anneeDeFabrication) {
        this.anneeDeFabrication = anneeDeFabrication;
    }

    public void setDisponibilite(Boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    public void setCoutJournalier(int coutJournalier) {
        this.coutJournalier = coutJournalier;
    }
    public void setNombrePassagers(int nombrePassagers) {this.nombrePassagers = nombrePassagers;}
    public void setAutomatique(boolean automatique) {isAutomatique = automatique;}

    @Override
    public String toString() {
        return "Les infos de la voiture:\n'La marque' = '" +
                this.marque + "', 'le modèle' = '" +
                this.modele + "', 'l'année' = '" +
                this.anneeDeFabrication + "', 'la disponibilité' = '" + this.estDisponible() +
                "', 'le nombre de passagers' = '" + getNombrePassagers() + "' est 'automatique' : '" +
                isAutomatique() + "'";
    }
}
