package OOP;

import java.util.ArrayList;

/**
 * Siin failis kasutatakse objekti OOP.Seljakott, aga OOP.Seljakott klassi ei eksisteeri. Sinu ülesanne
 * on see luua. Pane tähele, et mitte ükski objekti muutuja ei tohi olla
 * kättesaadav objektist väljaspoolt.
 *
 * Käesolevat klassi ei tohi muuta! Arvad, et ei jää vahele? :)
 */
public class OOP_Seljakott {

    public static void main(String[] args) {

        String omanikuNimi = "Kihnu Virve";
        Seljakott kott = new Seljakott(omanikuNimi);

        kott.lisaAsi("Hambapasta");
        kott.lisaAsi("Hambahari");
        kott.lisaAsi("Pleier");
        kott.lisaAsi("Langevari");
        kott.lisaAsi("Kõrvaklapid");
        kott.eemaldaAsi("Langevari"); // Ah mis sellest ikka vedada, saab ilma ka

        System.out.println("Kotis on järgmised asjad: " + kott.misOnKotis());
        System.out.println("Asju on kotis nii mitu: " + kott.mituAsjaOnKotis());
        System.out.println("Omaniku nimi on: " + kott.omanikuNimi());

        kott.rebene(); // oh shit, mis nüüd saab?

        System.out.println("Kotis on järgmised asjad: " + kott.misOnKotis());
        System.out.println("Asju on kotis nii mitu: " + kott.mituAsjaOnKotis());
    }
}
