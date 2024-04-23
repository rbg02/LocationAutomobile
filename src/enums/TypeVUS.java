package enums;

public enum TypeVUS {
    STANDARD("classes.VUS de type standard"),
    INTERMEDIAIRE("classes.VUS de type intermédiaire"),
    COMPACT("classes.VUS de type compacte"),
    PLEINE_GRANDEUR("classes.VUS de type pleine grandeur"),
    PREMIUM("classes.VUS de type premium");
    String message;
    TypeVUS(String unType)  {this.message = unType;}
    public String getMessage() {return message;}
}
