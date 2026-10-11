package soluzioni;

import java.util.Scanner;

public class Sol005_DivisioneEResto {
    
    //Tra due int / restituisce il quoziente intero e % il resto
    //Dividere per zero con gli int lancia un eccezione, quindi prima si controlla il div.

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Dividendo: ");
        int a = scan.nextInt();

        System.out.println("Divisore: ");
        int b = scan.nextInt();

        if(b==0){
            //caso da escludere: la divisione per 0 non è definita
            System.out.println("Errore il divisore non può essere 0");
        } else {
            int quoziente = a/b;
            int resto = a%b;
            System.out.println("Quoziente: "+quoziente + ", Resto: "+resto);
        }

        scan.close();
    }
}
