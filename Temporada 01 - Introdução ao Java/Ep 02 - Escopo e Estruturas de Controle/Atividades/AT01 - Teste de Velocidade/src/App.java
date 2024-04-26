import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String veiculo01, veiculo02;
        int velocidade01, velocidade02;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o nome do primeiro veiculo: ");
        veiculo01 = leitor.nextLine();

        System.out.println("Informe a velocidade do primeiro veiculo: ");
        velocidade01 = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Informe o nome do segundo veiculo: ");
        veiculo02 = leitor.nextLine();

        System.out.println("Informe a velocidade do segundo veiculo: ");
        velocidade02 = leitor.nextInt();

        String veiculoMaisRapido = verificarVelocidade(velocidade01, velocidade02, veiculo01, veiculo02);
        System.out.println(veiculoMaisRapido);
    }

    public static String verificarVelocidade(int velocidade01, int velocidade02, String veiculo01, String veiculo02) {
        if (velocidade01 > velocidade02) {
            return "O veiculo de nome " + veiculo01 + " é mais rápido, com velocidade igual a " + velocidade01 + "km/h";
        } else if (velocidade01 < velocidade02) {
            return "O veiculo de nome " + veiculo02 + " é mais rápido, com velocidade igual a " + velocidade02 + "km/h";
        } else {
            return "Os veiculos possuem velocidades iguais";
        }
    }
}
