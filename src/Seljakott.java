import java.util.ArrayList;

/**
 * Created by maus on 24.01.2016.
 */
public class Seljakott {
    private ArrayList<String> kotiSisu = new ArrayList<>();
    private String asi;
    private String omanik;

    Seljakott(String omanikuNimi) {
        omanik = omanikuNimi;
    }

    public void lisaAsi(String asi) {
        kotiSisu.add(asi);
    }

    public void eemaldaAsi(String asi) {
        if (kotiSisu.contains(asi)) kotiSisu.remove(asi);
    }

    public String omanikuNimi() {
        return omanik;
    }

    public String mituAsjaOnKotis() {

        if (kotiSisu.size()!=0) {
            return String.valueOf(kotiSisu.size());
        } else
            return "Kott on tühi.";
    }

    public void rebene() {
        kotiSisu.clear();
        System.out.println("Kott ei pidanud vastu, asjad lendasid vastu maad.");
    }

    public String misOnKotis() {
        String asjadKotis = "";

        if (kotiSisu.size() != 0) {
            for (int i = 0; i < kotiSisu.size(); i++) {
                asjadKotis += kotiSisu.get(i);
                if (i == kotiSisu.size() - 1) asjadKotis += ".";
                else asjadKotis += ", ";
            }
            return asjadKotis;
        } else {
            asjadKotis = "Kotis ei ole mitte ühtegi asja.";
            return asjadKotis;
        }

    }
}
