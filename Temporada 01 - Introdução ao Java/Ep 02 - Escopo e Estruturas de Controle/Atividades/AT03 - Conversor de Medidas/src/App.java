import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double $valorEmMetros;

        Scanner $scanner = new Scanner(System.in);

        System.out.println("Digite o valor em metros: ");
        $valorEmMetros = $scanner.nextDouble();

        int $opcao = apresentarMenu();
        double $resultado = calcularMedida($valorEmMetros, $opcao);

        System.out.println("O resultado é: " + $resultado + " unidades.");
    }

    public static int apresentarMenu() {

        int $opcao;

        Scanner $leitor = new Scanner(System.in);

        System.out.println("--- Escolha Uma Opção ---");
        System.out.println("Opção 1 - milímetro (mm)");
        System.out.println("Opção 2 - centímetro (cm)");
        System.out.println("Opção 3 - decímetro (dm)");
        System.out.println("Opção 4 - decâmetro (dam)");
        System.out.println("Opção 5 - hectômetro (hm)");
        System.out.println("Opção 6 - quilômetro (km)");

        $opcao = $leitor.nextInt();

        return $opcao;
    }

    public static double calcularMedida(double $valorEmMetros, int $opcao) {

        switch ($opcao) {
            case 1:
                // calcule metros para milímetro
                return $valorEmMetros * 1000;
            case 2:
                // calcule metros para centímetros
                return $valorEmMetros * 100;
            case 3:
                // calcule metros para decímetro
                return $valorEmMetros * 10;
            case 4:
                // calcule metros para decâmetro
                return $valorEmMetros / 10;
            case 5:
                // calcule metros para hectômetro
                return $valorEmMetros / 100;
            case 6:
                // calcule metros para quilômetro
                return $valorEmMetros / 1000;
            default:
                System.out.println("Opção Inválida!");
                return 0; // Ou outro valor para indicar uma opção inválida
        }
    }
}
