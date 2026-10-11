package soluzioni;

import java.util.Locale;
import java.util.Scanner;

public class Sol003_CelsiueFahrenheit {
    

    // 1. La temperatura può avere decimali, percui double
    // se C fosse in int, 9/5 darebbe 1
    
    public static void main(String[] args) {
        
        // Chiedere in input
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Inserisci la temperatura in Celsius per la conversione: ");
        double c = scan.nextDouble();

        double f = c*9 / 5+32;

        System.out.println(f + " F");
        scan.close();
    }
}
