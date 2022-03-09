
package muveletek;

import java.util.Random;
import java.util.Scanner;


public class Muveletek {

    public static void main(String[] args) {
        int menu = beker(0, 100);

    if (menu == 1) 
        osszeadads();
    else if (menu == 2)
        kivonas();
    else if (menu == 3) 
        szorzás();
    else if (menu == 4) 
        osztas();
}

private static void osszeadads() {
    System.out.println("Osszead");
    Random rnd = new Random();
    Scanner scr = new Scanner(System.in);
    
    int szam1 = rnd.nextInt(100), szam2 = rnd.nextInt(100), eredmeny = szam1 + szam2;
    System.out.println(szam1 + " + " + szam2 + " = ?");
    int valasz = scr.nextInt();
    if (valasz == eredmeny)
        System.out.println("Helyes válasz");
    else
        System.out.println("Rossz válasz! A helyes: "+ eredmeny);
}



private static void kivonas() {
    System.out.println("Kivon");
    Random rnd = new Random();
    Scanner scr = new Scanner(System.in);
    
    int szam1 = rnd.nextInt(100), szam2 = rnd.nextInt(100), eredmeny = szam1 - szam2;
    while(!(szam2 < szam1))
        szam1 = rnd.nextInt(100);
    System.out.println(szam1 + " - " + szam2 + " = ?");
    int valasz = scr.nextInt();
    if (valasz == eredmeny)
        System.out.println("Helyes válasz");
    else
        System.out.println("Rossz válasz! A helyes: "+ eredmeny);
}



private static void szorzás() {
    System.out.println("Szorzas");
    Random rnd = new Random();
    Scanner scr = new Scanner(System.in);
    int szam1 = rnd.nextInt(100), szam2 = rnd.nextInt(100), eredmeny = szam1 * szam2;
    System.out.println(szam1 + " * " + szam2 + " = ?");
    int valasz = scr.nextInt();
    if (valasz == eredmeny)
        System.out.println("Helyes válasz");
    else
        System.out.println("Rossz válasz! A helyes: "+ eredmeny);

}



private static void osztas() {
    System.out.println("Osztas");
}



private static int beker(int also, int felso) {
    Scanner scr = new Scanner(System.in);
    System.out.print("Mit szeretnél gyakorolni? (1: Összeadás; 2: Kivonás; 3: Szorzás; 4: Osztás) ");
    int szam = scr.nextInt();
    return szam;
}
}
