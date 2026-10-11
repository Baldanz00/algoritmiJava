package soluzioni;

import java.util.Locale;
import java.util.Scanner;

public class Sol002_AreaRettangolo {
    /* 1. base e altezza posson essere decimali, double
        2. Formula: base*altezza
        3. con Locale.US lo scaner accetta il punto come separatore decimale */
    
    public static void main(String[] args) {
        
        //Devo chiedere in input due numeri, quindi usiamo la classe Scanner
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Inserisci il numero per la base: ");
        double base = scan.nextDouble();

        System.out.println("Inserisci il numer per l'altezza: ");
        double altezza = scan.nextDouble();

        //Formula
        double area = base * altezza;

        System.out.println("L'area del rettangolo è: "+area);

        scan.close();




    }
    
}
