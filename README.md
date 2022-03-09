 Alap-Muveletek1A1

4-alapműveletett kell gyakoroltattní (összeadaás, kivonás, szorzás, osztás)
Nem lehet minusz számott megadni a műveletekkel pl 5-6=-1 ez nem lehet.
Osztásnál ne legyen maradékos osztásos feladat.
Csak egész számokat lehessen használni.
Számok intervalluma 1-100-ig.
A végén statisztikát kell csinálni hány kérdésbő hány rosz jó volt .
A felhsznnáló döntse-el,hogy melyyik műveletett akarja gyakorolni. 

Bekérés
Main
Main művellet
Kiírás

package oraimunka0309;

import java.util.Scanner;

public class OraiMunka0309 {
    
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
    }



    private static void kivonas() {
        System.out.println("Kivon");
    }



    private static void szorzás() {
        System.out.println("Szorzas");
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
