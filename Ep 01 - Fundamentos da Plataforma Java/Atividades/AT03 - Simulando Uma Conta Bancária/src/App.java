import java.util.Scanner;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {
        String $NomeDoCliente, $Agencia;
        int $NumeroDaConta;
        double Saldo;

        Scanner LeitorScanner = new Scanner(System.in);

        System.out.println("Informe o nome do cliente: ");
        $NomeDoCliente = LeitorScanner.nextLine();

        System.out.println("Informe o número da agencia: ");
        $Agencia = LeitorScanner.nextLine();

        System.out.println("Informe o número de conta:");
        $NumeroDaConta = LeitorScanner.nextInt();

        System.out.println("Informe seu saldo inicial: ");
        Saldo = LeitorScanner.nextDouble();

        LeitorScanner.close();

        String $Saldo = formatarSaldo(Saldo);

        System.out.println(TabelaComOsDados($Agencia, $NumeroDaConta, $NomeDoCliente, $Saldo));
        System.out.println(mensagem($Agencia, $NumeroDaConta, $NomeDoCliente, $Saldo));
    }

    private static String formatarSaldo(double Saldo) {
        DecimalFormat duasCasasDecimais = new DecimalFormat("#.00");
        return duasCasasDecimais.format(Saldo);
    }    

    public static String TabelaComOsDados(String $Agencia, int $NumeroDaConta, String $NomeDoCliente, String $Saldo) {
        StringBuilder TextConcat = new StringBuilder();
        TextConcat.append("Dados da conta:\n")
                .append("Nome Do Cliente: ").append($NomeDoCliente).append("\n")
                .append("Agência: ").append($Agencia).append("\n")
                .append("Número da conta: ").append($NumeroDaConta).append("\n")
                .append("Saldo : R$").append($Saldo).append("\n");
        return TextConcat.toString();
    }

    public static String mensagem(String $Agencia, int $NumeroDaConta, String $NomeDoCliente, String $Saldo){
        StringBuilder TextConcat = new StringBuilder();
        TextConcat.append("Olá ").append($NomeDoCliente)
            .append(", obrigado por criar uma conta em nosso banco, sua agência é ")
            .append($Agencia).append(", conta ").append($NumeroDaConta)
            .append(" e seu saldo R$").append($Saldo).append(" já está disponivel para saque.");
        return TextConcat.toString();
    }
}
