package soluzioni;

public class Sol004_ScambioDiVariabili {
    // 1. Se fai a = b, perdi il vecchio valore di a
    // ho bisogno di una variabile di appoggio

    public static void main(String[] args) {
        
        int a = 3;
        int b = 5;

        System.out.println("Valori iniziali: a = "+ a + " b = " + b);
        int temp = a; // salvo il valore di a in una variabile temporanea -> temp = 3
        a=b; // salvo il valore di b in a -> a=5
        b=temp; // b = 3


        System.out.println("Valori dopo lo scambio: a = "+ a + " b = " + b);
    }
}
