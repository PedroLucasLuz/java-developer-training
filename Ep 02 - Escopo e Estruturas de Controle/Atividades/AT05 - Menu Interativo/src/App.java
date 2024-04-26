import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner $Leitor = new Scanner(System.in);
        executarMenu($Leitor);
    }

    public static void executarMenu(Scanner $Leitor) {
        String $OpcaoEscolhida;
        do {
            System.out.println(apresentarMenu());
            $OpcaoEscolhida = $Leitor.nextLine();
            System.out.println(mostrarOpcao($OpcaoEscolhida));
        } while (!$OpcaoEscolhida.equals("5"));
    }

    public static String apresentarMenu() {
        StringBuilder textConcat = new StringBuilder();
        textConcat.append("Escolha uma Opção: \n" 
                        + "\nOpção 1 - Adicionar um item ao carrinho"
                        + "\nOpção 2 - Carrinho"
                        + "\nOpção 3 - Solicitar Cupom"
                        + "\nOpção 4 - Excluir um item do carrinho"
                        + "\nOpção 5 - Sair\n");
        return textConcat.toString();
    }

    public static String mostrarOpcao(String $OpcaoEscolhida) {
        switch ($OpcaoEscolhida) {
            case "1":
                return "Você deseja adicionar um item no carrinho!";
            case "2":
                return "Você deseja verificar os itens que estão dentro do carrinho!";
            case "3":
                return "Você deseja solicitar um cupom de desconto!";
            case "4":
                return "Você deseja excluir um item do carrinho!";
            case "5":
                return "Saindo. . .";
            default:
                return "Informe uma opção válida!";
        }
    }
}