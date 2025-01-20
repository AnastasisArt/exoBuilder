import java.util.ArrayList;
public class Voiture {
    private String modele;
    private int annee;
    private ECouleur couleur;
    private EType type;
    private ArrayList<EOption> options;

    private Voiture(VoitureBuilder builder) {
        this.modele = builder.modele;
        this.annee = builder.annee;
        this.couleur = builder.couleur;
        this.type = builder.type;
        this.options = builder.options;
    }

    public String getModele() {
        return this.modele;
    }

    public ECouleur getCouleur(){
        return this.couleur;
    }

    public int getAnnee() {
        return this.annee;
    }

    public EType getType(){
        return this.type;
    }

    public ArrayList<EOption> getOptions() {
        return this.options;
    }

    public String toString() {
        String result = "";
        result += "Modèle : " + this.modele + ", ";
        result += "Couleur : " + this.couleur + ", ";
        result += "Année : " + this.annee + ", ";
        result += "Type : " + this.type + ", ";
        result += "Options: " + this.options;
        return result;
    }

    public static class VoitureBuilder implements IVoitureBuilder {
        private String modele = "Peugeot";
        private int annee = 1896;
        private ECouleur couleur;
        private EType type ;
        private ArrayList<EOption> options = new ArrayList<>();

        public VoitureBuilder(String modele, int annee, ECouleur couleur, EType type) {
            this.modele = modele;
            this.annee = annee;
            this.couleur = couleur;
            this.type = type;
        }

        public VoitureBuilder setCouleur (ECouleur couleur){
            this.couleur = couleur;
            return this;
        }

        public VoitureBuilder setType (EType type){
            this.type = type;
            return this;
        }

        public VoitureBuilder addOptions(EOption option) {
            this.options.add(option);
            return this;
        }

        public Voiture build() {
            return new Voiture(this);
        }
    }
}
