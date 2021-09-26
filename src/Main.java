import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        boolean a = false;
        boolean b = false;
        boolean c = true;

        int x = 45;
        int y = 223;
        int z = 7;



        System.out.println("!(((a && c) || (!a || b) && (false || c )) || (!(x < z) && (y == x) && !(z <= y)))) : " + !(
                ((a && c) || (!a || b) && (false || c )) || (!(x < z) && (y == x) && !(z <= y))
        )); // false

    }
}