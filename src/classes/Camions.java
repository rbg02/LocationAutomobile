package classes;

import java.util.Arrays;
import java.util.List;

public class Camions extends Voiture{
    private int taille;
    private int rouesMotrices;

    //Constructeur sans paramètre
    public Camions(){}
    //Constructeur avec paramètres
    public Camions(String marque, String modele, String annee, int coutJournalier, int nombrePassagers,
                   boolean isAutomatique, int uneTaille, int uneRouesMotrices) {
        super(marque, modele, annee, coutJournalier, nombrePassagers, isAutomatique);
        setTaille(uneTaille);
        setRouesMotrices(uneRouesMotrices);
    }
    public String getTaille() {
        List<String> listeTaille = Arrays.asList("petit", "normal", "gros");
        return listeTaille.get(this.taille);
    }
    public int getRouesMotrices() {return rouesMotrices;}
    public void setTaille(int taille) {this.taille = taille;}
    public void setRouesMotrices(int rouesMotrices) {this.rouesMotrices = rouesMotrices;}

    @Override
    public String toString() {
        return super.toString() + " 'la taille' = '" + getTaille() + "' et est '" + getRouesMotrices() + " roues motrices'";
    }
}
