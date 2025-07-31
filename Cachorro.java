public class Cachorro extends Animal {
    private boolean temPeloLongo;

    public Cachorro(String nome, String raca, int idade, Cliente dono, boolean temPeloLongo) {
        super(nome, raca, idade, dono);
        this.temPeloLongo = temPeloLongo;
    }

    @Override
    public String getTipoAnimal() {
        return "Cachorro";
    }

    // Getter & Setter específico
    public boolean isTemPeloLongo() { return temPeloLongo; }
    public void setTemPeloLongo(boolean temPeloLongo) { this.temPeloLongo = temPeloLongo; }
}