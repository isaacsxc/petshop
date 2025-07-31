public abstract class Animal {
    private String nome;
    private String raca;
    private int idade;
    private Cliente dono;

    public Animal(String nome, String raca, int idade, Cliente dono) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.dono = dono;
    }

    // Método abstrato (deve ser implementado pelas subclasses)
    public abstract String getTipoAnimal();

    // Getters & Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getRaca() { return raca; }
    public void setRaca(String raca) { this.raca = raca; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public Cliente getDono() { return dono; }
    public void setDono(Cliente dono) { this.dono = dono; }

    @Override
    public String toString() {
        return getTipoAnimal() + ": " + nome + " (" + raca + ") | Dono: " + dono.getNome();
    }
}