package classes;

public class Commercial extends Client {
    private String numDeCompte;
    private String nomCompagnie;
    private String responsable;

    //Constructeur sans paramètre
    public Commercial() {}
    //Constructeur avec paramètres
    public Commercial(String nom, String prenom, String adresse, String numeroPermis, String telephone,
                      String unNumDeCompte, String unNomCompagnie, String unResponsable) {
        super(nom, prenom, adresse, numeroPermis, telephone);
        setNumDeCompte(unNumDeCompte);
        setNomCompagnie(unNomCompagnie);
        setResponsable(unResponsable);
    }
    public String getNumDeCompte() {return numDeCompte;}
    public String getNomCompagnie() {return nomCompagnie;}
    public String getResponsable() {return responsable;}
    public void setNumDeCompte(String numDeCompte) {this.numDeCompte = numDeCompte;}
    public void setNomCompagnie(String nomCompagnie) {this.nomCompagnie = nomCompagnie;}
    public void setResponsable(String responsable) {this.responsable = responsable;}

    @Override
    public String toString() {
        return super.toString() + " 'son numéro de compte = '" + getNumDeCompte() +
                " 'de la compagnie: '" + getNomCompagnie() + " 'signé par: '" + getResponsable();
    }
}
