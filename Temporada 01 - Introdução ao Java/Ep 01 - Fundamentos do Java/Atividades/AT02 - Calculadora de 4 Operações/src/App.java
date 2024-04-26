import java.util.Scanner;

public class App
{
	public static void main(String[] args) {
		
		double $Num01, $Num02;
		
		Scanner Leitor = new Scanner(System.in);
		
		System.out.println("Informe o Primeiro Número: ");
		$Num01 = Leitor.nextDouble();
		
		System.out.println("Informe o Primeiro Número: ");
		$Num02 = Leitor.nextDouble();
		
		double $Somar = somar($Num01, $Num02);
		double $Subtrair = subitrair($Num01, $Num02);
		double $Dividir = dividir($Num01, $Num02);
		double $Multiplicar = multiplicar($Num01, $Num02);  
		
		System.out.println(exibirDados($Somar, $Subtrair, $Multiplicar, $Dividir, $Num01, $Num02));
	}
	
	public static double somar(double $Num01, double $Num02){
	    double $Somar = $Num01 + $Num02;
	    return $Somar;
	}
	
	public static double subitrair(double $Num01, double $Num02){
	   double $Subtrair = $Num01 - $Num02;
	    return $Subtrair;
	}
	
	public static double dividir(double $Num01, double $Num02){
	    double $Dividir = $Num01 / $Num02;
	    return $Dividir;
	}
	
	public static double multiplicar(double $Num01, double $Num02){
	    double $Multiplicar = $Num01 * $Num02;
	    return $Multiplicar;
	}
	
	public static String exibirDados (double $Somar, double $Subtrair, double $Multiplicar, double $Dividir, double $Num01, double $Num02){
	    StringBuilder TextConcat = new StringBuilder();
	    TextConcat.append("---Resultado das Operações---\n")
	        .append($Num01).append(" + ").append($Num02).append(" = ").append($Somar).append("\n")
	        .append($Num01).append(" - ").append($Num02).append(" = ").append($Subtrair).append("\n")
	        .append($Num01).append(" x ").append($Num02).append(" = ").append($Multiplicar).append("\n")
	        .append($Num01).append(" / ").append($Num02).append(" = ").append($Dividir).append("\n");
	    return TextConcat.toString();
	}
}
