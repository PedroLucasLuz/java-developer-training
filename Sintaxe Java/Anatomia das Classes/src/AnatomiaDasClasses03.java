public class AnatomiaDasClasses03 {
    public static void main(String[] args) {

        String primeiroNome = "Pedro Lucas";
        String segundoNome = "Luz";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
