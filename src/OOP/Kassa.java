package OOP;

import java.util.ArrayList;

/**
 * Created by maus on 28.01.2016.
 */
public class Kassa {
    private String kassapidajaNimi;
    private ArrayList<String> tooted = new ArrayList<>();

    Kassa(String kassapidaja) {
        kassapidajaNimi = kassapidaja;
    }

    public void lisaToode(String toode) {
        tooted.add(toode);
    }

    public void eemaldaToode(String toode) {
        if (tooted.contains(toode)) {
            tooted.remove(toode);
        } else {
            System.out.println("Toodet: " + toode + " ei olegi ostukorvis.");
        }
    }

    public String votaTooted() {
        return tooted.toString();
    }

    public int votaToodeteArv() {
        return tooted.size();
    }

    public String votaKassapidajaNimi() {
        return kassapidajaNimi;
    }

    public void kliendilPoleRaha() {
        tooted.clear();
        System.out.println("Teie kaardi limiit on ületatud. Palun viige kõik tooted oma koha peale tagasi.");
    }
}
