public interface IVoitureBuilder {
    public Voiture.VoitureBuilder setCouleur(ECouleur couleur);
    public Voiture.VoitureBuilder setType(EType type);
    public Voiture.VoitureBuilder addOptions(EOption option);
    public Voiture build();
}