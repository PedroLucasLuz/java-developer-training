import java.util.concurrent.ThreadLocalRandom;

public class App {
    private static final int MAX_TENTATIVAS = 3;
    private static final int MAX_CANDIDATOS_SELECIONADOS = 5;
    private static final double SALARIO_BASE = 2000.0;
    private static final String[] CANDIDATOS = {"Felipe", "Marcia", "Júlia", "Paulo", "Augusto", "Pedro", "Lucas"};

    public static void main(String[] args) {
        for (String candidato : CANDIDATOS) {
            entrandoEmContato(candidato);
        }

        imprimirSelecionados();
        selecaoDeCandidatos();
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        } while (continuarTentando && tentativasRealizadas < MAX_TENTATIVAS);

        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
    }

    static boolean atender() {
        return ThreadLocalRandom.current().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        System.out.println("Imprimindo a lista de candidatos selecionados");
        System.out.println("Forma abreviada de iteração");
        for (String candidato : CANDIDATOS) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoDeCandidatos() {
        System.out.println("Iniciando seleção de candidatos...");
        int candidatosSelecionados = 0;

        for (String candidato : CANDIDATOS) {
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if (SALARIO_BASE >= salarioPretendido && candidatosSelecionados < MAX_CANDIDATOS_SELECIONADOS) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}

