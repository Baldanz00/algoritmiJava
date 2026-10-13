package soluzioni;

public class Sol010_FizzBuzz {
    //1. ciclo da 1 a 100
    // il caso multiplo di 3 e di 5 va controllato per primo
    // per non far catturare i casi singoli e non stamperebbe
    //mai FizzBuzz

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {          // multiplo di 3 e di 5 (controllo per primo)
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
