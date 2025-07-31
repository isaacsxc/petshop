import model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static ArrayList<Animal> animais = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n=== PETSHOP ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Funcionário");
            System.out.println("3. Cadastrar Animal (Cachorro/Gato)");
            System.out.println("4. Listar Clientes");
            System.out.println("5. Listar Funcionários");
            System.out.println("6. Listar Animais");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarFuncionario();
                    break;
                case 3:
                    cadastrarAnimal();
                    break;
                case 4:
                    listarClientes();
                    break;
                case 5:
                    listarFuncionarios();
                    break;
                case 6:
                    listarAnimais();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    // (...) Métodos de cadastro de Cliente e Funcionário (iguais ao anterior)

    private static void cadastrarAnimal() {
        if (clientes.isEmpty()) {
            System.out.println("Cadastre um cliente primeiro!");
            return;
        }

        System.out.println("\nTipo de animal:");
        System.out.println("1. Cachorro");
        System.out.println("2. Gato");
        System.out.print("Escolha: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome do animal: ");
        String nome = scanner.nextLine();
        System.out.print("Raça: ");
        String raca = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        // Seleciona o dono (cliente)
        System.out.println("\nClientes cadastrados:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i).getNome());
        }
        System.out.print("Escolha o dono (número): ");
        int donoIdx = scanner.nextInt() - 1;
        scanner.nextLine();

        if (tipo == 1) { // Cachorro
            System.out.print("Tem pelo longo? (true/false): ");
            boolean temPeloLongo = scanner.nextBoolean();
            animais.add(new Cachorro(nome, raca, idade, clientes.get(donoIdx), temPeloLongo));
        } else { // Gato
            System.out.print("É peludo? (true/false): ");
            boolean ehPeludo = scanner.nextBoolean();
            animais.add(new Gato(nome, raca, idade, clientes.get(donoIdx), ehPeludo));
        }
        System.out.println("Animal cadastrado!");
    }

    private static void listarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        } else {
            System.out.println("\n=== ANIMAIS ===");
            for (Animal animal : animais) {
                System.out.println(animal);
            }
        }
    }
}