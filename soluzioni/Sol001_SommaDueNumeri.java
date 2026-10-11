package soluzioni;

import java.util.Scanner;

public class Sol001_SommaDueNumeri {
    public static void main(String[] args) {
        
        //1. Chiedere due numeri in input : classe Scanner
        Scanner scan = new Scanner(System.in);

        //Creazione della stampa per chidere il numero:
        System.out.println("Inserisci il primo numero");

        //Salvataggio del numero ricevuto in una varibile
        int num1 = scan.nextInt();


        System.out.println("Inserisci il secondo numero");
        int num2 = scan.nextInt();



        //Ora che abbiamo i due numeri, calcoliamone la somma
        int somma = num1 + num2;

        //Stampiamo la somma
        System.out.println("Soma: "+ somma);

        //Chiudiamo la chiamata allo scanner per non lasciarlo in attesa
        scan.close();

    }
}
