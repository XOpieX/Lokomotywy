package GUI_Projekt_1;

public class wagon_chlodniczy extends wagon_towarowy_podstawowy{

    private final int temperaturawWagonie;
    public wagon_chlodniczy(boolean wymagaPodloczeniaDoEle, int ID_Wagonu, int wagaNetto, int wagaBrutto, String nadawca, int temperaturawWagonie) {
        super(wymagaPodloczeniaDoEle = true, ID_Wagonu, wagaNetto, wagaBrutto, nadawca);
        this.temperaturawWagonie = temperaturawWagonie;
    }

    public int gettemperaturawWagonie() {
        return temperaturawWagonie;
    }
}
