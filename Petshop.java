import java.util.ArrayList;
import java.util.Scanner;

class Pessoa {
    private String nome;
    private String telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}

class Cliente extends Pessoa {
    private String endereco;

    public Cliente(String nome, String telefone, String endereco) {
        super(nome, telefone);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Cliente: " + getNome() + " | Tel: " + getTelefone() + " | End: " + endereco;
    }
}

class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String telefone, String cargo) {
        super(nome, telefone);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Funcionário: " + getNome() + " | Cargo: " + cargo + " | Tel: " + getTelefone();
    }
}

class Animal {
    private String nome;
    private String tipo;
    private String raca;
    private int idade;

    public Animal(String nome, String tipo, String raca, int idade) {
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return tipo + ": " + nome + " | Raça: " + raca + " | Idade: " + idade + " anos";
    }
}

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return nome + " | Preço: R$" + preco + " | Estoque: " + quantidade;
    }
}

public class Petshop {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private static ArrayList<Animal> animais = new ArrayList<>();
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n=== SISTEMA PETSHOP ===");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Cadastrar Funcionário");
            System.out.println("3. Cadastrar Animal");
            System.out.println("4. Cadastrar Produto");
            System.out.println("5. Listar Clientes");
            System.out.println("6. Listar Funcionários");
            System.out.println("7. Listar Animais");
            System.out.println("8. Listar Produtos");
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
                    cadastrarAnimal();
                    break;
                case 4:
                    cadastrarProduto();
                    break;
                case 5:
                    listarClientes();
                    break;
                case 6:
                    listarFuncionarios();
                    break;
                case 7:
                    listarAnimais();
                    break;
                case 8:
                    listarProdutos();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

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
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        Funcionario funcionario = new Funcionario(nome, telefone, cargo);
        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    private static void cadastrarAnimal() {
        System.out.print("Tipo (Cachorro/Gato): ");
        String tipo = scanner.nextLine();
        System.out.print("Nome do animal: ");
        String nome = scanner.nextLine();
        System.out.print("Raça: ");
        String raca = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        Animal animal = new Animal(nome, tipo, raca, idade);
        animais.add(animal);
        System.out.println("Animal cadastrado com sucesso!");
    }

    private static void cadastrarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("\n=== CLIENTES CADASTRADOS ===");
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    private static void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("\n=== FUNCIONÁRIOS CADASTRADOS ===");
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        }
    }

    private static void listarAnimais() {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
        } else {
            System.out.println("\n=== ANIMAIS CADASTRADOS ===");
            for (Animal animal : animais) {
                System.out.println(animal);
            }
        }
    }

    private static void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("\n=== PRODUTOS CADASTRADOS ===");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }
}