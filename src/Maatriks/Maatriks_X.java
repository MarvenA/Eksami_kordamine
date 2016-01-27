package Maatriks;

/**
 * Prindi konsooli 10x10 maatriks selliselt, et joonistub suur X üle laua, nagu bingo diagonaalid.
 */
public class Maatriks_X {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i==j)||(i+j==9)){
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}
