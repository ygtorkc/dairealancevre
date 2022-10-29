package daire;
import java.util.Scanner;
public class Alan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double pi = 3.14;
         System.out.println("Yarıçapı giriniz:");
         r = input.nextInt();
         double alan = pi * r * r ;
         double cevre = 2 * pi * r ;

         System.out.println("Dairenin alanı : " +alan );
         System.out.println("Dairenin çevresi: " +cevre);
         System.out.println("Güle güle");




    }
}
