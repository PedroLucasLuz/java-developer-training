import java.util.*;

class Produto {
    private String nome;
    private double preco;
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }
}

class CarrinhoDeCompras {
    private List<Produto> itens;
    
    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }
    
    public void adicionarItem(Produto produto) {
        itens.add(produto);
    }
    
    public double calcularTotal() {
        double total = 0;
        for (Produto item : itens) {
            total += item.getPreco();
        }
        return total;
    }
    
    public void exibirItens() {
        for (Produto item : itens) {
            System.out.println(item.getNome() + ": R$" + item.getPreco());
        }
    }
}

public class SistemaDeCompras {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        
        while (true) {
            System.out.println("MENU:");
            System.out.println("1. Adicionar produto ao carrinho");
            System.out.println("2. Exibir itens no carrinho");
            System.out.println("3. Calcular total");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.next();
                    System.out.print("Preço do produto: ");
                    double preco = scanner.nextDouble();
                    carrinho.adicionarItem(new Produto(nome, preco));
                    break;
                case 2:
                    carrinho.exibirItens();
                    break;
                case 3:
                    System.out.println("Total: R$" + carrinho.calcularTotal());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}

