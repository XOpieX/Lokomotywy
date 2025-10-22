package GUI_Projekt_1;

public class wagon_pasazerski extends wagon{

    private final int liczbaMiejscSiedzacych;
    public wagon_pasazerski(boolean wymagaPodloczeniaDoEle, int ID_Wagonu, int wagaNetto, int wagaBrutto, int liczbaMiejscSiedzacych) {
        super(wymagaPodloczeniaDoEle = true, ID_Wagonu, wagaNetto, wagaBrutto);
        this.liczbaMiejscSiedzacych = liczbaMiejscSiedzacych;

    }

    public int getLiczbaMiejscSiedzacych() {
        return liczbaMiejscSiedzacych;
    }
}
