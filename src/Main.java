
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        /* double miał być */
        Scanner scan = new Scanner(System.in);
        int[] tab = new int[5];

        for(int i = 0; i < tab.length; i++){
            tab[i] = scan.nextInt();
        }

        for(int i = 0; i < tab.length; i++){
            System.out.println("tab[" + i + "] = " + tab[i]);
        }
    }
}
