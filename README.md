 #Alap-Muveletek1A1

4-alapműveletet kell gyakoroltatni (összeadaás, kivonás, szorzás, osztás)<br>
Nem lehet minusz számot megadni a műveletekkel pl 5-6=-1 ez nem lehet.<br>
Osztásnál ne legyen maradékos osztásos feladat.<br>
Csak egész számokat lehessen használni.<br>
Számok intervalluma 1-100-ig.<br>
A végén statisztikát kell csinálni hány kérdésből hány rossz és jó volt .<br>
A felhsznnáló döntse-el,hogy melyik műveletett akarja gyakorolni. <br>
A válaszokat elkell menteni.

Bekérés<br>
Main<br>
Main művellet<br>
Kiírás<br>

Csiszér Alex Dominik: Osztás, összeadás, új játék kezdés <br>
Furkó Norbert: Kivonás, mennyi helyes válasza volt <br>
Evinger Bónó: Szorzás, melyiket választotta a legtöbbször

package oraimunka0309;

import java.util.Random;
import java.util.Scanner;

public class OraiMunka0309 {
    
    public static void main(String[] args) {
        Scanner scrS = new Scanner(System.in);
        
        boolean jatek = true;
        while(jatek == true) {
            int menu = beker(0, 100);
            if (menu == 1) 
                osszeadas();
            else if (menu == 2)
                kivonas();
            else if (menu == 3) 
                szorzás();
            else if (menu == 4) 
                osztas();
            
            System.out.print("Szeretnéd folytatni a játékot?(igen/nem) ");
            String valasz = scrS.nextLine();
            System.out.println(valasz);
            
            while(!(valasz.equals("igen")) || !(valasz.equals("nem"))){
                System.out.print("Rosszul válaszoltál! Szeretnéd folytatni a játékot?(igen/nem)");
                valasz = scrS.nextLine();
            }
            
            if (valasz.equals("igen")) 
                jatek = true;
            else
                jatek = false;
        }
        
    }
    
   private static void osszeadas() {
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
    }



    private static void szorzás() {
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
        Random rnd = new Random();
        Scanner scr = new Scanner(System.in);
        
        int szam1 = rnd.nextInt(100), szam2 = rnd.nextInt(100);
        while(!(szam2 < szam1))
            szam2 = rnd.nextInt(100);
        int eredmeny = eredmeny = szam1 / szam2;
        System.out.println(szam1 + " / " + szam2 + " = ?");
        int valasz = scr.nextInt();
        if (valasz == eredmeny)
            System.out.println("Helyes válasz");
        else
            System.out.println("Rossz válasz! A helyes: "+ eredmeny);
    }



    private static int beker(int also, int felso) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Mit szeretnél gyakorolni? (1: Összeadás; 2: Kivonás; 3: Szorzás; 4: Osztás) ");
        int szam = scr.nextInt();
        return szam;
    }
}
