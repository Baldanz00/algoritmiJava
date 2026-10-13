package soluzioni;

import java.util.Scanner;

public class Sol006_PariODispari {
    //1. un numero è pari se il resto della divisione per 2 è 0
    //2. uso if/else sul risultato di n%2

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero:");
        int n = scan.nextInt();

        if(n%2==0){
            System.out.println("Il numero è pari");
        }else{
            System.out.println("Il numero è dispari");
        }

        scan.close();
    }
}
