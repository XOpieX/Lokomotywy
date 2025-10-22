package GUI_Projekt_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static GUI_Projekt_1.Lokomotywa.listaLokomotyw;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Lokomotywa lok = null;
        sklad_Pociagu sklad = null;
        Stacje stacje = null;
        wagon wagon1 = null;


        while (true){
        System.out.println("1 Dodaj lokomotywe");
        System.out.println("2 Dodaj wagon");
        System.out.println("3 Stworz stacje i dodaj polaczenie");
        System.out.println("4 Usun lokomotywe");
        System.out.println("5 Usun wagon");
        System.out.println("6 Usun stacje i usun polaczenie");
        System.out.println("7 Przypisz wagon do lokomotywy");
        System.out.println("8 Zaladuj osobę/ładunek do wagonu");
        System.out.println("0 Wyjscie");

        String znak = sc.next();

        if (znak.equals("1")){
            System.out.println("Podaj nazwe lokomotywy");
            String nazwa = sc.next();
            System.out.println("Podaj stacje macierzysta");
            String nazwaMacierzysta = sc.next();
            System.out.println("Podaj stacje zrodlowa");
            String stacjaZrodlowa = sc.next();
            System.out.println("Podaj stacje docelowa");
            String stacjaDocelowa = sc.next();
            System.out.println("Podaj jaka maksymalna liczba wagonow moze dysponowac lokomotywa");
            int maxWagnow = sc.nextInt();
            System.out.println("Podaj maksymalny uciag lokomotywy");
            int maxUciag = sc.nextInt();
            System.out.println("Podaj maksymalna mozliwa ilosc wagonow podloczonych do sieci");
            int maxWagnowEle = sc.nextInt();
            System.out.println("Podaj obecna predkosc lokomotywy");
            int predkosc = sc.nextInt();
            System.out.println("Podaj obecna stacje");
            String obecnaStacja = sc.next();

            Stacje st = new Stacje();
            Lokomotywa lok1 = new Lokomotywa(1, nazwa, nazwaMacierzysta, stacjaZrodlowa, stacjaDocelowa, maxWagnow, maxUciag, maxWagnowEle, predkosc, obecnaStacja);
            sklad_Pociagu sk1 = new sklad_Pociagu(lok1, st);
            System.out.println("Lokomotywa zostala utworzona " + "ID:"+lok1.getID_lokomotywy() + " " + lok1.getNazwa());
        }
        else if (znak.equals("2")) {

            System.out.println("Wybierz rodzaj wagonu");

            System.out.println("1 Wagon bagazowo-pocztowy");
            System.out.println("2 Wagon chlodniczy");
            System.out.println("3 Wagon cielke toksyny");
            System.out.println("4 Wagon materialy ciekle");
            System.out.println("5 Wagon gazowy");
            System.out.println("6 Wagon materialy-toksyczne");
            System.out.println("7 Wagon materialy-wybuchowe");
            System.out.println("8 Wagon pasazerski");
            System.out.println("9 Wagon pocztowy");
            System.out.println("10 Wagon restauracyjny");
            System.out.println("11 Wagon towarowy-ciezki");
            System.out.println("12 Wagon towarowy-podstawowy");

            String znak1 = sc.next();
            if (znak1.equals("1")) {
                System.out.println("Podaj wage netto");
                int waganetto = sc.nextInt();
                System.out.println("Podaj wage brutto");
                int wagabrutto = sc.nextInt();
                System.out.println("Podaj ilosc bagazy");
                int iloscbagazy = sc.nextInt();
                System.out.println("Podaj nazwe wagonu");
                wagon_bagazowo_pocztowy wagon13 = new wagon_bagazowo_pocztowy(false, 1, waganetto, wagabrutto, iloscbagazy);
                System.out.println("Wagon zostal utworzony");
            } else if (znak1.equals("2")) {
                System.out.println("Podaj wage netto");
                int waganetto = sc.nextInt();
                System.out.println("Podaj wage brutto");
                int wagabrutto = sc.nextInt();
                System.out.println("Podaj nadawce");
                String nadawca = sc.next();
                System.out.println("Podaj temperature");
                int temp = sc.nextInt();
                wagon_chlodniczy wagon2 = new wagon_chlodniczy(true, 1, waganetto, wagabrutto, nadawca, temp);
                System.out.println("Wagon zostal utworzony");
            } else if (znak1.equals("3")) {
                System.out.println("Podaj wage netto");
                int waganetto = sc.nextInt();
                System.out.println("Podaj wage brutto");
                int wagabrutto = sc.nextInt();
                System.out.println("Podaj maksymalna pojemnosc wagonu");
                int poj = sc.nextInt();
                wagon_ciekle_toksyczne wagon3 = new wagon_ciekle_toksyczne(false, 1, waganetto, wagabrutto, poj);
                System.out.println("Wagon zostal utworzony");
            } else if (znak1.equals("4")) {
                System.out.println("Podaj wage netto");
                int waganetto = sc.nextInt();
                System.out.println("Podaj wage brutto");
                int wagabrutto = sc.nextInt();
                System.out.println("Podaj nadawce");
                String nadawca = sc.next();
                System.out.println("Podaj maksymalna pojemnosc w litrach");
                int maxLitrow = sc.nextInt();
                wagon_ciekly wagon4 = new wagon_ciekly(false, 1, waganetto, wagabrutto, nadawca, maxLitrow);
                System.out.println("Wagon zostal utworzony");
            } else if (znak1.equals("5")) {
                System.out.println("Podaj wage netto");
                int waganetto = sc.nextInt();
                System.out.println("Podaj wage brutto");
                int wagabrutto = sc.nextInt();
                System.out.println("Podaj nadawce");
                String nadawca = sc.next();
                System.out.println("Podaj maksymalna pojemnosc w litrach");
                int maxLitrow = sc.nextInt();
                wagon_gazowy wagon5 = new wagon_gazowy(false, 1, waganetto, wagabrutto, nadawca, maxLitrow);
                System.out.println("Wagon zostal utworzony");
            } else if (znak1.equals("6")) {
                System.out.println("Podaj wage netto");
                int waganetto = sc.nextInt();
                System.out.println("Podaj wage brutto");
                int wagabrutto = sc.nextInt();
                System.out.println("Podaj maksymalna pojemnosc w litrach");
                int maxLitrow = sc.nextInt();
                wagon_materialy_toksyczne wagon6 = new wagon_materialy_toksyczne(false, 1, waganetto, wagabrutto, maxLitrow);
                System.out.println("Wagon zostal utworzony");
            } else if (znak1.equals("7")) {
                System.out.println("Podaj wage netto");
                int waganetto = sc.nextInt();
                System.out.println("Podaj wage brutto");
                int wagabrutto = sc.nextInt();
                System.out.println("Podaj maksymalna liczbe materialow wybuchowych");
                int maxWybuchowe = sc.nextInt();
                wagon_materialy_wybuchowe wagon7 = new wagon_materialy_wybuchowe(false, 1, waganetto, wagabrutto, maxWybuchowe);
                System.out.println("Wagon zostal utworzony");
            } else if (znak1.equals("8")) {
                System.out.println("Podaj wage netto");
                int waganetto = sc.nextInt();
                System.out.println("Podaj wage brutto");
                int wagabrutto = sc.nextInt();
                System.out.println("Podaj maksymalna liczbe miejsc w wagonie");
                int maxMiejscwWagonie = sc.nextInt();
                wagon_pasazerski wagon8 = new wagon_pasazerski(true, 1, waganetto, wagabrutto, maxMiejscwWagonie);
                System.out.println("Wagon zostal utworzony");
            } else if (znak1.equals("9")) {
                System.out.println("Podaj wage netto");
                int waganetto = sc.nextInt();
                System.out.println("Podaj wage brutto");
                int wagabrutto = sc.nextInt();
                wagon_pocztowy wagon9 = new wagon_pocztowy(true, 1, waganetto, wagabrutto);
                System.out.println("Wagon zostal utworzony");
            } else if (znak1.equals("10")) {
                System.out.println("Podaj wage netto");
                int waganetto = sc.nextInt();
                System.out.println("Podaj wage brutto");
                int wagabrutto = sc.nextInt();
                System.out.println("Podaj ile wynosi zapsa jedzenia");
                int zapasJedzenia = sc.nextInt();
                wagon_restauracyjny wagon10 = new wagon_restauracyjny(true, 1, waganetto, wagabrutto, zapasJedzenia);
                System.out.println("Wagon zostal utworzony");
            } else if (znak1.equals("11")){
                System.out.println("Podaj wage netto");
                int waganetto = sc.nextInt();
                System.out.println("Podaj wage brutto");
                int wagabrutto = sc.nextInt();
                System.out.println("Podaj maksymalna pojemnosc w litrach ");
                int maxLitrow = sc.nextInt();
                wagon_ciekle_toksyczne wagon11 = new wagon_ciekle_toksyczne(false, 1, waganetto, wagabrutto, maxLitrow);
                System.out.println("Wagon zostal utworzony");
            } else if (znak1.equals("12")) {
                System.out.println("Podaj wage netto");
                int waganetto = sc.nextInt();
                System.out.println("Podaj wage brutto");
                int wagabrutto = sc.nextInt();
                System.out.println("Podaj nadawce");
                String nadawca = sc.next();
                wagon_towarowy_podstawowy wagon12 = new wagon_towarowy_podstawowy(false, 1, waganetto, wagabrutto, nadawca);}
                System.out.println("Wagon zostal utworzony");
        } else if (znak.equals("3")) {
            System.out.println("Podaj nazwe stacji");
            String nazwaSt = sc.next();
            System.out.println("Podaj druga nazwe stacji" );
            String nazwaSt1 = sc.next();
            System.out.println("Podaj odleglosc pomidzy stacjami");
            int odleglosc = sc.nextInt();
            new Stacje().dodajPolaczenia(nazwaSt, nazwaSt1, odleglosc);
            System.out.println("Stacja zostala utworzona");
        } else if (znak.equals("4")) {
            System.out.println("Podaj ID lokomotyw do usuniecia");
            int ID = sc.nextInt();
            Iterator<Lokomotywa> m = listaLokomotyw.iterator();

            while (m.hasNext()){
                Lokomotywa lokomotywa = m.next();

                if (lokomotywa.getID_lokomotywy() == ID){
                    m.remove();
                    System.out.println("Lokomotywa zostala usunieta");
                }
            }
            
        } else if (znak.equals("5")) {
            System.out.println("Podaj ID wagonu do usuniecia");
            int ID = sc.nextInt();

            for (wagon wagony : sklad.getWagony()){
                if (wagony.getID_Wagonu() == ID){
                    sklad.usunWagon(wagony);
                    System.out.println("Wagon zostala usunieta");
                }
            }

        } else if (znak.equals("7")) {
            System.out.println("Podaj ID lokomotywy do ktorej chcesz podloczyc wagon");
            int ID = sc.nextInt();
            System.out.println("Podaj ID wagonu ktory chcesz przylacyzc do lokomotywy");
            int ID_wag = sc.nextInt();
            try {
                if (lok.getMaxLiczbaWagonu() > sklad.getIloscWagonow() ){
                    throw new wyjatek("Nie mozna dodac kolejnego wagonu przekroczono limit");
                }
                sklad.dodajWagon(wagon1);
            } catch (wyjatek e) {
                throw new RuntimeException(e);
            }

        } else if (znak.equals("8")) {
            System.out.println("Podaj ID wagonu ktory trzeba zaladowac");
            int ID = sc.nextInt();
            System.out.println("Wagon zostal zaladowany");

        } else if (znak.equals("0")) {
            break;
        }
        }
    }
}
