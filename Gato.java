package model;

public class Gato extends Animal {
    private boolean ehPeludo;

    public Gato(String nome, String raca, int idade, Cliente dono, boolean ehPeludo) {
        super(nome, raca, idade, dono);
        this.ehPeludo = ehPeludo;
    }

    @Override
    public String getTipoAnimal() {
        return "Gato";
    }

    // Getter & Setter específico
    public boolean isEhPeludo() { return ehPeludo; }
    public void setEhPeludo(boolean ehPeludo) { this.ehPeludo = ehPeludo; }
}