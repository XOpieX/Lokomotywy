package GUI_Projekt_1;

public class wagon_ciekle_toksyczne extends wagon_towarowy_ciezki{

    private final int maxLitrow;


    public wagon_ciekle_toksyczne(boolean wymagaPodloczeniaDoEle, int ID_Wagonu, int wagaNetto, int wagaBrutto, int maxLitrow) {
        super(wymagaPodloczeniaDoEle = false, ID_Wagonu, wagaNetto, wagaBrutto);
        this.maxLitrow = maxLitrow;
    }

    public int getMaxLitrow() {
        return maxLitrow;
    }
}
