import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
            byte zbyte = 73;
            short zshort = 7329;
            int zint = 732;
            int xint = 83;
            long zlong = 238919238;
            float zfloat = 83.23f;
            double zdoube = 93832.747;
            double ydoube = 832.32;
            boolean zboolean = false;
            char zchar = 'j';
            String zstring = "jjhfb";


        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
         *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
         *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */
        System.out.println("int dodawanie = " + (zint + xint));
        System.out.println("int odejmowanie = " + (zint - xint));
        System.out.println("int mnozenie = " + (zint * xint));
        System.out.println("int dzielenie = " + (zint / xint));
        System.out.println("int modulo = " + (zint % xint));

        System.out.println("double dodawanie = " + (zdoube + ydoube));
        System.out.println("double odejmowanie = " + (zdoube - ydoube));
        System.out.println("double mnozenie = " + (zdoube * ydoube));
        System.out.println("double dzielenie = " + (zdoube / ydoube));
        System.out.println("double modulo = " + (zdoube % ydoube));

    }
}