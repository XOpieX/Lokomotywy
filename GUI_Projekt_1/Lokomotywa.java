package GUI_Projekt_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lokomotywa {

    static List<Lokomotywa> listaLokomotyw = new ArrayList<>();

    private static int NumerLokomotywy = 1;

    private final int ID_lokomotywy;

    private String obecnaStacja;

    private final String nazwa;
    private final String stacja_macierzysta;
    private final String stacja_zrodlowa;
    private final String docelowa_stacja;

    private final int maxLiczbaWagonu;
    private final int maxWaga;
    private final int maxLiczbaWagonowDoSieci;
    private int obecnaPredkosc;

    public Lokomotywa(int ID_lokomotywy, String nazwa, String stacja_macierzysta, String stacja_zrodlowa, String docelowa_stacja, int maxLiczbaWagonu, int maxWaga, int maxLiczbaWagonowDoSieci, int obecnaPredkosc, String obecnaStacja) {
        this.ID_lokomotywy = NumerLokomotywy;
        NumerLokomotywy++;
        this.nazwa = nazwa;
        this.stacja_macierzysta = stacja_macierzysta;
        this.stacja_zrodlowa = stacja_zrodlowa;
        this.docelowa_stacja = docelowa_stacja;
        this.maxLiczbaWagonu = maxLiczbaWagonu;
        this.maxWaga = maxWaga;
        this.maxLiczbaWagonowDoSieci = maxLiczbaWagonowDoSieci;
        this.obecnaPredkosc = obecnaPredkosc;
        double randomValue = Math.random();
        if (randomValue < 0.5){
            increaseSpeed();
        }
        else {
            decreaseSpeed();
        }
        this.obecnaStacja = obecnaStacja;
        listaLokomotyw.add(this);
    }

    public String getObecnaStacja() {
        return obecnaStacja;
    }

    public static int getNumerLokomotywy() {
        return NumerLokomotywy;
    }

    public int getID_lokomotywy() {
        return ID_lokomotywy;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getStacja_macierzysta() {
        return stacja_macierzysta;
    }

    public String getStacja_zrodlowa() {
        return stacja_zrodlowa;
    }

    public String getDocelowa_stacja() {
        return docelowa_stacja;
    }

    public int getMaxLiczbaWagonu() {
        return maxLiczbaWagonu;
    }

    public int getMaxWaga() {
        return maxWaga;
    }

    public int getMaxLiczbaWagonowDoSieci() {
        return maxLiczbaWagonowDoSieci;
    }

    public int getObecnaPredkosc() {
        return obecnaPredkosc;
    }
    public void increaseSpeed() {
        double randomSpeed = Math.random() * 0.03;
        obecnaPredkosc += (obecnaPredkosc * randomSpeed);
    }
    public void decreaseSpeed(){
        double randomSpeed = Math.random() * 0.03;
        obecnaPredkosc -= (obecnaPredkosc * randomSpeed);
    }
    public void poruszajSie() {
        List<Stacje.PolaczeniaPociagow> polaczenia = Stacje.getPolaczenia().get(obecnaStacja);
        if (polaczenia != null){
            Collections.sort(polaczenia);

            for (Stacje.PolaczeniaPociagow polaczenie : polaczenia){
                String nastepnaStacja = polaczenie.getStacje();

                if (!nastepnaStacja.equals(obecnaStacja)){
                    obecnaStacja = nastepnaStacja;

                    System.out.println("Lokomotywa " + nazwa + " dotarła do stacji " + obecnaStacja);
                    break;
                }
            }
        }
    }
    public void postujNaStacjiDocelowej(){
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void usunLokomotywe(int ID){
        for (Iterator<Lokomotywa> m = listaLokomotyw.iterator();m.hasNext();){
            Lokomotywa lokomotywa = m.next();
            if (lokomotywa.getID_lokomotywy() == ID){
                m.remove();
            }
        }
    }
}