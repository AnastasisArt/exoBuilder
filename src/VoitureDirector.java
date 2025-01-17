public class VoitureDirector {
    public static Voiture make3008(){
        Voiture result = new Voiture.VoitureBuilder("3008", 2022).addOptions("Vitres teintées").addOptions("Ecran Tactile").build();
        return result;
    }
}
