package Maatriks;

/**
 * Prindi konsooli 10x100 maatriks, kus läheb joon sikk-sakk ülevalt alla.
 * <p>
 * Näide:
 * x
 * x
 * x
 * x
 * jne.
 * <p>
 * Kasuta mis iganes tähiseid soovid ülesande lahendamiseks.
 */
public class Maatriks_sikksakk {
    public static void main(String[] args) {
       /* int count = 0;
        int abi = 0;
        int i_max = 12;

        for (int k = 0; k < 5; k++) {
            for (int i = 0; i < 19; i++) {
                for (int j = 0; j < 10; j++) {
                    if ((i==j||i==18-j)){
                        System.out.printf("?");
                    } else {
                        System.out.printf(" ");
                    }
                }
                System.out.println();
            }
        }*/
        //KerstiM lahendus Gitterist
        for (int i = 0; i < 100; i++) {

            int m = i;
            while (m>18)
                m = m-18;

            if (m < 10) {
                for (int j = 0; j < 10; j++) {
                    if (j == m) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            if (m > 9) {
                for (int j = 0; j < 10; j++) {
                    if (j == 18 - m) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
