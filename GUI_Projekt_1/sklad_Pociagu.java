package GUI_Projekt_1;

import java.util.ArrayList;
import java.util.List;

public class sklad_Pociagu extends Thread{

    private Lokomotywa lokomotywa;

    private List<wagon> wagony;

    private Stacje stacje;

    public sklad_Pociagu(Lokomotywa lokomotywa, Stacje stacje) {
        this.lokomotywa = lokomotywa;
        this.wagony = new ArrayList<>();
        this.stacje = stacje;
    }

    public Lokomotywa getLokomotywa() {
        return lokomotywa;
    }

    public List<wagon> getWagony() {
        return wagony;
    }
    public int getIloscWagonow(){
        return wagony.size();
    }

    public void setLokomotywa(Lokomotywa lokomotywa) {
        this.lokomotywa = lokomotywa;
    }
    public void setWagony(List<wagon> wagony) {
        this.wagony = wagony;
    }

    public int getCalaWaga(){
        int waga = lokomotywa.getMaxWaga() - lokomotywa.getMaxWaga();
        for (wagon wagon : wagony){
            waga += wagon.getWagaBrutto();
        }
        return waga;

    }

    public void dodajWagon(wagon wagon) throws wyjatek{
        if(wagony.size() > lokomotywa.getMaxLiczbaWagonu()){
            throw new wyjatek("Limit wagonow przkroczony.");
        }
        wagony.add(wagon);
    }
    public void usunWagon(wagon wagon){
        wagony.remove(wagon);
    }
}
