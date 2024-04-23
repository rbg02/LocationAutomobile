package classes;

public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private String numeroPermisDeConduire;
    private String telephone;

    // Constructeur vide.
    public Client() {};

    // Constructeur avec paramétres.
    public  Client(String nom, String prenom, String adresse, String numeroPermis, String telephone) {
        setNom(nom);
        setPrenom(prenom);
        setAdresse(adresse);
        setNumeroPermisDeConduire(numeroPermis);
        setTelephone(telephone);
    }

    // Getters...
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNumeroPermisDeConduire() {
        return numeroPermisDeConduire;
    }

    public String getTelephone() {
        return telephone;
    }

    // Setters...
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNumeroPermisDeConduire(String numeroPermisDeConduire) {
        this.numeroPermisDeConduire = numeroPermisDeConduire;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Les infos du client:\nLe nom = '" +
                this.nom + "', le prénom = '" +
                this.prenom + "', le numéro de permis = '" +
                this.numeroPermisDeConduire + "', l'adresse = '" +
                this.adresse + "', et le téléphone = '" +
                this.telephone + "'";
    }
}
