public class Cachorro extends Animal {
    private String tamanho;

    public Cachorro(String nome, int idade, String raca, String dono, String tamanho) {
        super(nome, idade, raca, dono);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", raca='" + getRaca() + '\'' +
                ", dono='" + getDono() + '\'' +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }
}