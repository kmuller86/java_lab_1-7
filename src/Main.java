import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj wiek");
        int  wiek = scan.nextInt();
        if ((wiek % 3) == 0) System.out.println("Podzielny przez 3");
        else System.out.println("Niepodzielny przez 3");


        //* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu *//*
        System.out.println("podaj index");
        int index = scan.nextInt();
        //int wynik = (zmienna % 2 == 0) ? 0 : 1;
        System.out.println((index % 2 == 0) ? "parzysta" : "nieparzesta");

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        System.out.println("podaj liczbę zmiennoprzecinkową");
        double zdouble = scan.nextDouble();
        if(zdouble > 5.3)  System.out.println("zdouble > 5.3");
        else if(zdouble > -5.8)  System.out.println("zdouble > -5.8");
        else if(zdouble == 4.72)  System.out.println("zdouble == 4.72");
    }
}