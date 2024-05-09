import java.util.concurrent.ThreadLocalRandom;
public class App {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        imprimirSelecionados();

    }
    
    static void imprimirSelecionados(){
        String  [] $candidatos = {"Felipe", "Marcia", "Júlia", "Paulo", "Augusto", "Pedro", "Lucas"};
        System.out.println("Imprimindo a lista de candidatos selecionados");

        for (int i = 0; i < $candidatos.length ; i++) {
            System.out.println("O candidato de nº " + (i + 1) + " é " + $candidatos[i]);
        }

        System.out.println("Forma abreviada de iteração");

        for (String candidato : $candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
    static void selecaoDeCandidatos(){
        String  [] $candidatos = {"Felipe", "Marcia", "Júlia", "Paulo", "Augusto", "Pedro", "Lucas"};

        int $CandidatosSelecionados = 0;
        int $CandidatoAtual = 0;
        double $SalarioBase = 2000.0;
        while ($CandidatosSelecionados < 5 && $CandidatoAtual < $candidatos.length) {
            String $Candidato = $candidatos [$CandidatoAtual];
            double $SalarioPretendido = valorPretendido();

            System.out.println("O candidato " + $Candidato + " solicitou este valor de salário " + $SalarioPretendido);
            if ($SalarioBase >= $SalarioPretendido) {
                System.out.println("O candidato " + $Candidato + " foi selecionado para a vaga");
                $CandidatosSelecionados++;
            }
            $CandidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double $SalarioPretendido){
        double $SalarioBase = 2000.0;

        if ($SalarioBase > $SalarioPretendido){
            System.out.println("Ligar Para o Candidato");
        }else if ($SalarioBase == $SalarioPretendido){
            System.out.println("Ligar Para o Candidato Com Contra Proposta");
        }else {
            System.out.println("Aguardando o Resultado Dos Demais Candidatos");
        }
    }
}
