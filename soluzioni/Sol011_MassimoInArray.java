package soluzioni;

public class Sol011_MassimoInArray {
    // parto dal primo elemento come massimo provvisorio
    //ciclando l'array, se trovo uno più grande, aggiorno il max
    public static void main(String[] args) {
        int[] numeri = {4, 17, 9, 25, 3};

        int max = numeri[0]; // massimo provvisorio

        for (int i = 1; i < numeri.length; i++) { // parto da 1: lo 0 e' gia' il massimo provvisorio
            if (numeri[i] > max) {
                max = numeri[i];
            }
        }

        System.out.println("Il massimo e' " + max);
    }
}
