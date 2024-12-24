package fundamentos;
import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!");
		
		System.out.println("Boa tarde!");
		System.out.println("Boa noite!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f\n", 12313.321);
		System.out.printf("Nome: %s", "Nicolas\n\n");
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobreNome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
//		System.out.println("Seu nome é " + nome + " " + sobreNome);
//		System.out.println("Sua idade é " + idade + " anos de idade");
		System.out.printf("%s %s tem %d de idade\n", nome, sobreNome, idade);
		
		entrada.close();
	}
}
