package classes;

import java.util.Arrays;
import java.util.List;

public class Fourgonnettes extends Voiture {
    private int type;

    //Constructeur sans paramètre
    public Fourgonnettes(){}
    //Constructeur avec paramètres
    public Fourgonnettes(String marque, String modele, String annee, int coutJournalier, int nombrePassagers,
                         boolean isAutomatique, int unType) {
        super(marque, modele, annee, coutJournalier, nombrePassagers, isAutomatique);
        setType(unType);
    }
    public String getType() {
        List<String> listeType = Arrays.asList("passagers", "utilitaire");
        return listeType.get(this.type);
    }
    public void setType(int type) {this.type = type;}

    @Override
    public String toString() {
        return super.toString() + " 'le type' = '" + getType() + "'\n";
    }
}
