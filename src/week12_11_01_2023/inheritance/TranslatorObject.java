package week12_11_01_2023.inheritance;

public class TranslatorObject {
    public static void main(String[] args) {

        TranslatorAhmet ahmet = new TranslatorAhmet("Ahmet", "Arabic", "Albanian");

        System.out.println(ahmet.name);
        System.out.println(ahmet.language);
        System.out.println(ahmet.country);

        TranslatorKim park = new TranslatorKim("Kim", "English", "Turkish");

        System.out.println(park.name);
        System.out.println(park.language);
        System.out.println(park.country);

    }
}
