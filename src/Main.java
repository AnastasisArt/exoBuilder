public class Main {
    public static void main(String[] args) {
        Voiture voiture1 = VoitureDirector.make3008();
        Voiture voiture2 = VoitureDirector.make208();

        Voiture voiture3 = new Voiture.VoitureBuilder("Clio", 2020, ECouleur.Rose_bonbon, EType.Diesel)
                .addOptions(EOption.Toit_panoramique)
                .addOptions(EOption.GPS)
                .build();

        System.out.println(voiture1);
        System.out.println(voiture2);
        System.out.println(voiture3);
    }
}