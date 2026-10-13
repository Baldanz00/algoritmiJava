package soluzioni;

import java.util.Scanner;

public class Sol007_MassimoTraTre {
    //1. per prima cosa imposto il primo numero come massimo
    //2. confronto il massimo correte con ciascuno degli altri e lo aggiorno
    //3. schema del massimo provvisorio si usa anch con array e liste

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Primo numero:");
        int a = scan.nextInt();
        System.err.println("Secondo numero:");
        int b = scan.nextInt();
        System.out.println("Terzo numero:");
        int c = scan.nextInt();

        int max = a; // massimo provvisorio

        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }

        System.out.println("Il massimo è: "+max);
        scan.close();
    }
}
