public class VoitureDirector {
    public static Voiture make3008() {
        return new Voiture.VoitureBuilder("3008", 2022, ECouleur.Blanc, EType.Hybride).addOptions(EOption.Vitres_teintees).addOptions(EOption.Ecran_tactile).build();
    }

    public static Voiture make208() {
        return new Voiture.VoitureBuilder("208", 2021, ECouleur.Lilas, EType.Essence).addOptions(EOption.Sieges_cuir).addOptions(EOption.GPS).build();
    }
}

