package desafios;
// Conversion challenge

import java.util.Scanner;
public class Desafio02 {
	public static void main(String[] args) {
		Scanner leituraDados = new Scanner(System.in);
		
		System.out.print("Primeiro salário: ");
		String valor = leituraDados.nextLine().replace(",", ".");
		System.out.print("Segundo salário: ");
		String valor2 = leituraDados.nextLine().replace(",", ".");
		System.out.print("Terceiro salário: ");
		String valor3 = leituraDados.nextLine().replace(",", ".");
		
		leituraDados.close();
		
		double salario = Double.parseDouble(valor);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double mediaSalarios;
		mediaSalarios = (salario + salario2 + salario3) / 3;
		
		System.out.printf("A média do últimos três salários é de R$%.2f",
				mediaSalarios);
	}
}
