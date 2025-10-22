package GUI_Projekt_1;

import java.util.ArrayList;
import java.util.List;

public class Archiwa {
    public static void main(String[] args) throws wyjatek {

        Lokomotywa lok1 = new Lokomotywa(1, "Mark", "dd", "Stacja A", "Stacja C", 2, 5000, 2, 70, "Stacja A");
        Lokomotywa lok2 = new Lokomotywa(1, "Mars", "A", "B", "C", 3, 6000, 3, 80, "M");

        wagon w1 = new wagon(false, 1, 30, 40);
        wagon w2 = new wagon(false, 1, 59, 30);
        wagon w3 = new wagon(false, 1, 59, 30);
        wagon_towarowy_podstawowy w4 = new wagon_towarowy_podstawowy(false, 1, 40, 50, "M");

        Stacje st1 = new Stacje();
        Stacje st2 = new Stacje();

        sklad_Pociagu sklad = new sklad_Pociagu(lok1, st1);
        sklad_Pociagu sklad1 = new sklad_Pociagu(lok2, st2);

        sklad1.dodajWagon(w3);

        System.out.println(sklad.getIloscWagonow() + " Ilosc wagonow w lok1");
        System.out.println(sklad1.getIloscWagonow() + " Ilosc wagonow w lok2");

        st1.dodajPolaczenia("Stacja A", "Stacja B", 60);
        st2.dodajPolaczenia("Stacja B", "Stacja C", 30);


        /*if (lok1.getMaxLiczbaWagonu() > 2) {
            throw new wyjatek("Nie mozna dodac kolejnego wagonu przekroczono limit");
        }
        try {
            sklad.dodajWagon(w1);
            sklad.dodajWagon(w1);
            sklad.dodajWagon(w1);
            sklad.dodajWagon(w1);
        } catch (wyjatek e) {
            throw new RuntimeException(e);
        }*/
        System.out.println(sklad1.getCalaWaga());
        System.out.println(lok1.getObecnaStacja());

        while (true) {
            if (lok1.getObecnaStacja().equals(lok1.getDocelowa_stacja())) {
                lok1.postujNaStacjiDocelowej();
            }
            lok1.poruszajSie();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

