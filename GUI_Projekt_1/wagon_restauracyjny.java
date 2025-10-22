package GUI_Projekt_1;

public class wagon_restauracyjny extends wagon{


    private final int zapasJedzenia;
    public wagon_restauracyjny(boolean wymagaPodloczeniaDoEle, int ID_Wagonu, int wagaNetto, int wagaBrutto, int zapasJedzenia) {
        super(wymagaPodloczeniaDoEle = true, ID_Wagonu, wagaNetto, wagaBrutto);
        this.zapasJedzenia = zapasJedzenia;
    }
    public int getZapasJedzenia() {
        return zapasJedzenia;
    }
}
