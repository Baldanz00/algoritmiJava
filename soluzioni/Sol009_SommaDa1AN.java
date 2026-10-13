
import java.util.Scanner;

public class Sol009_SommaDa1AN {
    
    //1. ho bisogno di un accumultore inizializzato a 0
    //2. ciclo for da 1 a n e aggiungo e aggiungo ogni numero all'accmultore
    //3. opzine b: N*(N+1)/2
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("N:");
        int n = scan.nextInt();

        int somma = 0; //accumulatore
        for(int i = 1;i <=n; i++){
            somma += i;
        }

        System.out.println("Somma: "+somma);

        scan.close();
    }


}