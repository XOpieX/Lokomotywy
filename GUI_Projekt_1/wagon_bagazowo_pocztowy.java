package GUI_Projekt_1;

public class wagon_bagazowo_pocztowy extends wagon{

    public final int iloscBagazy;

    public wagon_bagazowo_pocztowy(boolean wymagaPodloczeniaDoEle, int ID_Wagonu, int wagaNetto, int wagaBrutto, int iloscBagazy) {
        super(wymagaPodloczeniaDoEle = false, ID_Wagonu, wagaNetto, wagaBrutto);
        this.iloscBagazy = iloscBagazy;
    }

    public int getIloscBagazy() {
        return iloscBagazy;
    }
}
