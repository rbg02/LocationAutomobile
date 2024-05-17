package classes;

import enums.TypeVehicules;

public class Vehicules extends Voiture{
    private TypeVehicules type;
    private boolean isEssence;

    //Constructeur sans paramètre
    public Vehicules() {}
    //Constructeur avec paramètres
    public Vehicules(String marque, String modele, String annee, int coutJournalier, int nombrePassagers,
              boolean isAutomatique, TypeVehicules unType, boolean essence) {
        super(marque, modele, annee, coutJournalier, nombrePassagers, isAutomatique);
        setType(unType);
        setEssence(essence);
    }
    public TypeVehicules getType() {return type;}
    public String getEssence() {
        if(this.isEssence) {
            return "non";
        }
        else  {
            return "oui";
        }
    }
    public void setType(TypeVehicules type) {this.type = type;}
    public void setEssence(boolean essence) {isEssence = essence;}

    @Override
    public String toString() {
        return super.toString() + " 'le type = '" + getType() + " et 'est électrique': '" + getEssence() + "'\n";
    }
}
