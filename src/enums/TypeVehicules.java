package enums;

public enum TypeVehicules {
    STANDARD("classes.Voiture de type standard"),
    INTERMEDIAIRE("classes.Voiture de type intermédiaire"),
    COMPACTE("classes.Voiture de type compacte"),
    ECONOMIQUE("classes.Voiture de type économique"),
    PLEINE_GRANDEUR("classes.Voiture de type pleine grandeur");
    String message;
    TypeVehicules(String unTypeVoiture) {this.message = unTypeVoiture;}
    public String getMessage() {return message;}
}
