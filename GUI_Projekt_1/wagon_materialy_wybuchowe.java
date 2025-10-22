package GUI_Projekt_1;

public class wagon_materialy_wybuchowe extends wagon_towarowy_ciezki{

    private final int maxSztukMatrialowWybuchowych;
    public wagon_materialy_wybuchowe(boolean wymagaPodloczeniaDoEle, int ID_Wagonu, int wagaNetto, int wagaBrutto, int maxSztukMatrialowWybuchowych) {
        super(wymagaPodloczeniaDoEle = false, ID_Wagonu, wagaNetto, wagaBrutto);
        this.maxSztukMatrialowWybuchowych = maxSztukMatrialowWybuchowych;
    }

    public int getMaxSztukMatrialowWybuchowych() {
        return maxSztukMatrialowWybuchowych;
    }
}
