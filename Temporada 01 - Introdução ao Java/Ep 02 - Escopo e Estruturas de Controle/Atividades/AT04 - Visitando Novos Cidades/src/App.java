import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner $leitor = new Scanner(System.in);

        System.out.println("Informe Seu Nome: ");
        String $nome = $leitor.nextLine();

        System.out.println("Já visitou alguma cidade? (Sim/Não): ");
        String $resposta = $leitor.nextLine();
        
        System.out.println(verificarCidades($resposta, $leitor));
    }

    public static String verificarCidades(String $resposta, Scanner $leitor) {
        int $contador = 0;
        StringBuilder $listaDeCidades = new StringBuilder();

        while ($resposta.equalsIgnoreCase("sim")) {
            System.out.println("Informe o nome da cidade: ");
            String $nomeDaCidade = $leitor.nextLine();
            $listaDeCidades.append("\n- ").append($nomeDaCidade);
            $contador++;

            System.out.println("Visitou alguma outra cidade?: ");
            $resposta = $leitor.nextLine();
        }

        StringBuilder TextConcat = new StringBuilder();
        TextConcat.append("Quantas cidades visitei? ").append($contador).append("\n")
                .append("Lista de cidades visitadas: ").append($listaDeCidades);

        return TextConcat.toString();
    }
}
