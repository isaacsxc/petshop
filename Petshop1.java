import java.util.ArrayList;
import java.util.Scanner;

public class Petshop1 {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static ArrayList<Cachorro> cachorros = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n=== MENU PETSHOP ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Funcionário");
            System.out.println("3. Cadastrar Cachorro");
            System.out.println("4. Listar Clientes");
            System.out.println("5. Listar Funcionários");
            System.out.println("6. Listar Cachorros");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarFuncionario();
                    break;
                case 3:
                    cadastrarCachorro();
                    break;
                case 4:
                    listarClientes();
                    break;
                case 5:
                    listarFuncionarios();
                    break;
                case 6:
                    listarCachorros();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    // Métodos para cadastrar
    private static void cadastrarCliente() {
        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        Cliente cliente = new Cliente(nome, telefone, endereco);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private static void cadastrarFuncionario() {
        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Limpar buffer

        Funcionario funcionario = new Funcionario(nome, cargo, salario);
        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    private static void cadastrarCachorro() {
        System.out.print("Nome do cachorro: ");
        String nome = scanner.nextLine();
        System.out.print("Raça: ");
        String raca = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer
        System.out.print("Tipo de banho: ");
        String tipoBanho = scanner.nextLine();

        Cachorro cachorro = new Cachorro(nome, raca, idade, tipoBanho);
        cachorros.add(cachorro);
        System.out.println("Cachorro cadastrado com sucesso!");
    }

    // Métodos para listar
    private static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("\n=== LISTA DE CLIENTES ===");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    private static void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("\n=== LISTA DE FUNCIONÁRIOS ===");
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        }
    }

    private static void listarCachorros() {
        if (cachorros.isEmpty()) {
            System.out.println("Nenhum cachorro cadastrado.");
        } else {
            System.out.println("\n=== LISTA DE CACHORROS ===");
            for (Cachorro cachorro : cachorros) {
                System.out.println(cachorro);
            }
        }
    }
}