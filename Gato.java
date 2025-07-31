public class Gato extends Animal {
    private boolean ehIndependente;

    public Gato(String nome, int idade, String raca, String dono, boolean ehIndependente) {
        super(nome, idade, raca, dono);
        this.ehIndependente = ehIndependente;
    }

    public boolean isEhIndependente() {
        return ehIndependente;
    }

    public void setEhIndependente(boolean ehIndependente) {
        this.ehIndependente = ehIndependente;
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", raca='" + getRaca() + '\'' +
                ", dono='" + getDono() + '\'' +
                ", ehIndependente=" + ehIndependente +
                '}';
    }
}