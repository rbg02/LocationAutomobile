package classes;

import enums.TypeVUS;

public class VUS extends Voiture {
    private TypeVUS type;
    private boolean isIntegrale;

    //Constructeur sans paramètre
    public VUS(){}
    //Constructeur avec paramètres
    public VUS(String marque, String modele, String annee, int coutJournalier, int nombrePassagers,
               boolean isAutomatique, TypeVUS unType, boolean integrale) {
        super(marque, modele, annee, coutJournalier, nombrePassagers, isAutomatique);
        setType(unType);
        setIntegrale(integrale);
    }
    public TypeVUS getType() {return type;}
    public String getIntegrale() {
        if(this.isIntegrale) {
            return "non";
        }
        else  {
            return "oui";
        }
    }
    public void setType(TypeVUS type) {this.type = type;}
    public void setIntegrale(boolean integrale) {isIntegrale = integrale;}

    @Override
    public String toString() {
        return super.toString() + " 'le type' = '" + getType() + "' et est 'intégrale': '" + getIntegrale() + "'\n";
    }
}
