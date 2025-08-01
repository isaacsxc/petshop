import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Funcionario> funcionarios = new ArrayList<>();
    private static List<Animal> animais = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        
        do {
            System.out.println("\n=== MENU PETSHOP ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Funcionário");
            System.out.println("3. Cadastrar Animal");
            System.out.println("4. Listar Clientes");
            System.out.println("5. Listar Funcionários");
            System.out.println("6. Listar Animais");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            switch(opcao) {
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
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        
        scanner.close();
    }

    private static void cadastrarCliente() {
        System.out.println("\nCadastro de Cliente");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        
        clientes.add(new Cliente(nome, cpf, telefone));
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void cadastrarFuncionario() {
        System.out.println("\nCadastro de Funcionário");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Limpar buffer
        
        funcionarios.add(new Funcionario(nome, cargo, salario));
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    private static void cadastrarAnimal() {
        System.out.println("\nCadastro de Animal");
        System.out.print("Tipo (1-Cachorro / 2-Gato): ");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer
        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer
        System.out.print("Raça: ");
        String raca = scanner.nextLine();
        System.out.print("Dono: ");
        String dono = scanner.nextLine();
        
        if (tipo == 1) {
            System.out.print("Tamanho (Pequeno/Médio/Grande): ");
            String tamanho = scanner.nextLine();
            animais.add(new Cachorro(nome, idade, raca, dono, tamanho));
        } else if (tipo == 2) {
            System.out.print("É independente? (true/false): ");
            boolean independente = scanner.nextBoolean();
            scanner.nextLine(); // Limpar buffer
            animais.add(new Gato(nome, idade, raca, dono));
        }
        
        System.out.println("Animal cadastrado com sucesso!");
    }

    private static void listarClientes() {
        System.out.println("\nLista de Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    private static void listarFuncionarios() {
        System.out.println("\nLista de Funcionários:");
        for (Funcionario func : funcionarios) {
            System.out.println(func);
        }
    }

    private static void listarAnimais() {
        System.out.println("\nLista de Animais:");
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }
}