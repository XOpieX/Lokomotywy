package GUI_Projekt_1;


import java.util.*;

public class Stacje {

    private String Lokomotywa = null;

    public static final Map<String, List<PolaczeniaPociagow>> polaczenia = new HashMap<>();



    public void dodajPolaczenia(String stacja1, String stacja2, int odleglosc){
        PolaczeniaPociagow polaczenia12 = new PolaczeniaPociagow(stacja2, odleglosc);
        List<PolaczeniaPociagow> polaczenia1 = polaczenia.getOrDefault(stacja1, new ArrayList<>());
        polaczenia1.add(polaczenia12);
        polaczenia.put(stacja1, polaczenia1);

        PolaczeniaPociagow polaczenia21 = new PolaczeniaPociagow(stacja1, odleglosc);
        List<PolaczeniaPociagow> polaczenia2 = polaczenia.getOrDefault(stacja2, new ArrayList<>());
        polaczenia2.add(polaczenia21);
        polaczenia.put(stacja2, polaczenia2);
    }

    public static Map<String, List<PolaczeniaPociagow>> getPolaczenia() {
        return polaczenia;
    }

    public static class PolaczeniaPociagow implements Comparable<PolaczeniaPociagow>{

        public final String stacje;

        public final int odleglosc;

        @Override
        public int compareTo(PolaczeniaPociagow other) {
            return Integer.compare(odleglosc, other.odleglosc);
        }
        public PolaczeniaPociagow(String stacje, int odleglosc){
            this.stacje = stacje;
            this.odleglosc = odleglosc;
        }

        public String getStacje() {
            return stacje;
        }

        public int getOdleglosc() {
            return odleglosc;
        }
    }
}
