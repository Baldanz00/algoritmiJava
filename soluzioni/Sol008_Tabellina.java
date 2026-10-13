package soluzioni;

import java.util.Scanner;

public class Sol008_Tabellina {
    
    //1. conosco il numero di ripetizioni 10, for
    //2. il contatore deve andare da 1 a 10 e a ogni giro stampare n*i

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero:");
        int n = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }

        scan.close();
    }
}
