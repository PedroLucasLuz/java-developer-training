import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String $PersonagemAtacante, $PersonagemDefensor;
        int $PdA, $PdV, $Armadura;
        String $Escudo;

        Scanner Leitor = new Scanner(System.in);

        System.out.println("Informe o nome do personagem atacante: ");
        $PersonagemAtacante = Leitor.nextLine();

        System.out.println("Informe seu poder de ataque (PdA): ");
        $PdA = Leitor.nextInt();
        Leitor.nextLine();

        System.out.println("Informe o nome do personagem defensor: ");
        $PersonagemDefensor = Leitor.nextLine();

        System.out.println("Informe a quantidade de pontos de vida (PdV): ");
        $PdV = Leitor.nextInt();

        System.out.println("Informe quanto de armadura ele possui: ");
        $Armadura = Leitor.nextInt();
        Leitor.nextLine();

        System.out.println("Seu personagem possui escudo? ( Sim / Não )");
        $Escudo = Leitor.nextLine().toUpperCase();

        if (!$Escudo.equalsIgnoreCase("Sim") && !$Escudo.equalsIgnoreCase("Não")) {
            System.out.println("Entrada inválida para o escudo. Por favor, use 'Sim' ou 'Não'.");
            return; // Encerra o programa se a entrada do escudo for inválida.
        }

        int $DanoCausado = calcularDano($PdA, $PdV, $Armadura, $Escudo);
        int $PdV_Atualizado = calcularVida($PdV, $DanoCausado);
        System.out.println(exibirDados($PersonagemAtacante, $PersonagemDefensor, $PdA, $PdV, $Armadura, $Escudo,
                $DanoCausado, $PdV_Atualizado));

    }

    public static int calcularDano(int $PdA, int $PdV, int $Armadura, String $Escudo) {
        int $DanoCausado;

        if ($PdA > $Armadura && $Escudo.equalsIgnoreCase("NÃO")) {
            $DanoCausado = $PdA - $Armadura;
        } else if ($PdA > $Armadura && $Escudo.equalsIgnoreCase("SIM")) {
            $DanoCausado = ($PdA - $Armadura) / 2;
        } else {
            $DanoCausado = 0;
        }

        return $DanoCausado;
    }

    public static int calcularVida(int $PdV, int $DanoCausado) {
        int $PdV_Atualizado = $PdV - $DanoCausado;
        return $PdV_Atualizado;
    }

    public static String exibirDados(String $PersonagemAtacante, String $PersonagemDefensor, int $PdA, int $PdV,
            int $Armadura, String $Escudo, int $DanoCausado, int $PdV_Atualizado) {
        StringBuilder TextConcat = new StringBuilder();

        TextConcat.append("--- Informações Gerais ---\n\n")
                .append("--- Atacante ---\n")
                .append("Nome do Atacante: ").append($PersonagemAtacante).append("\n")
                .append("PdA (Poder de Ataque): ").append($PdA).append("\n\n")
                .append("--- Defensor ---\n")
                .append("Nome do Defensor: ").append($PersonagemDefensor).append("\n")
                .append("PdV (Pontos de Vida): ").append($PdV).append("\n")
                .append("Armadura: ").append($Armadura).append("\n")
                .append("Possui Escudo? ").append($Escudo).append("\n")
                .append("Dano Causado: ").append($DanoCausado).append("\n")
                .append("Vida Atual: ").append($PdV_Atualizado).append("\n");
        return TextConcat.toString();
    }
}
