package enums;

public enum TypeVehicules {
    STANDARD("Voiture de type standard"),
    INTERMEDIAIRE("Voiture de type intermédiaire"),
    COMPACTE("Voiture de type compacte"),
    ECONOMIQUE("Voiture de type économique"),
    PLEINE_GRANDEUR("Voiture de type pleine grandeur");
    String message;
    TypeVehicules(String unTypeVoiture) {this.message = unTypeVoiture;}
    public String getMessage() {return message;}
}
