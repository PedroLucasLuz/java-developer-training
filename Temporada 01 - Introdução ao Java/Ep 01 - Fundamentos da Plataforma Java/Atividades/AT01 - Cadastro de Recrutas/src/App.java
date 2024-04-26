import java.util.Scanner;

public class App
{
	public static void main(String[] args) {
		
		String $PrimeiroNome, $SegundoNome, $CampoDeEstudo;
		int $AnoDeNascimento;
		
		Scanner Leitor = new Scanner(System.in);
		
        System.out.println("Informe seu Primeiro Nome: ");
        $PrimeiroNome = Leitor.nextLine();
        
        System.out.println("Informe seu Sobrenome: ");
        $SegundoNome = Leitor.nextLine();
        
        System.out.println("Informe seu Campo de Estudo: ");
        $CampoDeEstudo = Leitor.nextLine();
        
        System.out.println("Informe seu Ano de Nascimento: ");
        $AnoDeNascimento = Leitor.nextInt();
		
		int $Idade = calcularIdade($AnoDeNascimento);
		String $NomeCompleto = ExibirNomeCompleto($PrimeiroNome, $SegundoNome);
		
		System.out.println(mostrarDados($NomeCompleto, $CampoDeEstudo, $Idade));
	}
	
	public static int calcularIdade (int $AnoDeNascimento){
	    int $Idade = 2024 - $AnoDeNascimento;
	    return $Idade;
	}
	
	public static String ExibirNomeCompleto (String $PrimeiroNome, String $SegundoNome){
	    String $NomeCompleto = $PrimeiroNome + " " + $SegundoNome;
	    return $NomeCompleto;
	}
	
	public static String mostrarDados (String $NomeCompleto, String $CampoDeEstudo, int $Idade){
	    StringBuilder TextConcat = new StringBuilder();
	    TextConcat.append("---Informações do Recruta---\n")
	        .append("Nome: ").append($NomeCompleto).append("\n")
	        .append("Campo de Estudo: ").append($CampoDeEstudo).append("\n")
	        .append("Idade: ").append($Idade).append(" Anos\n");
	    return TextConcat.toString();
	}
}