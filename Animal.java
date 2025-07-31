public class Animal {
    private String nome;
    private int idade;
    private String raca;
    private String dono;

    public Animal(String nome, int idade, String raca, String dono) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.dono = dono;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", raca='" + raca + '\'' +
                ", dono='" + dono + '\'' +
                '}';
    }
}