import java.util.Arrays;

/**
 * if, while, int[]
 * Sulle antakse ette mitu gruppi tudengite hindeid. Kuna maksimum hinne on
 * tegelikult 60 punkti, pead esiteks kõik suuremad arvud 60 peale ümardama.
 * Teiseks leia mitu tudengit said üle mediaani?
 */
public class Algoritm {

    // Main klass on ainult sulle endale testimiseks
    public static void main(String[] args) {

        System.out.println(yleMediaani(new int[]{20, 19, 46, 55, 67, 89}));
        System.out.println(yleMediaani(new int[]{55, 23, 88, 56, 43, 90, 34}));
        System.out.println(yleMediaani(new int[]{21, 85, 45}));

    }

    // Siia meetodi sisse kirjuta lahendus.
    private static int yleMediaani(int[] ints) {
        int count = 0;
        double median = 0;
        Arrays.sort(ints);

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > 60) ints[i] = 60;
        }

        if (ints.length % 2 == 0) {
            int n = ints.length / 2 -1;
            median = (ints[n] + ints[n + 1]) / 2;
        } else if (ints.length % 2 == 1) {
            int n = (ints.length + 1) / 2 -1;
            median = ints[n];
        }

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > median) count++;
        }

        return count;
    }
}
