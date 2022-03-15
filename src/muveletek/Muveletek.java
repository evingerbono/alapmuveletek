
package muveletek;

import java.util.Random;
import java.util.Scanner;

public class Muveletek {
    static private int helyesValaszok = 0;
    static private int osszesJatek = 0;

    public static void main(String[] args) {
   Scanner scrS = new Scanner(System.in);
   int [] tombvalami= {0,0,0,0};
    boolean jatek = true;
    while(jatek == true) {
        int menu = beker(0, 100);
        while(menu > 4)
            menu = beker(0, 100);
        if (menu == 1) {
            osszeadas();
            osszesJatek = osszesJatek+1;
            tombvalami[0]=+1;
            }
        else if (menu == 2) {
            kivonas();
            osszesJatek = osszesJatek+1;
            tombvalami[1]=+1;
            }
        else if (menu == 3) {
            szorzás();
            osszesJatek = osszesJatek+1;
            tombvalami[2]=+1;
            }
        else if (menu == 4) {
            osztas();
            osszesJatek = osszesJatek+1;
            tombvalami[3]=+1;
            }
        //Játék újrakezdése
        System.out.print("Szeretnéd folytatni a játékot?(igen/nem) ");
        String valasz = scrS.nextLine();
        
        while(!valasz.equals("igen") && !valasz.equals("nem")){
            System.out.print("Rosszul válaszoltál! Szeretnéd folytatni a játékot?(igen/nem)");
            valasz = scrS.nextLine();
        }
        
        if (valasz.equals("igen")) 
            jatek = true;
        else {
            jatek = false;
            System.out.println("Köszönjük, hogy játszottál! A statisztikáid: "+helyesValaszok+"/"+osszesJatek);
            // ide kell a statisztika
  
        int maxdb = 0;
        int max=0;
        for( int i = 0; i < tombvalami.length; i++ )
        {
            if (tombvalami[i]>tombvalami[max]) {
                max=i;
            }
        }
       
        
        if (max==0) {
            System.out.println("Összeadást választotta a legtöbbször.");
        }else if (max==1) {
            System.out.println("Kivonást választotta a legtöbbször.");
        }else if (max==2) {
            System.out.println("Szorzást választotta a legtöbbször.");
        }else if (max==3) {
            System.out.println("Osztást választotta a legtöbbször.");
        }
        }
    }
    
}
private static void osszeadas() { 
    System.out.println("Összeadás:");
    Random rnd = new Random(); Scanner scr = new Scanner(System.in);
    int szam1 = rnd.nextInt(100), szam2 = rnd.nextInt(100), eredmeny = szam1 + szam2;
    System.out.println(szam1 + " + " + szam2 + " = ?");
    int valasz = scr.nextInt();
    if (valasz == eredmeny) {
        System.out.println("Helyes válasz");
        helyesValaszok = helyesValaszok+1;
    }
        else {
        System.out.println("Rossz válasz! A helyes: "+ eredmeny);
    }
}


private static void kivonas() {
    System.out.println("Kivonás:");
    Random rnd = new Random();
    Scanner scr = new Scanner(System.in);
    
    int szam1 = rnd.nextInt(100), szam2 = rnd.nextInt(100);
    while(!(szam2 < szam1))
        szam1 = rnd.nextInt(100);
    int eredmeny = szam1 - szam2;
    System.out.println(szam1 + " - " + szam2 + " = ?");
    int valasz = scr.nextInt();
    if (valasz == eredmeny){
        System.out.println("Helyes válasz");
        helyesValaszok = helyesValaszok+1;
    }
    else{
        System.out.println("Rossz válasz! A helyes: "+ eredmeny);
    }
}



private static void szorzás() {
    System.out.println("Szorzás:");
    Random rnd = new Random();
    Scanner scr = new Scanner(System.in);
    int szam1 = rnd.nextInt(100), szam2 = rnd.nextInt(100), eredmeny = szam1 * szam2;
    System.out.println(szam1 + " * " + szam2 + " = ?");
    int valasz = scr.nextInt();
    if (valasz == eredmeny) {
        System.out.println("Helyes válasz");
        helyesValaszok = helyesValaszok+1;
    }
    else
        System.out.println("Rossz válasz! A helyes: "+ eredmeny);
}



private static void osztas() {
    System.out.println("Osztás:");
    Random rnd = new Random();
    Scanner scr = new Scanner(System.in);
    
    int szam1 = rnd.nextInt(100), szam2 = rnd.nextInt(100);
    while(!(szam2 < szam1))
        szam2 = rnd.nextInt(100);
    int eredmeny = eredmeny = szam1 / szam2;
    System.out.println(szam1 + " / " + szam2 + " = ?");
    int valasz = scr.nextInt();
    if (valasz == eredmeny) {
        System.out.println("Helyes válasz"); 
        helyesValaszok = helyesValaszok+1;
    }
    else
        System.out.println("Rossz válasz! A helyes: "+ eredmeny);
}



private static int beker(int also, int felso) {
    Scanner scr = new Scanner(System.in);
    System.out.print("Mit szeretnél gyakorolni? (1: Összeadás; 2: Kivonás; 3: Szorzás; 4: Osztás) ");
    int szam = scr.nextInt();
    int[] tomb={szam};
    return szam;
}
        
}
    
