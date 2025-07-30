public class Cachorro {
    private String nome;
    private String raca;
    private int idade;
    private String tipoBanho;

    // Construtor
    public Cachorro(String nome, String raca, int idade, String tipoBanho) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.tipoBanho = tipoBanho;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipoBanho() {
        return tipoBanho;
    }

    public void setTipoBanho(String tipoBanho) {
        this.tipoBanho = tipoBanho;
    }

    @Override
    public String toString() {
        return "Cachorro: " + nome + " | Raça: " + raca + " | Idade: " + idade + " anos | Banho: " + tipoBanho;
    }
}