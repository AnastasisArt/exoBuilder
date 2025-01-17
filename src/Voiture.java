import java.util.ArrayList;

public class Voiture {
    private String modele;
    private int annee;
    private ArrayList<String> options;

    private Voiture(VoitureBuilder builder) {
        this.modele = builder.modele;
        this.annee = builder.annee;
        this.options = builder.options;
    }

    public String getModele(){
        return this.modele;
    }

    public int getAnnee(){
        return this.annee;
    }

    public ArrayList<String> getOptions(){
        return this.options;
    }

    public String toString() {
        String result = "";
        result += "Modèle : " + this.modele + ", ";
        result += "Année : " + this.annee + ", ";
        result += "Options: " + this.options;
        return result;
    }

    public static class VoitureBuilder implements IVoitureBuilder {
        private String modele = "Peugeot";
        private int annee = 1896;
        private ArrayList<String> options = new ArrayList<>();

        public VoitureBuilder(String modele, int annee) {
            this.modele = modele;
            this.annee = annee;
        }

        public ArrayList<String> addOptions(String option) {
            this.options.add(option);
        }

        public Voiture build() {
            return new Voiture(this);
        }
    }
}
