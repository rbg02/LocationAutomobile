package enums;

public enum TypeVUS {
    STANDARD("VUS de type standard"),
    INTERMEDIAIRE("VUS de type intermédiaire"),
    COMPACT("VUS de type compacte"),
    PLEINE_GRANDEUR("VUS de type pleine grandeur"),
    PREMIUM("VUS de type premium");
    String message;
    TypeVUS(String unType)  {this.message = unType;}
    public String getMessage() {return message;}
}
