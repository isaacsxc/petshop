public class Gato extends Animal {


    public Gato(String nome, int idade, String raca, String dono) {
        super(nome, idade, raca, dono);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", raca='" + getRaca() + '\'' +
                ", dono='" + getDono() + '\'' +
                '}';
    }
}