package GUI_Projekt_1;

public class wagon_materialy_toksyczne extends wagon_towarowy_ciezki{

    private final int iloscLitrow;


    public wagon_materialy_toksyczne(boolean wymagaPodloczeniaDoEle, int ID_Wagonu, int wagaNetto, int wagaBrutto, int iloscLitrow) {
        super(wymagaPodloczeniaDoEle = false, ID_Wagonu, wagaNetto, wagaBrutto);
        this.iloscLitrow = iloscLitrow;
    }

    public int getIloscLitrow() {
        return iloscLitrow;
    }
}
