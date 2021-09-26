import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
         *   a) Imię, nazwisko, wiek, nr indeksu,
         *   dane mają być wprowadzane z klawiatury w konsoli
         *   b) wyświetlić dane za pomocą println i printf
         */
            String imie;
            String nazwisko;
            int wiek;
            int index;

            Scanner scan = new Scanner(System.in);
            System.out.println("podaj imie");
            imie = scan.next();
            System.out.println("podaj nazwisko");
            nazwisko = scan.next();
            System.out.println("podaj wiek");
            wiek = scan.nextInt();
            System.out.println("podaj indeks");
            index = scan.nextInt();

            System.out.println("imie = " + imie);
            System.out.println("nazwisko = " + nazwisko);
            System.out.printf("wiek = " + wiek + "\n");
            System.out.printf("indeks = " + index + "\n");

        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */
        System.out.println("podaj 2 liczby");
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("+ " + (x + y));
        System.out.println("- " + (x - y));
        System.out.println("* " + (x * y));
        System.out.println("/ " + (x / y));
        System.out.println("% " + (x % y));
    }
}