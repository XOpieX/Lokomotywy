package GUI_Projekt_1;

public class wagon_towarowy_podstawowy extends wagon{

    private final String nadawca;

    public wagon_towarowy_podstawowy(boolean wymagaPodloczeniaDoEle, int ID_Wagonu, int wagaNetto, int wagaBrutto, String nadawca) {
        super(wymagaPodloczeniaDoEle = false, ID_Wagonu, wagaNetto, wagaBrutto);
        this.nadawca = nadawca;
    }
}
