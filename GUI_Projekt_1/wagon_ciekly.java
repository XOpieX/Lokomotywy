package GUI_Projekt_1;

public class wagon_ciekly extends wagon_towarowy_podstawowy{

    private final int maxLitrow;

    public wagon_ciekly(boolean wymagaPodloczeniaDoEle, int ID_Wagonu, int wagaNetto, int wagaBrutto, String nadawca, int maxLitrow) {
        super(wymagaPodloczeniaDoEle = false, ID_Wagonu, wagaNetto, wagaBrutto, nadawca);
        this.maxLitrow = maxLitrow;
    }

    public int getMaxLitrow() {
        return maxLitrow;
    }
}
