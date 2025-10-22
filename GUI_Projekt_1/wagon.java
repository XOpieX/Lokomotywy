package GUI_Projekt_1;

public class wagon {

    private static int NumerWagonu = 1;

    private final boolean wymagaPodloczeniaDoEle;

    private  final int ID_Wagonu;

    private final int WagaNetto;
    private final int WagaBrutto;


    public wagon(boolean wymagaPodloczeniaDoEle, int ID_Wagonu, int wagaNetto, int wagaBrutto) {
        this.wymagaPodloczeniaDoEle = wymagaPodloczeniaDoEle;
        this.ID_Wagonu = NumerWagonu;
        NumerWagonu++;
        this.WagaNetto = wagaNetto;
        this.WagaBrutto = wagaBrutto;
    }





    public static int getNumerWagonu() {
        return NumerWagonu;
    }

    public boolean isWymagaPodloczeniaDoEle() {
        return wymagaPodloczeniaDoEle;
    }

    public int getID_Wagonu() {
        return ID_Wagonu;
    }

    public int getWagaNetto() {
        return WagaNetto;
    }

    public int getWagaBrutto() {
        return WagaBrutto;
    }
}
