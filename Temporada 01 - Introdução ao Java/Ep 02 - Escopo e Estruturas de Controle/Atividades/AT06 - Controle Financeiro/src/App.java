import java.util.Scanner;
import java.util.Locale;

public class App {

    public static void main(String[] args) {
        StringBuilder textoConcatenado = new StringBuilder();
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        double saldo = cadastrarUsuario(leitor);
        executarMenu(textoConcatenado, leitor, saldo);
        leitor.close(); // Fechar o scanner após o uso para evitar vazamentos de recursos
    }

    public static double cadastrarUsuario(Scanner leitor) {
        System.out.println("Informe seu saldo inicial: ");
        double saldo = leitor.nextDouble();
        leitor.nextLine(); // Limpar o buffer de entrada
        return saldo;
    }

    public static String apresentarMenu(StringBuilder textoConcatenado) {
        textoConcatenado.append("Bem vindo ao Banco Digital\n")
                .append("Opção 01 - Depositar\n")
                .append("Opção 02 - Sacar\n")
                .append("Opção 03 - Verificar Saldo\n")
                .append("Opção 04 - Sair\n")
                .append("Escolha uma opção: ");
        return textoConcatenado.toString();
    }

    public static void executarMenu(StringBuilder textoConcatenado, Scanner leitor, double saldo) {
        String opcaoEscolhida;
        do {
            System.out.println(apresentarMenu(textoConcatenado));
            opcaoEscolhida = leitor.nextLine();
            textoConcatenado.setLength(0); // Limpar o conteúdo do StringBuilder para cada iteração
            System.out.println(executarOpcoesDoMenu(opcaoEscolhida, leitor, saldo));
        } while (!opcaoEscolhida.equals("4"));
    }

    public static String executarOpcoesDoMenu(String opcaoEscolhida, Scanner leitor , double saldo) {
        switch (opcaoEscolhida) {
            case "1":
                System.out.println("Informe o valor que deseja depositar: ");
                double valorDoDeposito = leitor.nextDouble();
                saldo += valorDoDeposito;
                leitor.nextLine(); // Limpar o buffer de entrada
                return "Depósito realizado com sucesso. Saldo Atual: R$" + saldo;
            case "2":
                System.out.println("Informe o valor que deseja sacar: ");
                double valorDoSaque = leitor.nextDouble();
                return "Saque realizado com sucesso. Saldo Atual: R$" + saldo;
            case "3":
                return "Saldo: R$" + saldo;
            case "4":
                return "Saindo do programa...";
            default:
                return "Opção inválida. Tente novamente.";
        }
    }
}