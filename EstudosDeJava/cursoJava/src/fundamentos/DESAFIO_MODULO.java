package fundamentos;
import java.util.Scanner;
// Section Challenge

public class DESAFIO_MODULO {
	public static void main(String[] args) {
		Scanner leituraDados = new Scanner(System.in);
		System.out.println("CALCULADORA\n");
		System.out.println("[ + ] -> ADIÇÃO\n[ - ] -> SUBTRAÇÃO\n[ * ] -> MULTIPLICAÇÃO\n"
				+ "[ / ] -> DIVISÃO\n[ % ] -> RESTO DA DIVISÃO\n");
		System.out.print("Informe o primeiro valor: ");
		String valor = leituraDados.nextLine().replace(",", ".");
		System.out.print("Informe o segundo valor: ");
		String valor2 = leituraDados.nextLine().replace(",", ".");
		
		// Conversion
		double valorDouble = Double.parseDouble(valor);
		double valor2Double = Double.parseDouble(valor2);
		
		System.out.print("Qual operação será feita (APENAS o sinal): ");
		String escOperacao = leituraDados.nextLine();
		
		leituraDados.close();
		
		boolean verificacaoSinalAdicao = escOperacao.equals("+");
		double calculoAdicao = valorDouble + valor2Double;
		String resultadoAdicao = verificacaoSinalAdicao ?
				"ADIÇÃO: " + valorDouble + " + " + valor2Double 
				+ " é igual a " + calculoAdicao:
				"SINAL INVÁLIDO";
		
		boolean verificacaoSinalSubtracao = escOperacao.equals("-");
		double calculoSubt = valorDouble - valor2Double;
		String resultadoSubt = verificacaoSinalSubtracao ?
				"SUBTRAÇÃO: " + valorDouble + " - " + valor2Double 
				+ " é igual a " + calculoSubt:
				"";
		
		boolean verificacaoSinalMultiplicacao = escOperacao.equals("*");
		double calculoMultiplicacao = valorDouble * valor2Double;
		String resultadoMulti = verificacaoSinalMultiplicacao ?
				"MULTIPLICAÇÃO: " + valorDouble + " * " + valor2Double 
				+ " é igual a " + calculoMultiplicacao:
				"";
		
		boolean verificacaoSinalDivisao = escOperacao.equals("/");
		double calculoDivisao = valorDouble / valor2Double;
		String resultadoDivisao = verificacaoSinalDivisao ?
				"DIVISÃO: " + valorDouble + " / " + valor2Double 
				+ " é igual a " + calculoDivisao:
				"";
		

		boolean verificacaoSinalModulo = escOperacao.equals("%");
		double calculoModulo = valorDouble % valor2Double;
		String resultadoModulo = verificacaoSinalModulo ?
				"Resultado do resto da divisão de " + valorDouble + " % " + valor2Double
				+ " é igual a " + calculoModulo:
				"";
		
		System.out.printf("%s", resultadoAdicao,"\n");
		System.out.printf("%s", resultadoSubt,"\n");
		System.out.printf("%s", resultadoMulti,"\n");
		System.out.printf("%s", resultadoDivisao,"\n");
		System.out.printf("%s", resultadoModulo);
	}
}
